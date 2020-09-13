package com.atul.java.patterns._3_behavioral._1_chainOfResponsibility._1;

public class RoleCheckMiddleware extends Middleware{
	public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
