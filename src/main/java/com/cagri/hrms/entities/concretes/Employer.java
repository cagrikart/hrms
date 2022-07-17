package com.cagri.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employer")
public class Employer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        @NotNull
        private int id;
        private boolean is_updated;
        private String picture_url;
        private String company_name;
        private int phone_number;
        private String website;
}
