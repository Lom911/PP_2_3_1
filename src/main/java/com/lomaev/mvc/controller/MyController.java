package com.lomaev.mvc.controller;

import com.lomaev.mvc.dao.UsersDAO;
import com.lomaev.mvc.entity.Users;
import com.lomaev.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {


    public final UserService userService;

    @Autowired
    public MyController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public String ShowAllUsers(Model model) {
        List<Users> allUsers = userService.getAllUsers();
        model.addAttribute("allUs", allUsers);
        return "all-users";
    }

    @RequestMapping("/addUser")
    public String AddUser(Model model) {
        Users adduser = new Users();
        model.addAttribute("adduser", adduser);

        return "userinfo";
    }

    @RequestMapping("/saveUser")
    public String SaveUser(@ModelAttribute("adduser") Users users) {
        userService.saveUser(users);

        return "redirect:/users";
    }

    @RequestMapping("/updateUser")
    public String updateUser(@RequestParam("empId") int id, Model model) {
        return "userinfo";
    }
}
