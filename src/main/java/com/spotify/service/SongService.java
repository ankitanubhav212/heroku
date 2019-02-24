package com.spotify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spotify.model.Song;
import com.spotify.repository.SongRepository;

@Service
public class SongService {

	@Autowired
	SongRepository repo;
	
	public List<Song> getSongs() {
		return repo.findAll(Sort.by(Sort.Direction.ASC, "rank")).subList(0, 49);
	}	
	
	public List<Song> getByKey(String value) {
		return repo.findByNameOrArtists(value);
	}
}
