package com.reminder.model;

import lombok.NonNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String userName;
    @NonNull
    private String password;
    @NonNull
    private String email;
    @NonNull
    private boolean enabled;

}
