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
    @Column(unique = true)
    private int  board_id;

    private String create_at;

    private String context;

    @Column(length = 30)
    private String title;
    
    private int user_id;

    private String picture;

    @Column(length = 10)
    private String filed;


}
