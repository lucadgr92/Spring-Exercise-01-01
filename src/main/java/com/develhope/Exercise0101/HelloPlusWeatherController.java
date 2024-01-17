package com.develhope.Exercise0101;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloPlusWeatherController {
    @RequestMapping(method = RequestMethod.GET, path = "/ciao")
    public String helloWeather(
            @RequestParam String name,
            @RequestParam String region
    ) {
        return "Ciao " + name + ", come è il tempo in " + region + "?";
    }

}

