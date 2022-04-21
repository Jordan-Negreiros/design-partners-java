package com.github.jordannegreiros.abstractfactory.exemplo1.factory.abstractfactory;

import com.github.jordannegreiros.abstractfactory.exemplo1.model.certificate.BrazilianCertificate;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.certificate.Certificate;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.packing.BrazilianPacking;
import com.github.jordannegreiros.abstractfactory.exemplo1.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }

}
