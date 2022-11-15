package com.org.InventoryManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getByEngg() {
        return byEngg;
    }

    public void setByEngg(String byEngg) {
        this.byEngg = byEngg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Id
    @Column(name="quantity")
    Integer quantity;

    @Column(name="HW_name")
    String hardwareName;

    @Column(name="Doc_No")
    String docNumber;

    @Column(name="Inventory_No")
    String inventoryNumber;

    @Column(name="m_date")
    String mDate;

    @Column(name="Department")
    String department;

    @Column(name="By_Engg")
    String byEngg;

    @Column(name="content")
    String content;

}
