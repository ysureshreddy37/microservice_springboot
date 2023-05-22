package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.service.MovieFeignClient;


@RestController
public class MovieController {
	@Autowired
	MovieFeignClient movieFeignClient;
	@GetMapping("/movieinfo")
	public String getMoiveName() {
		System.out.println("Troy");
		movieFeignClient.getMovieInfo();
		return "Getting Movie Name";
	}
	
	
	

}
