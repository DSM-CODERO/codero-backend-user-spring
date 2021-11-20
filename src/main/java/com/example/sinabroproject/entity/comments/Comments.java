package com.example.sinabroproject.entity.comments;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comments {
    private int id;

    @Id
    private int board_number;

    private int board_id;

    private int user_id;

    private String context;

    private int created_at;

    private int reply_comment_id;

    private String picture;
}
