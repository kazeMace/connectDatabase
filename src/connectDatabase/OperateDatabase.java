package connectDatabase;
import java.sql.*;
public class OperateDatabase {
    private DBSettings dbSettings = new DBSettings();
    private String DB_URL = dbSettings.getDB_URL();
    private String JDBC_DRIVER = dbSettings.getJDBC_DRIVER();
    private String USERNAME = dbSettings.getUSERNAME();
    private String PASS = dbSettings.getPASS();
    private Connection conn = null;
    private Statement stmt = null;

//    public OperateDatabase(){
//    }

    public Connection getConnection(){
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("connect to database...");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASS);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

//    public Statement getStatement(Connection conn){
//        System.out.println("create Statement...");
//        try {
//            stmt = conn.createStatement();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return stmt;
//    }

    public static void close(Connection conn) {
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Statement stmt) {
        if (null != stmt) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs) {
        if (null != rs) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void sql(Statement stmt){
//        String sql_q = "select * from sbi_objects";
//        System.out.println(sql_q);
////        stmt = getStatement(this.conn);
//        try {
//            boolean ss = stmt.execute(sql_q);
//            System.out.println(ss);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }

}

