package com.example.test_app_call;

public class InfoUser {

    private String rowName;
    private String rowDsc;
    private String rowPhone;
    private int rowImg;

    public InfoUser(String rowName, String rowDsc, String rowPhone, int rowImg) {
        this.rowName = rowName;
        this.rowDsc = rowDsc;
        this.rowPhone = rowPhone;
        this.rowImg = rowImg;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public String getRowDsc() {
        return rowDsc;
    }

    public void setRowDsc(String rowDsc) {
        this.rowDsc = rowDsc;
    }

    public String getRowPhone() {
        return rowPhone;
    }

    public void setRowPhone(String rowPhone) {
        this.rowPhone = rowPhone;
    }

    public int getRowImg() {
        return rowImg;
    }

    public void setRowImg(int rowImg) {
        this.rowImg = rowImg;
    }
}
