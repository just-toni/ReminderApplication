package com.reminder.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
public class ConfirmationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private LocalDate date;
    @NonNull
    private LocalDate expiredAt;
    @NonNull
    private LocalDate confirmedAt;
    @NonNull
    private LocalDate createdAt;
    @JoinColumn(name = "user_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

}
