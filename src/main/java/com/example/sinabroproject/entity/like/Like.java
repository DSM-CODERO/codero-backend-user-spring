package com.example.sinabroproject.entity.like;


import com.example.sinabroproject.entity.board.Board;
import com.example.sinabroproject.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "like")
public class Like {

    @Id
    @ManyToOne
    @JoinColumn(name="user_id", insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private User user;

    @ManyToOne
    @JoinColumn(name="board_id", insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Board board;
}
