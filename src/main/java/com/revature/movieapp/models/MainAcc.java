package com.revature.movieapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "stars_account")
public class MainAcc  {
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = true)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, columnDefinition = "DATE")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date age;
    @Id
    @Column(name = "account_id",nullable = false)
    private int id;


    public MainAcc() {
    }

    public MainAcc( String firstName, String lastName, String email, String password, Date age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainAcc mainAcc = (MainAcc) o;
        return  age == mainAcc.age && id == mainAcc.id && Objects.equals(firstName, mainAcc.firstName) && Objects.equals(lastName, mainAcc.lastName) && Objects.equals(email, mainAcc.email) && Objects.equals(password, mainAcc.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, password, age, id);
    }

    @Override
    public String toString() {
        return "MainAcc{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
//                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", id=" + id +
        '}';
    }
}
