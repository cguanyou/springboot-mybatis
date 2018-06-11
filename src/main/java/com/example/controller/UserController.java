package com.example.controller;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.service.impl.UserService;

@RestController
@ComponentScan({"com.example.service"})
@MapperScan("com.example.mapper")
public class UserController {
	@Resource
    private UserService userService;
    
     @RequestMapping("/say")  
     public String say(){  
         return "springboot-a"+userService;
     }  
    
    @RequestMapping("/find")
    public String find(){
        User user =  userService.find(1);
        ModelAndView mav = new ModelAndView();
        mav.addObject("user","sadf");
        return "HelloWord"+"fasdf--"+user.getUsername()+"--"+user.getPassword();
    }
    
    
    @RequestMapping("/ajax")
    public String find1(){
        return "[''message':'123dfx']";
    }
}
