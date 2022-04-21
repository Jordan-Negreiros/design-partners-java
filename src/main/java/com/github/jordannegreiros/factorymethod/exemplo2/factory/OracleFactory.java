package com.github.jordannegreiros.factorymethod.exemplo2.factory;

import com.github.jordannegreiros.factorymethod.exemplo2.db.DB;
import com.github.jordannegreiros.factorymethod.exemplo2.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDataBase() {
        return new OracleDB();
    }
}
