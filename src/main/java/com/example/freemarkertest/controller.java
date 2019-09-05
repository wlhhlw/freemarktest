package com.example.freemarkertest;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {

    @RequestMapping(value = "/test",method = RequestMethod.GET )
    public ModelAndView test(User user,String users){
        System.out.println(user);
        List<User> userList = (List<User>) JSONObject.parse(users);
        ModelAndView mv = new ModelAndView("/index");
        mv.addObject("userList",userList);
        return mv;
    }
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("/index");
        mv.addObject("index","测试");
        return mv;
    }
    @GetMapping("/list")
    public ModelAndView testList(){
        ModelAndView mv = new ModelAndView("/index");
        List<User> userList = new ArrayList<>();
        userList.add(new User("xiaoming","18","男"));
        userList.add(new User("花花","20","nv"));
        mv.addObject("userList",userList);
        mv.addObject("userJson", JSONObject.toJSON(userList).toString());
        return mv;
    }

    @GetMapping("/s")
    public String s(){
        return "/success";
    }

    @GetMapping("/t")
    public String t(){

        return "/test";
    }
}
