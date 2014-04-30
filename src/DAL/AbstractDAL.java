/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Christian
 */
public class AbstractDAL {
    
    private final String database = "BrandOgRedning"; 
    private final String server = "10.249.84.2";
    private final String user = "user";
    private final String password = "pass";
    private SQLServerDataSource ds;
    Statement stmt;
    
    /**
     * Establishes connection to the database.
     */
    public AbstractDAL()
    {
        ds = new SQLServerDataSource();
        ds.setServerName(server);
        ds.setDatabaseName(database);
        ds.setUser(user);
        ds.setPassword(password);
    }
    
    protected Connection getConnection() throws SQLServerException
    {
        return ds.getConnection();
    }
}
