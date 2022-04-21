package com.github.jordannegreiros.factorymethod.exemplo1.complete.factory;

import com.github.jordannegreiros.factorymethod.exemplo1.complete.model.IPhone;
import com.github.jordannegreiros.factorymethod.exemplo1.complete.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
