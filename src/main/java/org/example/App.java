package org.example;

/*
MORE INFORMATION
--------------------  https://habr.com/ru/post/27108/
and
--------------------  https://www.youtube.com/watch?v=vyr9GO7dLBQ
 */

import org.example.model.User;

public class App {
    public static void main(String[] args) {

        System.out.println(User.getUser().toString());
        User.getUser().addUserName("aaa");
        User.getUser().showUserName();

        System.out.println(User.getUser().toString());
        User.getUser().addUserName("bbb");
        User.getUser().showUserName();
    }
}
