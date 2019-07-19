package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private static final String DB_URL = "jdbc:mysql://192.168.0.8:3306/Budgeting?serverTimezone=Europe/Moscow";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "esw1251yz";

    private Connection connection;
    //statement.execute("INSERT INTO `Budgeting`.`Chapter` (`NAME`) VALUES ('Ремонт и текущин расходы')")
    //int result = statement.executeUpdate("UPDATE Chapter SET NAME='Прочее1' WHERE id='7'");
    //ResultSet res = statement.executeQuery("SELECT * FROM Chapter");


    public Db(){
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
