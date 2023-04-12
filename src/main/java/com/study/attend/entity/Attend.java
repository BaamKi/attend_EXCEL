package com.study.attend.entity;


import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Attend {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column
    private String name;

    @Column
    private LocalDateTime startTime;

    @Column
    private LocalDateTime endTime;


    @Builder
    public Attend(Long employeeId, String name, LocalDateTime startTime, LocalDateTime endTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
