/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 3:05 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.ioc.beans;

public class MyClientFactoryBean {

    public MyClient getBean(){
        return new MyClient();
    }
}
