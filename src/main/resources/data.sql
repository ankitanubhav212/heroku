drop schema spotify;
create schema spotify;
use spotify;
CREATE TABLE song (name VARCHAR(60) NOT NULL, artists VARCHAR(40), danceability decimal(4,3), energy decimal(4,3),keynote INTEGER,
loudness decimal(5,4), mode INTEGER, speechiness decimal(6,4), acousticness decimal(5,4), instrumentalness decimal(10,8), liveness decimal(5,4), 
valence decimal(6,4), tempo decimal(7,4), duration_ms INTEGER, time_signature INTEGER, rank INTEGER,PRIMARY KEY (name));

LOAD DATA local  INFILE "top_spotify_021e61205.csv" into table song FIELDS TERMINATED BY ',' ENCLOSED BY '"' IGNORE 1 LINES;

