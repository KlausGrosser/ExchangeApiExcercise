package com.example.currencyexchangeapp.controller;

import com.example.currencyexchangeapp.rest.Currency;
import com.example.currencyexchangeapp.service.CurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {

    private CurrencyService currencyService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/result")
    public ModelAndView result() throws Exception {
        ModelAndView model = new ModelAndView("result");
        model.addObject("model", currencyService.getCurrencyExchange());
        return model;
    }

}

