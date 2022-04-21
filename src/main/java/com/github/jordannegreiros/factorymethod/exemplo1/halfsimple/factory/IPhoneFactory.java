package com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.factory;

import com.github.jordannegreiros.factorymethod.exemplo1.halfsimple.model.IPhone;

public abstract class IPhoneFactory {

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
