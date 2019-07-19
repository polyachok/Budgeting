package com.budget;


import com.db.Db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BudgetMain {

        public static void main(String[] args) throws SQLException {
            Db dbConnect = new Db();
            String query = "select * from Chapter";
            try {
                Statement statement = dbConnect.getConnection().createStatement();
                ResultSet result = statement.executeQuery(query);
                while (result.next()){
                    Chapter chapter = new Chapter();
                    chapter.setId(result.getInt(1));
                    chapter.setName(result.getString("Name"));
                    System.out.println(chapter);
                }


            }catch (SQLException e){
                e.printStackTrace();
            }

    }
}
