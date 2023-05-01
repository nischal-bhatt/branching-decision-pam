package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.model.ReturnDto;
import com.example.demo.service.PamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/foodcontroller")
public class FoodController {

    private final PamService pamService;

    public FoodController(PamService pamService) {
        this.pamService = pamService;
    }

    @PostMapping("/getFoodByPerson")
    public ReturnDto getFoodByPerson(@RequestBody Person person) {

        System.out.println("person's name is " + person.getName());


        ReturnDto returnDto
                = new ReturnDto();
        returnDto.setFavFoood(this.pamService.getFoodByPerson(person));

        return returnDto;


    }

}
