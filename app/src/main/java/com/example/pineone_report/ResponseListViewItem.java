package com.example.pineone_report;

public class ResponseListViewItem {

    String parameter;
    String value;
    String remark;

    public ResponseListViewItem(String parameter, String value, String remark) {
        this.parameter = parameter;
        this.value = value;
        this.remark = remark;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
