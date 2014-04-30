/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Firemen;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author Lars Radoor
 */
public class TimeLogDAL extends AbstractDAL {
    
    
    public void timeRegister(String date, Firemen f, int role, int type, boolean holiday, Time loginTime, Time logoutTime) throws SQLException{
        
        Connection con = null;
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO midlertidig_løn (dato, brandmand, role, type_arbejde, ferie_dag, tid_logind, tid_logud) "
                            + "VALUES ('" + date + "', '" + f.getCpr() + "', " + role + ", " + type + ", " + holiday + ", " + loginTime + ", " + logoutTime + ")");
            stmt.executeUpdate("");
        } finally{
            if(con != null) con.close();
        }
    }
}
