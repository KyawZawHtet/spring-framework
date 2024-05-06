/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 1:22 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.test;

import org.junit.jupiter.api.Test;
import org.kyaw.ioc.xmlconfig.HelloXMLBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloXMLTest {

    /*
    * GenericXmlApplicationContext() => default constructor => only one refresh();
    * GenericXmlApplicationContext("classpath: ") => constructor argument => not refresh();
    * ClassPathXmlApplicationContext() => default and argument => many refresh();
    * FileSystemXmlApplicationContext("context.xml")
    */

    @Test
    void demo(){
        try(var context = new GenericXmlApplicationContext("classpath:context.xml")){

            //context.load("classpath:context.xml");
            //context.refresh();

            var xmlBean = context.getBean(HelloXMLBean.class);
            xmlBean.greet();
        }
    }
}
