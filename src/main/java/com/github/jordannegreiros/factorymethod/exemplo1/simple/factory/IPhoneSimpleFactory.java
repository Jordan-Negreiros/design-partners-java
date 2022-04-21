package com.github.jordannegreiros.factorymethod.exemplo1.simple.factory;

import com.github.jordannegreiros.factorymethod.exemplo1.simple.model.IPhone;
import com.github.jordannegreiros.factorymethod.exemplo1.simple.model.IPhone11;
import com.github.jordannegreiros.factorymethod.exemplo1.simple.model.IPhone11Pro;

public class IPhoneSimpleFactory {

    public static IPhone orderIPhone(String generation, String level) {
        IPhone device = null;

        if ("11".equals(generation)) {
            if ("standard".equals(level)) {
                device = new IPhone11();
            } else if ("highEnd".equals(level)) {
                device = new IPhone11Pro();
            }
        }

       if (device != null) {
           device.getHardware();
           device.assemble();
           device.certificates();
           device.pack();
       }

        return device;
    }

}
