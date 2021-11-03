package com.reminder.model;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locationId;
    @NonNull
    private String locationName;
    @NonNull
    private String state;

}
