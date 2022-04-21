package com.github.jordannegreiros.abstractfactory.exemplo1.factory;

import com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory.CountryRulesAbstractFactory;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhone;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhone11;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {
        if ("standard".equals(level)) {
            return new IPhone11(rules);
        } else if ("highEnd".equals(level)) {
            return new IPhone11Pro(rules);
        } else {
            return null;
        }
    }

}
