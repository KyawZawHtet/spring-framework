/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 2:20 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.ioc.config;

import org.kyaw.ioc.javaconfig.HelloJavaBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = "org.kyaw.ioc.javaconfig")
public class MyAppConfig {
    @Bean
    Date currentDate(){
        return new Date();
    }
}
