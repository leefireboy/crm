package com.libing.entity;

import java.util.Date;

/**
 * Created by WY on 2018/2/4.
 */

public class InvoiceInformation {

    // 发票ID
    private Long id;
    // 抬头
    private String name;
    // 纳税人识别号
    private String unique_no;
    // 地址
    private String address;
    // 电话
    private String telephone;
    // 开户银行
    private String open_bank;
    // 开户银行账号
    private String open_bank_no;
    // 备注
    private String remarks;
    // 创建时间
    private Date create_time;
    // 创建人ID
    private Long create_id;
    // 创建人
    private String create_name;
    // 是否有效
    private Integer is_enable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnique_no() {
        return unique_no;
    }

    public void setUnique_no(String unique_no) {
        this.unique_no = unique_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOpen_bank() {
        return open_bank;
    }

    public void setOpen_bank(String open_bank) {
        this.open_bank = open_bank;
    }

    public String getOpen_bank_no() {
        return open_bank_no;
    }

    public void setOpen_bank_no(String open_bank_no) {
        this.open_bank_no = open_bank_no;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Long getCreate_id() {
        return create_id;
    }

    public void setCreate_id(Long create_id) {
        this.create_id = create_id;
    }

    public String getCreate_name() {
        return create_name;
    }

    public void setCreate_name(String create_name) {
        this.create_name = create_name;
    }

    public Integer getIs_enable() {
        return is_enable;
    }

    public void setIs_enable(Integer is_enable) {
        this.is_enable = is_enable;
    }

    @Override
    public String toString() {
        return "InvoiceInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unique_no='" + unique_no + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", open_bank='" + open_bank + '\'' +
                ", open_bank_no='" + open_bank_no + '\'' +
                ", create_time=" + create_time +
                ", create_id=" + create_id +
                ", create_name='" + create_name + '\'' +
                ", is_enable=" + is_enable +
                '}';
    }
}
