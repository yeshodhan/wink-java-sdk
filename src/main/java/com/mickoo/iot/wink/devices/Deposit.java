package com.mickoo.iot.wink.devices;

/**
 * wink-java-sdk
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.1
 */
public class Deposit extends WinkDevice {

    private String deposit_id;
    private Long created_at;
    private Integer amount;

    public Deposit() {
    }

    public String getDeposit_id() {
        return deposit_id;
    }

    public void setDeposit_id(String deposit_id) {
        this.deposit_id = deposit_id;
    }

    public Long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Long created_at) {
        this.created_at = created_at;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
