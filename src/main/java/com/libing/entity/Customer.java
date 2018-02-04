package com.libing.entity;

import java.util.Date;

/**
 * @Description: 客户信息
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:23
 */
public class Customer {

    // 客户ID
    private Long id;
    // 客户姓名
    private String name;
    // 性别
    private Integer sex;
    // 联系方式1
    private String contact1;
    // 联系方式2
    private String contact2;
    // 联系方式3
    private String contact3;
    // 邮箱
    private String email;
    // 地址
    private String address;
    // 生日
    private Date birthday;
    // 身份证号
    private String idCard;
    // 爱好
    private String interest;
    // 积分
    private Integer score;
    // 需求
    private String need;
    // 印象
    private String impression;
    // 公司ID
    private Long companyId;
    // 开票信息ID
    private Long invoiceId;
    // 备注
    private String remarks;
    // 创建时间
    private Date createTime;
    // 创建人ID
    private Long createId;
    // 创建人
    private String createName;
    // 是否启用
    private Boolean isEnable;

    public Customer() {
    }

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getContact3() {
        return contact3;
    }

    public void setContact3(String contact3) {
        this.contact3 = contact3;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", contact1='" + contact1 + '\'' +
                ", contact2='" + contact2 + '\'' +
                ", contact3='" + contact3 + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", idCard='" + idCard + '\'' +
                ", interest='" + interest + '\'' +
                ", score=" + score +
                ", need='" + need + '\'' +
                ", impression='" + impression + '\'' +
                ", companyId=" + companyId +
                ", invoiceId=" + invoiceId +
                ", remarks='" + remarks + '\'' +
                ", createTime=" + createTime +
                ", createId=" + createId +
                ", createName='" + createName + '\'' +
                ", isEnable=" + isEnable +
                '}';
    }

}
