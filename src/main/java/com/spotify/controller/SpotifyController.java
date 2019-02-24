package com.spotify.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.model.Song;
import com.spotify.service.SongService;

@RestController
public class SpotifyController {
	
	@Autowired
	SongService service;
	
	 @RequestMapping("/topsongs")
	    List<Song> getTopSongs() {
	        return service.getSongs();
	    }
	 
	 @RequestMapping("/filtersong")
	    List<Song> getSongs(@PathParam("name") String name) {
	        return service.getByKey(name);
	    }

	 @RequestMapping("/song")
	  Song getSong(@PathParam("id") String id) {
		 return service.getSong(id);
	 }

}
