package com.example.idms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column(nullable = false)
    private String contractSalesPrice; 
    private String acctType;            
    private String salesGroupPerson1ID; 
    private String contractDate;        
    private String collateralStockNumber; 
    private String collateralYearModel;  
    private String collateralMake;      
    private String collateralModel;     
    private String borrower1FirstName; 
    private String borrower1LastName;   
    private String acctID;              

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractSalesPrice() {
        return contractSalesPrice;
    }

    public void setContractSalesPrice(String contractSalesPrice) {
        this.contractSalesPrice = contractSalesPrice;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getSalesGroupPerson1ID() {
        return salesGroupPerson1ID;
    }

    public void setSalesGroupPerson1ID(String salesGroupPerson1ID) {
        this.salesGroupPerson1ID = salesGroupPerson1ID;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getCollateralStockNumber() {
        return collateralStockNumber;
    }

    public void setCollateralStockNumber(String collateralStockNumber) {
        this.collateralStockNumber = collateralStockNumber;
    }

    public String getCollateralYearModel() {
        return collateralYearModel;
    }

    public void setCollateralYearModel(String collateralYearModel) {
        this.collateralYearModel = collateralYearModel;
    }

    public String getCollateralMake() {
        return collateralMake;
    }

    public void setCollateralMake(String collateralMake) {
        this.collateralMake = collateralMake;
    }

    public String getCollateralModel() {
        return collateralModel;
    }

    public void setCollateralModel(String collateralModel) {
        this.collateralModel = collateralModel;
    }

    public String getBorrower1FirstName() {
        return borrower1FirstName;
    }

    public void setBorrower1FirstName(String borrower1FirstName) {
        this.borrower1FirstName = borrower1FirstName;
    }

    public String getBorrower1LastName() {
        return borrower1LastName;
    }

    public void setBorrower1LastName(String borrower1LastName) {
        this.borrower1LastName = borrower1LastName;
    }

    public String getAcctID() {
        return acctID;
    }

    public void setAcctID(String acctID) {
        this.acctID = acctID;
    }
}
