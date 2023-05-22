package com.movie.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="http://localhost:8181",name="movieinfo")
public interface MovieFeignClient {
	
@GetMapping("/info")	
public String getMovieInfo();

}
