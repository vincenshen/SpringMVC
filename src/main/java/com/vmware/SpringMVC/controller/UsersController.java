package com.vmware.SpringMVC.controller;

import com.vmware.SpringMVC.domain.Users;
import com.vmware.SpringMVC.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Controller 返回一个页面的代码。
 * @RestController 返回一个JSON数据格式的String。
 */

@RestController
@RequestMapping("user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/list/all")
    public List<Users> listAll(){
        return usersService.listAll();
    }

    @GetMapping("/getUserByName")
    public Users getUserByName(@RequestParam String name){
        return usersService.getUserByName(name);
    }

    @GetMapping("/getUserById")
    public Users getUserById(@RequestParam int id){
        return usersService.getUserById(id);
    }
}
