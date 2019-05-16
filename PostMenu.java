package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PostMenu {

    private ArrayList<Post> postLog;
    private ArrayList<User> userLog;

    private Scanner keyboard;

    public PostMenu() {
        this.postLog = new ArrayList<>();
        this.userLog = new ArrayList<>();
        this.keyboard = new Scanner(System.in);
    }

    public void runMenu() {
        welcome();
        int select;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("1) Create a new user");
            System.out.println("2) Create a post as a current user");
            System.out.println("3) Print all posts");
            System.out.println("4) Print all users");

            select = keyboard.nextInt();
            if (select != 0) {
                doChoice(select);
            }
        } while (select != 0);
        System.out.println(" ");
    }
    private void welcome() {
        System.out.println("Main menu");
    }
    private void doChoice(int select) {
        switch (select) {
            case 1:
                PostCreator userMaker = new PostCreator();
                User user = userMaker.createUser();
                System.out.println(user.getUsername());
                System.out.println(user.getAvatarUrl());
                System.out.println(user.getUsername());
                System.out.println(user.getNameFirst());
                System.out.println(user.getNameLast());
                System.out.println(user.getEmailAddress());
                this.userLog.add(user);
                break;
            case 2:
                //viewUsers();
                if (userLog.size() == 0) {
                    System.out.println("There are no users. Exit and create a new one");
                    break; } //this exits to go back to the menu
                System.out.println("Which user are you? ");
                viewUsers();
                int choose = keyboard.nextInt();              //just picked a variable (choose) and initialized it and used it to get the item out of the userLog.
                keyboard.skip("\n");                         //saved into a buffer. This skips the newline.
                User selectedUser = userLog.get(choose);     //we used selectedUser instead of user because user is up in case 1 and in switch statements, it won't run if you have the same variables.
                PostCreator postMaker = new PostCreator();
                Post post = postMaker.createPost(selectedUser);        //got rid of generatePost method. creating a new post with the selected user.
                System.out.println(post.getPostContent());
                System.out.println(post.getWebAddress());
                this.postLog.add(post);
                break;
            case 3:
                viewPosts();
                break;
            case 4:
                viewUsers();
                break;
        }
        System.out.println(" ");
    }

    private void viewPosts() {
        for (Post post : postLog) {
            System.out.println("---------------");
            System.out.println(post.toString());

        }
        System.out.println("-----------------");
        System.out.println(" ");
    }
    public void viewUsers() {
            for (int i =0; i < userLog.size(); i++) {
            System.out.println("-----------------");
            System.out.println(i + " " + userLog.get(i).toString()); //get - it's getting the chosen item and making a copy of it.

        }
        System.out.println("-------------------");
        System.out.println(" ");
    }
}

