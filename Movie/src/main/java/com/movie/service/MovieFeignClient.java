package com.movie.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("http://localhost:8081")
public interface MovieFeignClient {
	
@GetMapping("/info")	
public String getMovieInfo();

}
