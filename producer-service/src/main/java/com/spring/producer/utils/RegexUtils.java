/*
package com.spring.producer.utils;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class RegexUtils {

    public boolean validateEmail(String email){

            Pattern pattern = Pattern.compile("^[\\w-\\.İÖĞŞÇÜıöğşç]+@[\\w-İÖĞŞÇÜıöğşçü]+\\.+com$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()) {
                return true;
            }

        return false;
    }

    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            return true;
        }

        return false;
    }




}
*/
