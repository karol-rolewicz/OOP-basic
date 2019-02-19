package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {
    private String name, lastname, login, password, email, phone;
    private LocalTime birth_date;
    private LocalDateTime registration_data_time;

    public User(String name, String lastname, String login, String password, String email, String phone, LocalTime birth_date, LocalDateTime registration_data_time) {
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.birth_date = birth_date;
        this.registration_data_time = registration_data_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birth_date=" + birth_date +
                ", registration_data_time=" + registration_data_time +
                '}';
    }

    
}
