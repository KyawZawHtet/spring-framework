/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/6/2024
 * @Time : 3:03 PM
 * @Project_Name : spring-framework
 */
package org.kyaw.ioc.beans;

public class MyClientFactory {

    public static MyClient create(){
        return new MyClient();
    }
}
