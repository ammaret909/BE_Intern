package com.example.RemomaxBE.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "keyword_pack")
public class KeywordPackModel {
    @Id
    private String rcc;
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "ractive")
    private int ractive;
    @Column(name = "rcc_key")
    private String rccKey;
    @Column(name = "remark")
    private String remark;

    public KeywordPackModel() {
    }

    public KeywordPackModel(String rcc, String keyword, int ractive, String rccKey, String remark) {
        this.rcc = rcc;
        this.keyword = keyword;
        this.ractive = ractive;
        this.rccKey = rccKey;
        this.remark = remark;
    }

    public String getRcc() {
        return rcc;
    }

    public void setRcc(String rcc) {
        this.rcc = rcc;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getRactive() {
        return ractive;
    }

    public void setRactive(int ractive) {
        this.ractive = ractive;
    }

    public String getRccKey() {
        return rccKey;
    }

    public void setRccKey(String rccKey) {
        this.rccKey = rccKey;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
