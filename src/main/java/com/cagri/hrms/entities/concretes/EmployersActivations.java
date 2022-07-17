package com.cagri.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employers_activations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployersActivations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private  int id;
    @Column(name = "employer_id")
    @NotNull
    private  int employer_id;
    @Column(name = "is_email_confirmed")
    @NotNull
    private  boolean is_email_confirmed;
    @Column(name = "is_employer_activated")
    @NotNull
    private  boolean is_employer_activated;
}
