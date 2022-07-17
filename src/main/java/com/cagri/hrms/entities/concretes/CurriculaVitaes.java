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
@Table(name="curricula_vitaes")
public class CurriculaVitaes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id")
    private int id;
    @Column(name = "picture_url")
    private String picture_url;
    @Column(name = "cover_letter")
    private String cover_letter;

    // ilişki yazılacak private int Jobseeker_id

}
