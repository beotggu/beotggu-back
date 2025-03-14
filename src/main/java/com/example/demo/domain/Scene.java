package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Scene {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sceneId;

    @OneToOne
    @JoinColumn(name = "social_id", referencedColumnName = "socialId", nullable = false)
    private User user;

    @Column(nullable = false)
    private String theme;

    @Column(nullable = false, precision = 11, scale = 8)
    private Double latitude;

    @Column(nullable = false, precision = 12, 8)
    private Double longitude;
}
