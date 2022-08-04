package com.revature.movieapp.dtos;

import com.revature.movieapp.models.MainAcc;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class MainAccResponse {


    private int account_id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date age;

    public MainAccResponse(MainAcc mainAcc){
        this.account_id = mainAcc.getId();
        this.lastName = mainAcc.getFirstName();
        this.firstName = mainAcc.getLastName();
        this.email = mainAcc.getEmail();
        this.password = mainAcc.getPassword();
        this.age = mainAcc.getAge();
    }
}
