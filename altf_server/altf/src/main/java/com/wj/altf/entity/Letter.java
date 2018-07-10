package com.wj.altf.entity;

import java.util.Date;

public class Letter {
    private Long lId;

    private Long uId;

    private String lContent;

    private Integer lLastTime;

    private String lImg;

    private String lMp3;

    private String lVoice;

    private String lVideo;

    private String lReceiveEmail;

    private Byte lIsPublic;

    private Date lCreateTime;

    private Byte lIsValid;

    public Long getlId() {
        return lId;
    }

    public void setlId(Long lId) {
        this.lId = lId;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getlContent() {
        return lContent;
    }

    public void setlContent(String lContent) {
        this.lContent = lContent == null ? null : lContent.trim();
    }

    public Integer getlLastTime() {
        return lLastTime;
    }

    public void setlLastTime(Integer lLastTime) {
        this.lLastTime = lLastTime;
    }

    public String getlImg() {
        return lImg;
    }

    public void setlImg(String lImg) {
        this.lImg = lImg == null ? null : lImg.trim();
    }

    public String getlMp3() {
        return lMp3;
    }

    public void setlMp3(String lMp3) {
        this.lMp3 = lMp3 == null ? null : lMp3.trim();
    }

    public String getlVoice() {
        return lVoice;
    }

    public void setlVoice(String lVoice) {
        this.lVoice = lVoice == null ? null : lVoice.trim();
    }

    public String getlVideo() {
        return lVideo;
    }

    public void setlVideo(String lVideo) {
        this.lVideo = lVideo == null ? null : lVideo.trim();
    }

    public String getlReceiveEmail() {
        return lReceiveEmail;
    }

    public void setlReceiveEmail(String lReceiveEmail) {
        this.lReceiveEmail = lReceiveEmail == null ? null : lReceiveEmail.trim();
    }

    public Byte getlIsPublic() {
        return lIsPublic;
    }

    public void setlIsPublic(Byte lIsPublic) {
        this.lIsPublic = lIsPublic;
    }

    public Date getlCreateTime() {
        return lCreateTime;
    }

    public void setlCreateTime(Date lCreateTime) {
        this.lCreateTime = lCreateTime;
    }

    public Byte getlIsValid() {
        return lIsValid;
    }

    public void setlIsValid(Byte lIsValid) {
        this.lIsValid = lIsValid;
    }
}