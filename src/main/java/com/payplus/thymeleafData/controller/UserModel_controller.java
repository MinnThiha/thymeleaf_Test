package com.payplus.thymeleafData.controller;

import com.payplus.thymeleafData.Model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserModel_controller {
    //handeler for usermodel
    @GetMapping("/userModel")
    public String userModel(Model model){
        UserModel user=new UserModel("MTH","MTH@Gmail.com","user","male");
        model.addAttribute("userModel",user);
        return "userModel";

    }

    //handle to method of message.properties
    @GetMapping("/message-expression")
    public String messageExpression(){
        return "message-expression";
    }
    //handle to method of link
    @GetMapping("/linkExpression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "linkExpression";
    }

    //handle to method of fragment
    @GetMapping("/fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }
    //handle to method of loop
    @GetMapping("/users")
    public String users(Model model){
        UserModel MTH=new UserModel("MTH","MTH@Gmail.com","user","male");
        UserModel admin=new UserModel("admin","admin@Gmail.com","admin","male");
        UserModel kyaw=new UserModel("kyaw","kyaw@Gmail.com","user","male");
        List<UserModel> users=new ArrayList<>();
        users.add(MTH);
        users.add(admin);
        users.add(kyaw);
        model.addAttribute("users",users);
        return "users";
    }

    //handle for condition
    @GetMapping("/if-unless")
    public String ifUnless(Model model){
        UserModel MTH=new UserModel("MTH","MTH@Gmail.com","user","male");
        UserModel admin=new UserModel("admin","admin@Gmail.com","admin","male");
        UserModel kyaw=new UserModel("kyaw","kyaw@Gmail.com","user","male");
        List<UserModel> users=new ArrayList<>();
        users.add(MTH);
        users.add(admin);
        users.add(kyaw);
        model.addAttribute("users",users);
        return "if-unless";
    }

}
