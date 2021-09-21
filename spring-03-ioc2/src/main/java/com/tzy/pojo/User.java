package com.tzy.pojo;

/**
 * @author : lipu@csii.com.cn
 * @description :
 * @date 2021/9/21 上午11:22
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
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
