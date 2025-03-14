package com.example.demo.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @Column(nullable = false, unique = false)
    private String socialId;

    @Column(nullable = false)
    private String name;
}
