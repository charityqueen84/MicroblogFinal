package com.company;
import java.util.Scanner;

public class PostCreator {
    private Scanner keyboard;


    public PostCreator() {
        this.keyboard = new Scanner(System.in);
    }

//    public Post generatePost() {
//
//        //System.out.println("Which user would you like to post as?");
//        PostMenu list = new PostMenu();
//        list.viewUsers();
//        System.out.println("Which user would you like to post as?");
//        createPost(user).getUser(i) = keyboard.nextLine();
//        Post newPost;
//        newPost = createPost(user);
//        //System.out.println(newPost.toString());
//        return newPost;
//    }
    public User createUser(){
        User user = new User();
        System.out.println("What is your avatar url?");
        user.setAvatarUrl(keyboard.nextLine());
        System.out.println("What is your username?");
        user.setUsername(keyboard.nextLine());
        System.out.println("What is your first name?");
        user.setNameFirst(keyboard.nextLine());
        System.out.println("What is your last name?");
        user.setNameLast(keyboard.nextLine());
        System.out.println("What is your email address?");
        user.setEmailAddress(keyboard.nextLine());
        return user;
    }

    public Post createPost(User user) {
        Post post = new Post();
        post.setUser(user);
        //System.out.println("Which user would you like to post as?");

        System.out.println("Please type in your post content.");
        post.setPostContent(keyboard.nextLine());
        System.out.println("Do you have a web address?");
        post.setWebAddress(keyboard.nextLine());
        //System.out.println(post.toString());
        return post;
    }

    //public void chooseUser(int choose) {
        //switch (choose) {
            //case 1:
        }



