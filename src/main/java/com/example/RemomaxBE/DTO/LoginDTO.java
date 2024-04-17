package com.example.RemomaxBE.DTO;

public class LoginDTO {
    private String fullname;
    private String USERID;
    private String DRAWSSAP;
    private String level;
    public LoginDTO() {
    }

    public LoginDTO(String fullname, String USERID, String DRAWSSAP, String level) {
        this.fullname = fullname;
        this.USERID = USERID;
        this.DRAWSSAP = DRAWSSAP;
        this.level = level;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getDRAWSSAP() {
        return DRAWSSAP;
    }

    public void setDRAWSSAP(String DRAWSSAP) {
        this.DRAWSSAP = DRAWSSAP;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String lavel) {
        this.level = lavel;
    }
}
