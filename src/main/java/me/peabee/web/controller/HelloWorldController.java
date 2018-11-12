package me.peabee.web.controller;
import me.peabee.dao.model.Country;
import me.peabee.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


/**
 * Created by pengbo on 18-4-24.
 */
@Controller
@RequestMapping("/country")
public class HelloWorldController {
    @Autowired
    private CountryService countryService;

    @RequestMapping("/all")
    @ResponseBody
    public Object subject() throws Exception{
        return countryService.getAllCountry();
    }

    @RequestMapping("/code/{code}")
    @ResponseBody
    public Country getCountry(@PathVariable("code") String code) {
        return countryService.getCountry(code);
    }

    @RequestMapping("/name/{name}")
    @ResponseBody
    public String getCodeByName(@PathVariable("name") String name){
        return countryService.getCountryCode(name);
    }

    @RequestMapping("/thymeleaf")
    public ModelAndView thymeleaf(Map<String,Object> model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("thymeleaf");
        mv.addObject("time", System.currentTimeMillis());
        return mv;
    }

    @RequestMapping("/aa")
    public ModelAndView validateGlobalException() throws Exception{
        throw new RuntimeException("something wrong here");
    }

    @RequestMapping("/exception")
    public ModelAndView validateGlobalException2() throws Exception{
        throw new RuntimeException("something wrong here 2");
    }
}
