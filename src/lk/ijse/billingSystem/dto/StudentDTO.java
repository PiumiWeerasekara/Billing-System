/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dto;

/**
 *
 * @author DEll
 */
public class StudentDTO extends SuperDTO {

    private String name;
    private String nic;
    private String address;
    private String telephone;
    private String email;
    private String dob;
    private String gender;
    private String school;
    private String higherQulification;
    private String rid;

    public StudentDTO() {
    }

    public StudentDTO(String name, String nic, String address, String telephone, String email, String dob, String gender, String school, String higherQulification, String rid) {
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.school = school;
        this.higherQulification = higherQulification;
        this.rid = rid;
    }

    public StudentDTO(String name, String rid) {
        this.name = name;
        this.rid = rid;
    }

    public StudentDTO(String name, String nic, String telephone) {
        this.name = name;
        this.nic = nic;
        this.telephone = telephone;

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the higherQulification
     */
    public String getHigherQulification() {
        return higherQulification;
    }

    /**
     * @param higherQulification the higherQulification to set
     */
    public void setHigherQulification(String higherQulification) {
        this.higherQulification = higherQulification;
    }

    /**
     * @return the rid
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

}
