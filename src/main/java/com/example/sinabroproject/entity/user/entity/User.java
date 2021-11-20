package com.example.sinabroproject.entity.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, length = 60)
    private String password;

    @Column(unique = true, length = 10)
    private String nickname;

    @Column(unique = true, length = 36)
    private String email;
}
