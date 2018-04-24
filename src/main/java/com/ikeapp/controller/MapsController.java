package com.ikeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by wei.shen
 * 2018/4/24
 */
@Controller
@RequestMapping("/views/maps")
public class MapsController {

    @RequestMapping("/showMap")
    public String showMaps(){
        return "maps/showMap";
    }

    @RequestMapping("/regionList")
    public String regionList(){
        return "maps/regionList";
    }
}
