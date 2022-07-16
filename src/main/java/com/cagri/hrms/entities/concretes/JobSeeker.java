package com.cagri.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobseekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "curriculaVitaes", "favorites"})

public class JobSeeker {
    @Id
    @Column(name = "user_id")
    @NotNull
    private int user_id;
    @Column(name = "first_name")
    @NotNull
    private String first_name;

    @Column(name = "last_name")
    @NotNull
    private String last_name;

    @Column(name = "identity_number")
    @NotNull
    private String identity_number;

    @Column(name = "date")
    @NotNull
    private String date;
}
