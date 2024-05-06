/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 1:53 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.ioc.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class HelloAnnotationBean {

    public void greet(){
        System.out.println("Hello Annotation Bean");
    }
}
