DROP DATABASE IF EXISTS michi_gifs;
CREATE DATABASE michi_gifs DEFAULT CHARACTER SET = 'utf8mb4';
USE michi_gifs;
CREATE TABLE michi
(
    gif_id         INT          NOT NULL AUTO_INCREMENT,
    gif_name       VARCHAR(250) NOT NULL,
    gif_url        VARCHAR(250) NOT NULL,
    gif_dimensions VARCHAR(250) NOT NULL,
    PRIMARY KEY (gif_id)
) ENGINE = InnoDB;