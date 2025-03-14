package com.example.demo.scene.repository;

import com.example.demo.scene.domain.Scene;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SceneRepository extends JpaRepository<Scene, Long> {
}
