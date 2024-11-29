package com.Rest.API.REST.API.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity   // Marks the class as a JPA entity
@Table(name = "cloud_vendor_info")  // Specifies the table name in the database
public class CloudVendor {

    // Define Attributes
    @Id // Specifies the primary key for the entity
    private String vendorId;  // Vendor ID, typically a unique identifier

    private String vendorName;  // Vendor Name
    private String vendorAddress;  // Vendor Address
    private String vendorPhoneNumber;  // Vendor Phone Number

    // Default constructor
    public CloudVendor() {
        super();
    }

    // Parameterized constructor
    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    // Getter and Setter methods
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    // toString method for debugging and logging
    @Override
    public String toString() {
        return "CloudVendor{" +
                "vendorId='" + vendorId + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", vendorAddress='" + vendorAddress + '\'' +
                ", vendorPhoneNumber='" + vendorPhoneNumber + '\'' +
                '}';
    }
}
