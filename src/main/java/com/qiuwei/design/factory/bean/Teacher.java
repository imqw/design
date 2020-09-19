package com.qiuwei.design.factory.bean;

/**
 * @Author: qiuweib@yonyou.com
 * @Date: 2020-09-18.
 */
public class Teacher implements Person{


    @Override
    public void name() {
        System.out.println("我是老师...");
    }

    @Override
    public void run() {

        System.out.println("我在教书...");
    }
}
