package com.cagri.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employers_update")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployersUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;
    @Column(name = "company_name")
    @NotNull
    private String company_name;
    @Column(name = "website")
    @NotNull
    private String website;
    @Column(name = "phone_number")
    @NotNull
    private String phone_number;
    @Column(name = "email")
    @NotNull
    private String email;
    @Column(name = "password")
    @NotNull
    private String password;
    @Column(name = "picture_url")
    private String picture_url;
}
