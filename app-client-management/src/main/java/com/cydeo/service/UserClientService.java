package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(value = "user-service",url = "http://localhost:9090") No need to use url, because eureka server(discovery server) manage the url part if there are more than one user-service instance, it automatically gives us available instance
@FeignClient(value = "user-service")
public interface UserClientService {

    @GetMapping("/api/v1/user/{username}")
    UserResponseDTO getUserDTOByUserName(@PathVariable("username") String username);
}
