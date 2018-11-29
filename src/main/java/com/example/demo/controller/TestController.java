package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by liulanhua on 2018/9/25.
 */
@RestController
@EnableSwagger2
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @ApiOperation(value = "index方法", notes="首页")
    @RequestMapping(value="",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) throws Exception {
        mv.addObject("data", "this is index page");
        mv.setViewName("index");
        return mv;
    }






}
