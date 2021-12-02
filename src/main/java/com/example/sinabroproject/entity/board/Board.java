package com.example.sinabroproject.entity.board;

import com.example.sinabroproject.entity.user.User;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.Instant;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "board")
public class Board {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id", unique = true)
    private Integer board_id;

    private Instant create_at;

    private String context;

    @Column(length = 30)
    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String picture;

    @Column(length = 10)
    private String filed;

    private boolean isdeleted;

    private Instant updated_at;
}
