package com.example.RemomaxBE.DTO;

public class MassageDTO {
    private String massage;
    private String description;

    public MassageDTO() {
    }

    public MassageDTO(String massage, String description) {
        this.massage = massage;
        this.description = description;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
