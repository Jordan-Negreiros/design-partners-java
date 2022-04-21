package com.github.jordannegreiros.factorymethod.exemplo1.complete.factory;

import com.github.jordannegreiros.factorymethod.exemplo1.complete.model.IPhone;
import com.github.jordannegreiros.factorymethod.exemplo1.complete.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
