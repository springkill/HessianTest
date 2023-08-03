package com.springkill.HessianTest;

import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;

@ComponentScan
public interface Greeting {
    String say(HashMap o);
}
