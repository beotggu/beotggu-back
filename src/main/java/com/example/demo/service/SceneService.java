package com.example.demo.service;

import com.example.demo.domain.Scene;
import com.example.demo.repository.SceneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SceneService {
    private final SceneRepository sceneRepository;

    public Scene saveScene(Scene scene) {
        return sceneRepository.save(scene);
    }
}
