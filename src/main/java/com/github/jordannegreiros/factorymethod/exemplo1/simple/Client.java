package com.github.jordannegreiros.factorymethod.exemplo1.simple;

import com.github.jordannegreiros.factorymethod.exemplo1.simple.factory.IPhoneSimpleFactory;
import com.github.jordannegreiros.factorymethod.exemplo1.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {

        IPhone iphone11 = IPhoneSimpleFactory.orderIPhone("11", "standard");
        System.out.println(iphone11);

        IPhone iPhone11Pro = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
        System.out.println(iPhone11Pro);
    }

}
