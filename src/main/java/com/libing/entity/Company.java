package com.libing.entity;

import java.util.Date;

/**
 * Created by WY on 2018/2/4.
 */

public class Company {

    // 公司ID
    private long id;
    // 公司名称
    private String name;
    // 邮箱
    private String email;
    // 地址
    private String address;
    // 网址
    private String net;
    // 注册资金
    private Integer reg_cap;
    // 客户需求
    private String need;
    // 企业性质
    private Integer nature;
    // 发票ID
    private Long invoice_id;
    // 创建时间
    private Date creat_time;
    // 创建人ID
    private Long creat_id;
    // 创建人
    private String creat_name;
    // 是否有效
    private Integer is_enable;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public Integer getReg_cap() {
        return reg_cap;
    }

    public void setReg_cap(Integer reg_cap) {
        this.reg_cap = reg_cap;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Long getCreat_id() {
        return creat_id;
    }

    public void setCreat_id(Long creat_id) {
        this.creat_id = creat_id;
    }

    public String getCreat_name() {
        return creat_name;
    }

    public void setCreat_name(String creat_name) {
        this.creat_name = creat_name;
    }

    public Integer getIs_enable() {
        return is_enable;
    }

    public void setIs_enable(Integer is_enable) {
        this.is_enable = is_enable;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", net='" + net + '\'' +
                ", reg_cap=" + reg_cap +
                ", need='" + need + '\'' +
                ", nature=" + nature +
                ", invoice_id=" + invoice_id +
                ", creat_time=" + creat_time +
                ", creat_id=" + creat_id +
                ", creat_name='" + creat_name + '\'' +
                ", is_enable=" + is_enable +
                '}';
    }
}
