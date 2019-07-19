package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
    private static final String DB_URL = "jdbc:h2:tcp://localhost:9092/~/test";
    private static final String DB_Driver = "org.h2.Driver";
    private static final String DB_USER = "sa";
    private static final String DB_PASS = "";
    private static Connection connection = null;
    public Statement statement = null;
    public ResultSet result = null;
    public String SQL = "";


    public void open(){
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            statement = connection.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
