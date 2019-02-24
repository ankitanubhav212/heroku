package com.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spotify.model.Song;
import java.lang.String;
import java.util.List;

public interface SongRepository extends JpaRepository<Song, String> {
	@Query("select s from Song s where s.name like %?1% or s.artists like %?1%")
	List<Song> findByNameOrArtists(String name);
}
