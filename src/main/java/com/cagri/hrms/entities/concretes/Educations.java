package com.cagri.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "educations")
public class Educations {
    @Id
    @Column(name = "id")
    @NotNull
    private int id;
    private int school_id;
    private int department_id;
    private String start_date;
    private String end_date;

    //private int curricula_vitae_id; ilişki yazılacak


}
