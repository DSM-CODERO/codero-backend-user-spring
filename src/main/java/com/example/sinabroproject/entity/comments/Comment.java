package com.example.sinabroproject.entity.comments;

import com.example.sinabroproject.entity.board.Board;
import com.example.sinabroproject.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String context;

    private Instant created_at;

    private int reply_comment_id;

    private String picture;

    private boolean isdeleted;

    private Instant updated_at;
}
