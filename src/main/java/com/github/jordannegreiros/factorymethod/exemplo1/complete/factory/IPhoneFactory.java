package com.github.jordannegreiros.factorymethod.exemplo1.complete.factory;

import com.github.jordannegreiros.factorymethod.exemplo1.complete.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone() {
        IPhone device;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}
