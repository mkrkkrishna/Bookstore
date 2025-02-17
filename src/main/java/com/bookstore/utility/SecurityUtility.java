package com.bookstore.utility;

import org.springframework.stereotype.Component;

@Component
public class SecurityUtility {
    //private static final String SALT = "salt"; //Salt should be protected carefully


    /*@Bean
    public static BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }*/


    /*@Bean
    public static String randomPassword(){
        String SALTCGHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random random = new Random();

        while(salt.length()<18){
            int index = (int)(random.nextFloat()*SALTCGHARS.length());
        }
        String saltStr = salt.toString();
        return saltStr;
    }*/
}
