package connectDatabase;

public class DBSettings {
    private final String HOST = "219.216.65.249";
    private final String PORT = "3306";
    private final String DATABASE = "spagobi";
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private String USERNAME = "root";
    private String PASS = "root";
    String getDB_URL(){
        return this.DB_URL;
    }
    String getJDBC_DRIVER(){
        return this.JDBC_DRIVER;
    }

    String getUSERNAME() {
        return this.USERNAME;
    }

    String getPASS() {
        return this.PASS;
    }
    public void setDB_URL(String DB_URL){
        this.DB_URL = DB_URL;
    }
    public void setJDBC_DRIVER(String JDBC_DRIVER){
        this.JDBC_DRIVER = JDBC_DRIVER;
    }
    public void setUSERNAME(String USERNAME){
        this.USERNAME = USERNAME;
    }
    public void setPASS(String PASS){
        this.PASS = PASS;
    }
}
