package com.twooldfree.ichick.model;

import java.util.Date;

public class User {
    private String serviceId;

    private String imgtype;

    private String serviceName;

    private String serviceDesc;

    private String relateCatalogId;

    private Date createTime;

    private String applyUser;

    private Integer ispublis;

    private Date publisdate;

    private String designId;

    private Integer deletestatus;

    private byte[] serviceLogo;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getImgtype() {
        return imgtype;
    }

    public void setImgtype(String imgtype) {
        this.imgtype = imgtype == null ? null : imgtype.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc == null ? null : serviceDesc.trim();
    }

    public String getRelateCatalogId() {
        return relateCatalogId;
    }

    public void setRelateCatalogId(String relateCatalogId) {
        this.relateCatalogId = relateCatalogId == null ? null : relateCatalogId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser == null ? null : applyUser.trim();
    }

    public Integer getIspublis() {
        return ispublis;
    }

    public void setIspublis(Integer ispublis) {
        this.ispublis = ispublis;
    }

    public Date getPublisdate() {
        return publisdate;
    }

    public void setPublisdate(Date publisdate) {
        this.publisdate = publisdate;
    }

    public String getDesignId() {
        return designId;
    }

    public void setDesignId(String designId) {
        this.designId = designId == null ? null : designId.trim();
    }

    public Integer getDeletestatus() {
        return deletestatus;
    }

    public void setDeletestatus(Integer deletestatus) {
        this.deletestatus = deletestatus;
    }

    public byte[] getServiceLogo() {
        return serviceLogo;
    }

    public void setServiceLogo(byte[] serviceLogo) {
        this.serviceLogo = serviceLogo;
    }
}