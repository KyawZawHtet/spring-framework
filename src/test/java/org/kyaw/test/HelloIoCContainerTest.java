/**
 * @Author : Kyaw Zaw Htet
 * @Date : 4/30/2024
 * @Time : 6:15 AM
 * @Project_Name : spring-framework
 */
package org.kyaw.test;

import org.junit.jupiter.api.Test;
import org.kyaw.ioc.bean.HelloBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloIoCContainerTest {

    @Test
    void demo(){
        try(var context = new AnnotationConfigApplicationContext()){
            context.scan("org.kyaw.ioc.bean");
            context.refresh();

            var bean = context.getBean(HelloBean.class);
            bean.greet();
        }
    }
}
