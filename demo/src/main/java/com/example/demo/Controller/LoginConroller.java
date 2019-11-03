package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@SessionAttributes("loginid")
public class LoginConroller {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method =RequestMethod.POST)
    public int login(@RequestParam("uid")String id,@RequestParam("pass") String password, Model model){
        if(userService.isMatch(id,password)){
            model.addAttribute("loginid",id);
            return 200;
        }
        if (200>300){

        }
        return 302;
    }
}
