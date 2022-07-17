package com.cagri.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobseeker_languages")
public class JobseekerLanguages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;
    @Column(name = "curricula_vitae_id")
    @NotNull
    private int curricula_vitae_id;
    @Column(name = "language_id")
    @NotNull
    private int language_id;
    @Column(name = "language_degree")
    @NotNull
    private int language_degree;


}
