package com.kzx.luban_spring_v1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Y {

    public Y() {
        System.out.println("Y...");
    }
}
