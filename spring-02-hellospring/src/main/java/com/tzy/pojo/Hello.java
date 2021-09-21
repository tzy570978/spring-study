package com.tzy.pojo;

/**
 * @author : lipu@csii.com.cn
 * @description :
 * @date 2021/9/21 上午10:41
 */
public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
