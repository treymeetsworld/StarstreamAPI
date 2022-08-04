package com.revature.movieapp.controllers;


import com.revature.movieapp.dtos.MainAccResponse;
import com.revature.movieapp.services.MainAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainAccController {

    private final MainAccService mainAccService;

    @Autowired
    public MainAccController(MainAccService mainAccService) {
        this.mainAccService = mainAccService;
    }

    @GetMapping("/{account_id}")
    public MainAccResponse getAccById(@PathVariable int account_id) {
        return mainAccService.fetchAccById((account_id));
    }
}



