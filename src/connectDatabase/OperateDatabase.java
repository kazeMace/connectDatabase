package connectDatabase;
import java.sql.*;
public class OperateDatabase {
    private DBSettings dbSettings = new DBSettings();
    private String DB_URL = dbSettings.getDB_URL();
    private String JDBC_DRIVER = dbSettings.getJDBC_DRIVER();
    private String USERNAME = dbSettings.getUSERNAME();
    private String PASS = dbSettings.getPASS();
    private Connection conn = null;

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
    public Statement getStatement(Connection connection){
        PreparedStatement pstatement = null;
        try {
            pstatement = connection.prepareStatement("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pstatement;
    }
    public ResultSet getResuleSet(PreparedStatement pstatement){
        ResultSet rs = null;
        try {
            rs = pstatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void close(Connection conn) {
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(PreparedStatement pstatement) {
        if (null != pstatement) {
            try {
                pstatement.close();
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

    public String getUser_id(){
        return "";
    }

}

