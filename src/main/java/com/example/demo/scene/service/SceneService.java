package com.example.demo.scene.service;

import com.example.demo.scene.domain.Scene;
import com.example.demo.scene.repository.SceneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SceneService {
    private final SceneRepository sceneRepository;

    @Transactional
    public Scene saveScene(Scene scene) {
        return sceneRepository.save(scene);
    }

    @Transactional
    public void updateScene(Long sceneId, String theme, Double latitude, Double longitude) {
        Scene scene = sceneRepository.findById(sceneId)
                .orElseThrow(() -> new IllegalArgumentException(sceneId + "not found"));
        scene.setTheme(theme);
        scene.setLatitude(latitude);
        scene.setLongitude(longitude);
        sceneRepository.save(scene);
    }

    @Transactional
    public void updateVisibility(Long sceneId, boolean isVisible) {
        Scene scene = sceneRepository.findById(sceneId)
                .orElseThrow(() -> new IllegalArgumentException(sceneId + "not found"));
        scene.setVisible(isVisible);
        sceneRepository.save(scene);
    }

    public Scene getScene(Long sceneId) {
        return sceneRepository.findById(sceneId)
                .orElseThrow(() -> new IllegalArgumentException(sceneId + "not found"));
    }


}
