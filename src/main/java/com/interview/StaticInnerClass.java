package com.interview;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/12 22:57
 */
public class StaticInnerClass {
    public static void main(String[] args) {
         test r = new test();
         r.setId(10);
        System.out.println(r.id);
    }

    static class test{
        int id;
        String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
