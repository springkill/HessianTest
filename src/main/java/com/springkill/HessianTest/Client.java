package com.springkill.HessianTest;

import com.caucho.hessian.client.HessianProxyFactory;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/hessian";

        HessianProxyFactory factory = new HessianProxyFactory();
        Greeting greeting = (Greeting) factory.create(Greeting.class, url);

        HashMap o = new HashMap();
        o.put("admin", "123");

        System.out.println("use method :" + greeting.say(o));
    }
}
