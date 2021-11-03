package com.reminder.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @NonNull
    private String userName;
    @NonNull
    private String password;
    @NonNull
    private String email;
    @NonNull
    private boolean enabled;
    @JoinColumn(name = "eventId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Event events;
    @JoinColumn(name = "confirmationTokenId")
    @ManyToOne(cascade = CascadeType.ALL)
    private ConfirmationToken confirmationTokens;


}
