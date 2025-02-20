package com.bookstore.utility;

import com.bookstore.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MailConstructor {
    //private static final String SALT = "salt"; //Salt should be protected carefully

    @Autowired
    private Environment environment;;

    public SimpleMailMessage constructResetTokenEmail(
            String contextPath, Locale locale, String token, User user, String password
    ){
        String url = contextPath + "/newUser?token="+token;
        String message = "\n Please click on the link to verify your email and edit your personal information. Your password is : \n"+password;

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(user.getEmail());
        simpleMailMessage.setSubject("Le's Bookstore - New User");
        simpleMailMessage.setText(url+message);
        simpleMailMessage.setFrom(environment.getProperty("support.email"));
        return simpleMailMessage;
    }


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
