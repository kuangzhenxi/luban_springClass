package com.kzx.luban_spring_v1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        //spring容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(App.class);

        ac.getBean(X.class);
//        ac.getBean(Y.class);

    }

}
