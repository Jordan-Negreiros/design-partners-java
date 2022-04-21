package com.github.jordannegreiros.factorymethod.exemplo2;

import com.github.jordannegreiros.factorymethod.exemplo2.db.DB;
import com.github.jordannegreiros.factorymethod.exemplo2.factory.OracleFactory;
import com.github.jordannegreiros.factorymethod.exemplo2.factory.PostgresFactory;

public class Client {

    public static void main(String[] args) {
        DB oracleDB = new OracleFactory().getDataBase();
        DB postgresDB = new PostgresFactory().getDataBase();

        oracleDB.query("select * from TABELA");
        oracleDB.update("update nome = \"jordan\" from TABELA where ID = 1");

        postgresDB.query("select * from TABELA");
        postgresDB.update("update nome = \"jordan\" from TABELA where ID = 1");
    }

}
