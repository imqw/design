package com.qiuwei.design.factory.bean;

/**
 * 学生
 *
 * @Author: qiuweib@yonyou.com
 * @Date: 2020-09-18.
 */
public class Student implements Person {
    @Override
    public void name() {
        System.out.println("我是学生...");
    }

    @Override
    public void run() {

        System.out.println("我在学习...");
    }
}

