package com.yxkj.springtest;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2018/3/19.
 */

public class SpringTest {
    @Test
    public  void test(){
        ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        User user = (User)context.getBean("user");
        user.add();
    }
}
