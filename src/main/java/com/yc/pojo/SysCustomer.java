package com.yc.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SysCustomer {
    private Integer customerId;

    private String customerName;

    private Integer customerTel;

    private Long customerIdCard;

    private Integer level;

    private Date creatTime;

    private String notes;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(Integer customerTel) {
        this.customerTel = customerTel;
    }

    public Long getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(Long customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    public Date getCreatTime() {
        return creatTime;
    }
    
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}