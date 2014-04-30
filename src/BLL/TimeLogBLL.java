/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Firemen;
import DAL.TimeLogDAL;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Lars Radoor
 */
public class TimeLogBLL {
    
    TimeLogDAL tl = new TimeLogDAL();
    
    public void timeRegister(Firemen f, int type, int role, boolean holiday, Time loginTime) throws SQLException{
        
        Time logoutTime = Time.valueOf(String.valueOf(new Timestamp(System.currentTimeMillis())));
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        
        tl.timeRegister(dateFormat.format(date), f, role, type, holiday, loginTime, logoutTime);
    }
    
    public ArrayList<Firemen> getFiremen() throws SQLException{
        return tl.getFiremen();
    }
}

    