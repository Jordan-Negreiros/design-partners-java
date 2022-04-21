package com.github.jordannegreiros.abstractfactory.exemplo1.model.certificate;

public class BrazilianCertificate implements Certificate {

	public String applyCertification() {
		return "\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp";
	}

}
