package com.tpkd.common.pojo;
//``orderId``doctorId``userId``totilPrice``serviceId``payment``STATUS``
public class Order {
    //订单id
    private int orderId;
    //医院id
    private int doctorId;
    //用户id
    private int userId;
    //总价格
    private int totilPrice;
    //服务id
    private int serviceId;
    //支付方式
    private int payment;
    //状态
    private int status;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotilPrice() {
        return totilPrice;
    }

    public void setTotilPrice(int totilPrice) {
        this.totilPrice = totilPrice;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
