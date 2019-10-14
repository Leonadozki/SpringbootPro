package com.leoTest.springboot_demoPro;
import com.leoTest.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * SpringBoot单元测试
 * */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Resource
    private Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}

