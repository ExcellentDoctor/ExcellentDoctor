package com.tpkd.common.pojo;

public class Department {
    private int departmentId;
    private String departmentName;
    private int parentId;
    private String departmentMessage;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getDepartmentMessage() {
        return departmentMessage;
    }

    public void setDepartmentMessage(String departmentMessage) {
        this.departmentMessage = departmentMessage;
    }
}
