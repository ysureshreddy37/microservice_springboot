package com.movieinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieInfoController {
	
	@GetMapping("/info")
	public String getMovieInfo() {
		System.out.println("movie info srevice called");
		return "Getting Movie Info";
	}

}
