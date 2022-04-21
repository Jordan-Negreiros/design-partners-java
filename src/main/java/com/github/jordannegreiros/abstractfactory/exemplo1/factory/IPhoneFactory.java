package com.github.jordannegreiros.abstractfactory.exemplo1.factory;

import com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory.CountryRulesAbstractFactory;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.iphone.IPhone;

public abstract class IPhoneFactory {

    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public IPhone orderIPhone(String level) {
        IPhone device;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
