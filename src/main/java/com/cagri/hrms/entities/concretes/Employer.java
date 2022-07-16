package com.cagri.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {
    @Id
    @Column(name = "user_id")
    @NotNull
    private  int user_id;

    @Column(name = "company_name")
    @NotNull
    private String company_name;

    @Column(name = "website")
    @NotNull
    private String website;

    @Column(name = "phone_number")
    @NotNull
    private String phone_number;

    @Column(name = "picture_url")
    @NotNull
    private String picture_url;

    @Column(name = "is_updated")
    @NotNull
    private boolean is_updated;

}
