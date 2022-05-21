package com.br.safefood.model.administration;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "work_day")
public class WorkDayModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "week_day")
    private String weekDay;
}
