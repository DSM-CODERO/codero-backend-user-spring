package com.example.sinabroproject.entity.comments;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comments {

    @Id
    private Long id;

    private int board_number;

    private String nickname;

    private String content;

    private String createAT;

    private int parent_number;

    private String picture;
}
