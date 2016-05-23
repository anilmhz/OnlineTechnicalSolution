/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Aniel
 */

@Controller
public class DefaultController {

    
        @RequestMapping("/ots")

    protected ModelAndView handleRequestInternal() throws Exception {
       ModelAndView mav=new ModelAndView("index");
               return mav;
    }

    
            @RequestMapping("/technicians")

    protected ModelAndView handleRequestInternal1() throws Exception {
       ModelAndView mav=new ModelAndView("technician");
               return mav;
    }

    
}
