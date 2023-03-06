package com.spring.producer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class UserRequestDto {

    private String username;

    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,12}$",message = "Your password  invalid!!!"+"The Password Rules:" +
            "At least one upper case English letter," +
            "At least one lower case English letter," +
            "At least one digit," +
            "At least one special character," +
            "Minimum eight in length"+"Name should contain only alphabets.\tMinimum length: 3\tMaximum length: 50")
    private String password;

    @Pattern(regexp = "^[\\w-\\.]+@[\\w-]+\\.com$",message = "Your email not invalid!!"+"The Email Rules:" +
            "- At least one upper or lower case English letter," +
            "- At least only one '@' character,"+"At least one upper or lower case English letter,"+
            "- At least only one '.' character,"+"At finished with 'com'")
    private String email;

    public UserRequestDto() {
    }

    public UserRequestDto( String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
