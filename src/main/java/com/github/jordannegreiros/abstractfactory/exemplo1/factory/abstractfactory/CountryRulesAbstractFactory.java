package com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory;

import com.github.jordannegreiros.abstractfactory.exemplo1.model.certificate.Certificate;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();
    Packing getPacking();

}
