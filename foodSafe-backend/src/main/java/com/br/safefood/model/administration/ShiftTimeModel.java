package com.br.safefood.model.administration;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shift_time")
public class ShiftTimeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "hour_inital")
    private Double hourInitial;

    @Column(name = "hour_final")
    private Double hourFinal;
}
