package com.tzy.pojo;

/**
 * @author : lipu@csii.com.cn
 * @description :
 * @date 2021/9/21 上午11:42
 */
public class Student {
    private String name;

    public Student() {
        System.out.println("Student被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println("name: "+name);
    }
}
