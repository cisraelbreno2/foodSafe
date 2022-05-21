package com.br.safefood.model.administration;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "work_day_shift_time")
public class WorkDayShiftTimeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shift_time_id", nullable = false)
    private ShiftTimeModel shiftTime;

    @ManyToOne
    @JoinColumn(name = "work_day_id", nullable = false)
    private WorkDayModel workDay;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private EmployeeModel employee;
}
