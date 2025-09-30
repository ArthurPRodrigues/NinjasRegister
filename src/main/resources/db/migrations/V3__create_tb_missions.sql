CREATE TABLE tb_missions (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    mission_name VARCHAR(255) NOT NULL,
    difficulty_level VARCHAR(255),
    mission_status VARCHAR(255)
);
