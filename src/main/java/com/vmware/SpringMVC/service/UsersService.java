package com.vmware.SpringMVC.service;

import com.vmware.SpringMVC.domain.Users;
import com.vmware.SpringMVC.domain.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑层对象，需要加上@Service 注解。
 */
@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> listAll(){
        return usersRepository.selectAll();
    }

    public Users getUserByName(String name){
        return usersRepository.getUserByName(name);
    }

    public Users getUserById(int id){
        return usersRepository.getUserById(id);
    }

}
