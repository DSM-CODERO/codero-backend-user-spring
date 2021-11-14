package com.example.sinabroproject.entity.board;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "board")
public class Board {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    private String createAT;

    private String content;

    private String title;

    private String nickname;

    private String picture;

    private String filed;

    @NotNull
    private int like;
}
