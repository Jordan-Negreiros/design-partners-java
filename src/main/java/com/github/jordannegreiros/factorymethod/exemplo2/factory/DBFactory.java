package com.github.jordannegreiros.factorymethod.exemplo2.factory;

import com.github.jordannegreiros.factorymethod.exemplo2.db.DB;

public interface DBFactory {

    DB getDataBase();

}
