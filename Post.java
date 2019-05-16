package com.company;

public class Post {

    private static int postCounter = 0;

    private User user;
    private int orderPosted;
    private String postContent;
    private String webAddress;



    public Post () {
        this.postCounter++;
        this.orderPosted = postCounter;
    }

    public Post (User user, String postContent) {
        postCounter++;
        this.user = user;
        this.postContent = postContent;
        this.orderPosted = postCounter;
    }
    public Post (User user, String postContent, String webAddress) {
        postCounter++;
        this.orderPosted = postCounter;
        this.user = user;
        this.postContent = postContent;
        this.webAddress = webAddress;

    }
    public Post (String postContent, String webAddress) {
        postCounter++;
        this.postContent = postContent;
        this.webAddress = webAddress;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public int getOrderPosted() {
        return orderPosted;
    }
    public void setOrderPosted (int orderPosted) {
        this.orderPosted = orderPosted;
    }
    public String getPostContent() {
        return postContent;
    }
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
    public String getWebAddress() {
        return webAddress;
    }
    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
    @Override
    public String toString() {
        return "This is post number " + this.orderPosted + "\n" +
                this.postContent + "\n" +
                "Written by: " + this.user.getUsername() + "\n" +
                "Web address: " + (this.webAddress != null ? this.webAddress : " ");

    }
}
