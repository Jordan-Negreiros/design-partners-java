package com.github.jordannegreiros.factorymethod.exemplo1.halfsimple;

import com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.factory.IPhone11Factory;
import com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.factory.IPhoneFactory;
import com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory iPhone11Factory = new IPhone11Factory();

        IPhone iphone11 = iPhone11Factory.orderIPhone("standard");
        System.out.println(iphone11);

        IPhone iPhone11Pro = iPhone11Factory.orderIPhone("highEnd");
        System.out.println(iPhone11Pro);
    }

}
