package com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory;

import com.github.jordannegreiros.abstractfactory.exemplo1.model.certificate.Certificate;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.certificate.USCertificate;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.packing.Packing;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }

}
