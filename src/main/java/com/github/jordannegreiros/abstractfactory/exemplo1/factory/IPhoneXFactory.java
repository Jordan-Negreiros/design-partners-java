package com.github.jordannegreiros.abstractfactory.exemplo1.factory;

import com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory.CountryRulesAbstractFactory;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhone;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhoneX;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {
        if("standard".equals(level)) {
            return new IPhoneX(rules);
        } else if("highEnd".equals(level)) {
            return new IPhoneXSMax(rules);
        } else return null;
    }
}
