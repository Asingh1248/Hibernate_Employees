package POJOS;
// Generated 6 Oct, 2018 4:38:21 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Address generated by hbm2java
 */
public class Address  implements java.io.Serializable {


     private int addressid;
     private String streetName;
     private String cityName;
     private String stateName;
     private String zipCode;
     private Set employees = new HashSet(0);

    public Address() {
    }

	
    public Address(int addressid) {
        this.addressid = addressid;
    }
    public Address(int addressid, String streetName, String cityName, String stateName, String zipCode, Set employees) {
       this.addressid = addressid;
       this.streetName = streetName;
       this.cityName = cityName;
       this.stateName = stateName;
       this.zipCode = zipCode;
       this.employees = employees;
    }
   
    public int getAddressid() {
        return this.addressid;
    }
    
    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }
    public String getStreetName() {
        return this.streetName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getStateName() {
        return this.stateName;
    }
    
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }




}


