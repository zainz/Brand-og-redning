/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;

/**
 *
 * @author Nicolai
 */
public class Firemen {
    
    String cpr, firstname, lastname, address, phone, callnumber, paymentnumber, portait;
    
    public Firemen(String cpr, String firstname, String lastname, String address, String phone, String callnumber, String paymentnumber, String portait){
        this.cpr = cpr;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.callnumber = callnumber;
        this.paymentnumber = paymentnumber;
        this.portait = portait;
    }

    public Firemen(String cpr, String firstname, String lastname, String address, String phone, String callnumber, String paymentnumber) {
        this.cpr = cpr;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.callnumber = callnumber;
        this.paymentnumber = paymentnumber;
    }
    
    
    
    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCallnumber() {
        return callnumber;
    }

    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber;
    }

    public String getPaymentnumber() {
        return paymentnumber;
    }

    public void setPaymentnumber(String paymentnumber) {
        this.paymentnumber = paymentnumber;
    }

    public String getPortait() {
        return portait;
    }

    public void setPortait(String portait) {
        this.portait = portait;
    }
    
    
    
}
