package com.br.safefood.model.administration;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

    @ManyToMany
    private List<RoleModel> roles;

    @Column
    private Double salary;

    @Column(name = "admission_date")
    private Date admissionDate;

    @Column(name = "resignation_date")
    private Date resignationDate;

    @Column(name = "holiday_initial_date")
    private Date holidayInitialDate;

    @Column(name = "holiday_final_date")
    private Date holidayFinalDate;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String token;

}
