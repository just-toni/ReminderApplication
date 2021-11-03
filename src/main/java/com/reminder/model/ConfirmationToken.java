package com.reminder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long confirmationTokenId;
    @NonNull
    private LocalDate date;
    @NonNull
    private LocalDate expiredAt;
    @NonNull
    private LocalDate confirmedAt;
    @NonNull
    private LocalDate createdAt;
    @OneToMany(mappedBy = "confirmationTokens", fetch = FetchType.LAZY)
    @NonNull
    @Column(name = "confirmation_token_user")
    private Set<User> users = new HashSet<>();

}
