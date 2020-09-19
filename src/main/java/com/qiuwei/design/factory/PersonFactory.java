package com.qiuwei.design.factory;

import com.qiuwei.design.factory.bean.Person;
import com.qiuwei.design.factory.bean.Sporter;
import com.qiuwei.design.factory.bean.Student;
import com.qiuwei.design.factory.bean.Teacher;

/**
 * 人类工厂
 *
 * @Author: qiuweib@yonyou.com
 * @Date: 2020-09-18.
 */
public class PersonFactory {


    public static Person getPerson(String type) {
        Person person = null;

        switch (type) {
            case "1":
                person = new Student();
                break;
            case "2":
                person = new Teacher();
                break;
            case "3":
                person = new Sporter();
                break;
            default:
                break;
        }
        return person;

    }

}
