package me.peabee.web.controller;
import me.peabee.service.KbsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


/**
 * Created by pengbo on 18-4-24.
 */
@Controller
public class HelloWorldController {
    @Autowired
    private KbsSubjectService  kbsSubjectService;

    @RequestMapping("/hello")
    @ResponseBody
    public Object hellworld() throws Exception{
        throw new Exception("sssss");
//        return kbsSubjectService.getById(195831);
    }

    @RequestMapping("/errorr")
    public ModelAndView helloerror(Map<String,Object> model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("errorr");
        mv.addObject("time", System.currentTimeMillis());
        return mv;
    }
}