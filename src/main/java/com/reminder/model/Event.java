package com.reminder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
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
    @OneToMany(mappedBy = "events", fetch = FetchType.LAZY)
    @NonNull
    @Column(name = "event_user")
    private Set<User> user = new HashSet<>();
    @OneToOne
    private Location location;

}
