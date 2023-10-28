package com.example.testback;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kakaouser")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Builder
    public User(String email){
        this.email=email;
    }
}
