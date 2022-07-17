package com.cagri.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_experiences")
@Data
public class JobExperiences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;
    @Column(name = "curricula_vitae_id")
    @NotNull
    private int curricula_vitae_id;
    @Column(name = "company_name")
    @NotNull
    private String company_name;
    @Column(name = "position_name")
    @NotNull
    private String position_name;
    @Column(name = "start_date")
    @NotNull
    private Date start_date;
    @Column(name = "end_date")
    @NotNull
    private Date end_date;

}
