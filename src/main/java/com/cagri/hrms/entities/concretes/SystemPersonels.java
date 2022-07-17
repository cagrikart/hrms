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
@Table(name = "system_personels")

public class SystemPersonels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @NotNull
    private int user_id;
    @Column(name = "username")
    @NotNull
    private String username;

}
