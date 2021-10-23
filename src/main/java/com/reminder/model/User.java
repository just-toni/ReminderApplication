package com.reminder.model;

import lombok.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    @OneToMany(mappedBy = "entry", fetch = FetchType.LAZY)
    @NonNull
    @Column(name = "user_event")
    private Set<Entry> entries = new HashSet<>();
    @OneToMany(mappedBy = "confirmationToken", fetch = FetchType.LAZY)
    @NonNull
    @Column(name = "user_confirmation_token")
    private Set<ConfirmationToken> confirmationTokens = new HashSet<>();


}
