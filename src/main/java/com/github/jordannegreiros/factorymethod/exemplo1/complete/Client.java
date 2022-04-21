package com.github.jordannegreiros.factorymethod.exemplo1.complete;

import com.github.jordannegreiros.factorymethod.exemplo1.complete.factory.IPhone11Factory;
import com.github.jordannegreiros.factorymethod.exemplo1.complete.factory.IPhone11ProFactory;
import com.github.jordannegreiros.factorymethod.exemplo1.complete.factory.IPhoneFactory;
import com.github.jordannegreiros.factorymethod.exemplo1.complete.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory iPhone11Factory = new IPhone11Factory();
        IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();

        IPhone iphone11 = iPhone11Factory.orderIPhone();
        System.out.println(iphone11);

        IPhone iPhone11Pro = iphone11ProFactory.orderIPhone();
        System.out.println(iPhone11Pro);
    }

}
