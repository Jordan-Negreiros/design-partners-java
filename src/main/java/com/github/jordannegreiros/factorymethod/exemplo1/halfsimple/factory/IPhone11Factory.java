package com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.factory;

import com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.model.IPhone;
import com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.model.IPhone11;
import com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone(String level) {

        if (level.equals("standard")) {
            return new IPhone11();
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro();
        } else {
            return null;
        }

    }
}
