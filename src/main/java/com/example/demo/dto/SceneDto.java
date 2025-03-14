package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SceneDto {
    private Long sceneId;
    private String socialId;
    private String theme;
    private Double latitude;
    private Double longitude;
}
