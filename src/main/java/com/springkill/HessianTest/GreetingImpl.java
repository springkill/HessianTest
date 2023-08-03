package com.springkill.HessianTest;

import com.caucho.hessian.server.HessianServlet;

import java.util.HashMap;

public class GreetingImpl extends HessianServlet implements Greeting {
    @Override
    public String say(HashMap o) {
        return "Hello, " + o.toString();
    }
}