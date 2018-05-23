package com.twooldfree.ichick.model;

import java.util.Date;

public class PhotoGraph {
    private String photographId;

    private String photographName;

    private Date createTime;

    private Date lastmodifyTime;

    private String createUserId;

    private String lastmodifyUserId;

    private String remark;

    public String getPhotographId() {
        return photographId;
    }

    public void setPhotographId(String photographId) {
        this.photographId = photographId == null ? null : photographId.trim();
    }

    public String getPhotographName() {
        return photographName;
    }

    public void setPhotographName(String photographName) {
        this.photographName = photographName == null ? null : photographName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastmodifyTime() {
        return lastmodifyTime;
    }

    public void setLastmodifyTime(Date lastmodifyTime) {
        this.lastmodifyTime = lastmodifyTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getLastmodifyUserId() {
        return lastmodifyUserId;
    }

    public void setLastmodifyUserId(String lastmodifyUserId) {
        this.lastmodifyUserId = lastmodifyUserId == null ? null : lastmodifyUserId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}