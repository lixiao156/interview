package com.interviewone;

import org.springframework.http.converter.json.GsonBuilderUtils;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/28 22:08
 */
public class InOrOurClass {
    public static void main(String[] args) {
        System.out.println("outclass");
    }

    int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    class inClass{
      int value = 10;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    static class StaticInClass{
        int incard = 12;

        public int getIncard() {
            return incard;
        }

        public void setIncard(int incard) {
            this.incard = incard;
        }
    }

}
