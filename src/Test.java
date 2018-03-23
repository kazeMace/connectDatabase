import connectDatabase.OperateDatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String args[]) throws SQLException {
        OperateDatabase operateDatabase = new OperateDatabase();
        Connection conn = operateDatabase.getConnection();

        Statement stmt = conn.createStatement();
        ResultSet ss = stmt.executeQuery("select * from sbi_name_mapping;");
//        System.out.println(ss);
        while (ss.next()){
            System.out.println(ss.getString("zhName"));
        }
    }

}

