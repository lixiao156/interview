package com.interview;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/3 17:29
 */
public class JSONUtil {
        /**
         * 将json转化为实体POJO
         * @param jsonStr
         * @param obj
         * @return
         */
        public static<T> Object JSONToObj(String jsonStr,Class<T> obj) {
            T t = null;
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                t = objectMapper.readValue(jsonStr,
                        obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return t;
        }
        /**
         * 将实体POJO转化为JSON
         * @param obj
         * @return
         * @throws JSONException
         * @throws IOException
         */
        public static<T> JSONObject objectToJson(T obj) throws JSONException, IOException {
            ObjectMapper mapper = new ObjectMapper();
// Convert object to JSON string
            String jsonStr = "";
            try {
                jsonStr = mapper.writeValueAsString(obj);
            } catch (IOException e) {
                throw e;
            }
            return new JSONObject(jsonStr);
        }
        public static void main(String[] args) throws JSONException, IOException {
            JSONObject obj = null;
            obj = new JSONObject();
            obj.put("name", "213");
            obj.put("age", 27);
            JSONArray array = new JSONArray();
            array.put(obj);
            obj = new JSONObject();
            obj.put("name", "214");
            obj.put("age", 28);
            array.put(obj);
            Student stu = (Student) JSONToObj(obj.toString(), Student.class);
            JSONObject objList = new JSONObject();
            objList.put("student", array);
            System.out.println("objList:"+objList);
            StudentList stuList = (StudentList) JSONToObj(objList.toString(), StudentList.class);
            System.out.println("student:"+stu);
            System.out.println("stuList:"+stuList);
            System.out.println("#####################################");
            JSONObject getObj = objectToJson(stu);
            System.out.println(getObj);
        }

}
