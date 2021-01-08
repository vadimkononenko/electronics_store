package com.store.electronics_store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
    @GetMapping("/store")
    public String storeMain(Model model){
        return "store-main";
    }
}
