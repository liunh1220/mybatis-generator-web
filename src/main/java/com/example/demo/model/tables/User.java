/*
*
* User.java
* Copyright(C) 2018-2099 LiuNH
* @date 2018-11-29
*/
package com.example.demo.model.tables;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private String mobile;

    private Integer type;

    private Integer parent_id;

    private String email;

    private String nickname;

    private Date created_time;

    private Date updated_time;

    private Integer deleted;

    private Integer status;

    private Integer shop_id;

    private String paymentCode;

    private Integer security_level;

    private String oldPassword;

    private String auditor;

    private String audit_remark;

    private Integer quick_type;

    private Integer payment_status;

    private String link_man;

    private String department;

    private String link_phone_num;

    private String wxopenid;

    private Integer failed_login_count;

    private Date last_login_time;

    private Integer distributor_type;

    private Integer distributor_status;

    private String user_job_number;

    private Integer is_import;

    private String password_salt;

    private Integer ismanage;

    private Long owner_id;

    private String owner_code;

    private Integer verification_status;

    private Integer emp_info_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    public Integer getSecurity_level() {
        return security_level;
    }

    public void setSecurity_level(Integer security_level) {
        this.security_level = security_level;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword == null ? null : oldPassword.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getAudit_remark() {
        return audit_remark;
    }

    public void setAudit_remark(String audit_remark) {
        this.audit_remark = audit_remark == null ? null : audit_remark.trim();
    }

    public Integer getQuick_type() {
        return quick_type;
    }

    public void setQuick_type(Integer quick_type) {
        this.quick_type = quick_type;
    }

    public Integer getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(Integer payment_status) {
        this.payment_status = payment_status;
    }

    public String getLink_man() {
        return link_man;
    }

    public void setLink_man(String link_man) {
        this.link_man = link_man == null ? null : link_man.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getLink_phone_num() {
        return link_phone_num;
    }

    public void setLink_phone_num(String link_phone_num) {
        this.link_phone_num = link_phone_num == null ? null : link_phone_num.trim();
    }

    public String getWxopenid() {
        return wxopenid;
    }

    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid == null ? null : wxopenid.trim();
    }

    public Integer getFailed_login_count() {
        return failed_login_count;
    }

    public void setFailed_login_count(Integer failed_login_count) {
        this.failed_login_count = failed_login_count;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Integer getDistributor_type() {
        return distributor_type;
    }

    public void setDistributor_type(Integer distributor_type) {
        this.distributor_type = distributor_type;
    }

    public Integer getDistributor_status() {
        return distributor_status;
    }

    public void setDistributor_status(Integer distributor_status) {
        this.distributor_status = distributor_status;
    }

    public String getUser_job_number() {
        return user_job_number;
    }

    public void setUser_job_number(String user_job_number) {
        this.user_job_number = user_job_number == null ? null : user_job_number.trim();
    }

    public Integer getIs_import() {
        return is_import;
    }

    public void setIs_import(Integer is_import) {
        this.is_import = is_import;
    }

    public String getPassword_salt() {
        return password_salt;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt == null ? null : password_salt.trim();
    }

    public Integer getIsmanage() {
        return ismanage;
    }

    public void setIsmanage(Integer ismanage) {
        this.ismanage = ismanage;
    }

    public Long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
    }

    public String getOwner_code() {
        return owner_code;
    }

    public void setOwner_code(String owner_code) {
        this.owner_code = owner_code == null ? null : owner_code.trim();
    }

    public Integer getVerification_status() {
        return verification_status;
    }

    public void setVerification_status(Integer verification_status) {
        this.verification_status = verification_status;
    }

    public Integer getEmp_info_id() {
        return emp_info_id;
    }

    public void setEmp_info_id(Integer emp_info_id) {
        this.emp_info_id = emp_info_id;
    }
}