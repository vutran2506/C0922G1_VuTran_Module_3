package mvc_furama.model.customer;

import java.sql.Date;

public class Customer {
    private int id;
    private CustomerType customerTypeId;
    private int customerTypeIds;
    private String name;
    private java.sql.Date dateOfBirth;
    private boolean gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String address;

    public Customer() {
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Customer(int id, CustomerType customerTypeId, String name, java.sql.Date dateOfBirth, boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.id = id;
        this.customerTypeId = customerTypeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    public Customer(int id,int customerTypeIds , String name, java.sql.Date dateOfBirth, boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.id = id;
        this.customerTypeIds =customerTypeIds;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    public Customer( int customerTypeIds , String name, java.sql.Date dateOfBirth, boolean gender, String idCard, String phoneNumber, String email, String address) {
        this.customerTypeIds =customerTypeIds;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerTypeIds() {
        return customerTypeIds;
    }

    public void setCustomerTypeIds(int customerTypeIds) {
        this.customerTypeIds = customerTypeIds;
    }

    public CustomerType getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(CustomerType customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
