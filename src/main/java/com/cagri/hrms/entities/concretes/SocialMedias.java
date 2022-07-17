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
@Table(name = "social_medias")

public class SocialMedias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;
    @Column(name = "curricula_vitae_id")
    @NotNull
    private int curricula_vitae_id;
    @Column(name = "github_username")
    private String github_username;
    @Column(name = "linkedin_username")
    private String linkedin_username;
}
