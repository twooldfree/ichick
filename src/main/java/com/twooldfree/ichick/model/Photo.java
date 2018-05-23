package com.twooldfree.ichick.model;

import java.util.Date;

public class Photo {
    private String photoId;

    private String photoName;

    private Date createTime;

    private Date lastmodifyTime;

    private String createUserId;

    private String lastmodifyUserId;

    private String remark;

    private String relatedGraphId;

    private String fileName;

    private Integer istitlepage;

    private byte[] photoContent;

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId == null ? null : photoId.trim();
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName == null ? null : photoName.trim();
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

    public String getRelatedGraphId() {
        return relatedGraphId;
    }

    public void setRelatedGraphId(String relatedGraphId) {
        this.relatedGraphId = relatedGraphId == null ? null : relatedGraphId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getIstitlepage() {
        return istitlepage;
    }

    public void setIstitlepage(Integer istitlepage) {
        this.istitlepage = istitlepage;
    }

    public byte[] getPhotoContent() {
        return photoContent;
    }

    public void setPhotoContent(byte[] photoContent) {
        this.photoContent = photoContent;
    }
}