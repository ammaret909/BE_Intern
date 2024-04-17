package com.example.RemomaxBE.DTOout;

public class LoginAndLogoutSelectByIdDTOout {
    private String login;
    private String logout;
    private String ip;

    public LoginAndLogoutSelectByIdDTOout() {
    }

    public LoginAndLogoutSelectByIdDTOout(String login, String logout, String ip) {
        this.login = login;
        this.logout = logout;
        this.ip = ip;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogout() {
        return logout;
    }

    public void setLogout(String logout) {
        this.logout = logout;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
