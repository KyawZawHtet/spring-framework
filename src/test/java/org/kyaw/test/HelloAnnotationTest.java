/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 1:56 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.test;

import org.junit.jupiter.api.Test;
import org.kyaw.ioc.annotationconfig.HelloAnnotationBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloAnnotationTest {

    @Test
    void demo(){
        try(var context = new ClassPathXmlApplicationContext("annotation-context.xml")){

            // direct register bean class
            // context.registerBean(HelloAnnotationBean.class);
            // context.refresh();

            // scan package
            // context.scan("org.kyaw.ioc.annotationconfig");
            // context.refresh();


            context.refresh();
            var bean = context.getBean(HelloAnnotationBean.class);
            bean.greet();
        }
    }
}
