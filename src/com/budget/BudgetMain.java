package com.budget;


import com.db.Db;

import java.sql.SQLException;

public class BudgetMain {

        public static void main(String[] args) throws SQLException {

        Db connect = new Db();
        connect.open();
        connect.SQL="SELECT * FROM CHAPTER";
        connect.result = connect.statement.executeQuery(connect.SQL);
            while (connect.result.next()){
                System.out.println(connect.result.getString("Name"));
            }
        connect.statement.close();

    }
}
