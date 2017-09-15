package com.yc.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SysOrder {
    private Integer orderId;

    private String customerName;

    private Integer customerTel;

    private String customerIdCard;

    private Integer roomTypeId;
    
    private Integer roomLevelId;

    private Date arriveTime;

    private String priority;

    private Integer state;

    private Date orderTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard == null ? null : customerIdCard.trim();
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Integer getRoomLevelId() {
        return roomLevelId;
    }

    public void setRoomLevelId(Integer roomLevelId) {
        this.roomLevelId = roomLevelId;
    }
    
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    public Date getArriveTime() {
        return arriveTime;
    }
    
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:dd", timezone = "GMT+8")
    public Date getOrderTime() {
        return orderTime;
    }
    
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:dd")
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

	@Override
	public String toString() {
		return "SysOrder [orderId=" + orderId + ", customerName=" + customerName + ", customerTel=" + customerTel
				+ ", customerIdCard=" + customerIdCard + ", roomTypeId=" + roomTypeId + ", roomLevelId=" + roomLevelId
				+ ", arriveTime=" + arriveTime + ", priority=" + priority + ", state=" + state + ", orderTime="
				+ orderTime + "]";
	}
    
    
}