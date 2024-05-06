/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 2:40 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.test;

import org.junit.jupiter.api.Test;
import org.kyaw.ioc.config.MyAppConfig;
import org.kyaw.ioc.javaconfig.HelloJavaBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class HelloJavaTest {

    @Test
    void demo(){
        try(var context = new AnnotationConfigApplicationContext(MyAppConfig.class)){
            var bean = context.getBean(HelloJavaBean.class);
            bean.greet();

            var date = context.getBean(Date.class);
            System.out.println(date);
        }
    }
}
