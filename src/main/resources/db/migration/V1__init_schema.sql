-- V1__init_schema.sql
-- src/main/resources/db/migration 디렉토리에 저장

-- USER 테이블 생성
CREATE TABLE USERS (
                      social_id VARCHAR(100) PRIMARY KEY,
                      name VARCHAR(100) NOT NULL
);

-- SCENE 테이블 생성
CREATE TABLE SCENE (
                       scene_id INT AUTO_INCREMENT PRIMARY KEY,
                       social_id VARCHAR(100) NOT NULL UNIQUE,
                       theme VARCHAR(50) NOT NULL,
                       latitude DECIMAL(11,8) NOT NULL,
                       longitude DECIMAL(12,8) NOT NULL,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                       FOREIGN KEY (social_id) REFERENCES USER(social_id)
);

-- MESSAGE 테이블 생성
CREATE TABLE MESSAGE (
                         message_id INT AUTO_INCREMENT PRIMARY KEY,
                         scene_id INT NOT NULL,
                         nickname VARCHAR(100) NOT NULL,
                         content TEXT NOT NULL,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         FOREIGN KEY (scene_id) REFERENCES SCENE(scene_id)
);

-- 인덱스 생성
CREATE INDEX idx_message_created_at ON MESSAGE(created_at);
CREATE INDEX idx_scene_location ON SCENE(latitude, longitude);