package Practise.JDBC;

import java.sql.*;

public class JdbcEg {


    private static final String USER = "root";
    private static final String PASSWORD = "rohit123";
    private static final String URL = "jdbc:mysql://localhost:3306/libsystem";

    public static void main(String[] args) {


        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query1 = "select * from book";
            String query2 = "insert into book values (7, 'Demo title', 'Demo Author') ";
            String query3 = "delete from book where BookID= 7"; // 1 row effected
            String query4 = "update book set BookName = 'Bhagavad geeta', Author= 'Shri Krishna' where BookID = 6"; // 1 row effected


            Statement s1 = conn.createStatement();
            ResultSet res = s1.executeQuery(query1);

//            int res2 = s1.executeUpdate(query2);
            int res3 = s1.executeUpdate(query4);

            System.out.println(res3);
//            while (res.next()) {
//                int id = res.getInt("BookID");
//                String title = res.getString("BookName");
//                String author = res.getString("Author");
//                System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
//                res.close();
//            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }


    }
}
