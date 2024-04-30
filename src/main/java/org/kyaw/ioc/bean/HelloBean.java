/**
 * @Author : Kyaw Zaw Htet
 * @Date : 4/30/2024
 * @Time : 6:13 AM
 * @Project_Name : spring-framework
 */
package org.kyaw.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {

    public void greet(){
        System.out.println("Hello IoC Container.");
    }
}
