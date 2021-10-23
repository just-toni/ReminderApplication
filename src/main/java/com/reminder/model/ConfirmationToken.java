package com.reminder.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

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


}
