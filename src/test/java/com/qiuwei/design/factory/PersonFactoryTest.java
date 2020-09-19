package com.qiuwei.design.factory;

import com.qiuwei.design.factory.bean.Person;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: qiuweib@yonyou.com
 * @Date: 2020-09-19.
 */
@SpringBootTest
public class PersonFactoryTest {


    @Test
    public void getPerson() {
        Person person = PersonFactory.getPerson("1");
        person.name();
        person.run();

        person = PersonFactory.getPerson("2");
        person.name();
        person.run();

        person = PersonFactory.getPerson("3");
        person.name();
        person.run();
    }
}