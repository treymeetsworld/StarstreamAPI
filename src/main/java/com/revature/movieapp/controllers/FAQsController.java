package com.revature.movieapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faqs")
public class FAQsController
{

    private String faQs;
    @GetMapping()
 public String GetFAQs(){return faQs;}

@PostMapping("/faqs")
    void createFAQs(){

}

}
