package com.libing.entity;

import java.util.Date;

/**
 * Created by WY on 2018/2/4.
 */
public class Company {

    // 公司ID
    private Long id;
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
    // 备注
    private String remarks;
    // 发票ID
    private Long invoice_id;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        return name != null ? name.equals(company.name) : company.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
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
                ", creat_time=" + create_time +
                ", creat_id=" + create_id +
                ", creat_name='" + create_name + '\'' +
                ", is_enable=" + is_enable +
                '}';
    }

}
