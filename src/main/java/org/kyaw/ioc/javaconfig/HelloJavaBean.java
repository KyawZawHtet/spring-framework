/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 2:15 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.ioc.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class HelloJavaBean {

    // Java Base Config
    // Create bean(Java API Class)
    // If Annotation base not enough => Java Base

    public void greet(){
        System.out.println("Hello Java Bean");
    }
}
