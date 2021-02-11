package org.example.model;

public class User {
    private static User user;
    private static String userName;

    public static synchronized User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    private User() {
    }

    public void showUserName() {
        System.out.println(userName);
    }

    public void addUserName(String userName) {
        User.userName = userName + "\n";
    }
}
