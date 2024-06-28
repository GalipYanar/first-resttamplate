package com.resttamplate.controller;

import com.resttamplate.service.PlaceHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/placeholder")

public class PlaceHolderController {

    @Autowired
    private PlaceHolderService placeHolderService;

    @GetMapping("/{id}")
    public void getData(@PathVariable("id") Long id){
        placeHolderService.getData(id);
    }
}
