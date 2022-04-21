package com.github.jordannegreiros.abstractfactory.exemplo1;

import com.github.jordannegreiros.abstractfactory.exemplo1.factory.IPhone11Factory;
import com.github.jordannegreiros.abstractfactory.exemplo1.factory.IPhoneXFactory;
import com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory.BrazilianRulesAbstractFactory;
import com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory.CountryRulesAbstractFactory;
import com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory.USRulesAbstractFactory;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {

        CountryRulesAbstractFactory brazilRules = new BrazilianRulesAbstractFactory();
        CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();

        IPhone iPhone11BrazilRules = new IPhone11Factory(brazilRules).orderIPhone("standard");
        System.out.println(iPhone11BrazilRules);

        IPhone iPhone11USRules = new IPhone11Factory(usRules).orderIPhone("standard");
        System.out.println(iPhone11USRules);

        IPhone iPhone11ProBrazilRules = new IPhone11Factory(brazilRules).orderIPhone("highEnd");
        System.out.println(iPhone11ProBrazilRules);

        IPhone iPhone11ProUSRules = new IPhone11Factory(usRules).orderIPhone("highEnd");
        System.out.println(iPhone11ProUSRules);

        IPhone iPhoneXBrazilRules = new IPhoneXFactory(brazilRules).orderIPhone("standard");
        System.out.println(iPhoneXBrazilRules);

        IPhone iPhoneXUSRules = new IPhoneXFactory(usRules).orderIPhone("standard");
        System.out.println(iPhoneXUSRules);

        IPhone iPhone11XMaxPBrazilRules = new IPhoneXFactory(brazilRules).orderIPhone("highEnd");
        System.out.println(iPhone11XMaxPBrazilRules);

        IPhone iPhone11XMaxUSRules = new IPhoneXFactory(usRules).orderIPhone("highEnd");
        System.out.println(iPhone11XMaxUSRules);

    }
}
