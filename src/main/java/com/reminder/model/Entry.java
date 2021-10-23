package com.reminder.model;

import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private LocalDate date;
    @NonNull
    private LocalTime time;
    @NonNull
    private boolean repeat;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    @NonNull
    @Enumerated(EnumType.STRING)
    private Status status;
    @NonNull
    private boolean priority;
    @JoinColumn(name = "user_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;


}
