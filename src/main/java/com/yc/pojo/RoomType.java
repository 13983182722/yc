package com.yc.pojo;

public class RoomType {
    private Integer roomTypeId;

    private String roomTypeName;

    private Double roomPrice;

    private Double roomWeekendPrice;

    private Integer bedNum;

    private String notes;

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName == null ? null : roomTypeName.trim();
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Double getRoomWeekendPrice() {
        return roomWeekendPrice;
    }

    public void setRoomWeekendPrice(Double roomWeekendPrice) {
        this.roomWeekendPrice = roomWeekendPrice;
    }

    public Integer getBedNum() {
        return bedNum;
    }

    public void setBedNum(Integer bedNum) {
        this.bedNum = bedNum;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}