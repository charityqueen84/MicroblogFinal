package com.company;

public class User {
    private String avatarUrl;
    private String username;
    private String nameFirst;
    private String nameLast;
    private String emailAddress;

    public User() {

    }

    public User(String avatarUrl, String username, String nameFirst, String nameLast, String emailAddress) {
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.emailAddress = emailAddress;


    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;

    }

    @Override
    public String toString() {
        return "This is user " + this.username + "\n" +
                "First name: " + this.nameFirst + "\n" +
                "Last name: " + this.nameLast + "\n" +
                "Email address: " + this.emailAddress + "\n" +
                "Avatar Url: " + this.avatarUrl + "\n";
    }
}