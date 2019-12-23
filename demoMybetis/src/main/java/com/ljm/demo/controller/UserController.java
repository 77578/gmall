package com.ljm.demo.controller;


import com.ljm.demo.bean.UmsMember;
import com.ljm.demo.bean.UmsMemberReceiveAddress;
import com.ljm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId)
    {
        return userService.getReceiveAddressByMemberId(memberId);
    }


    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()
    {
        return userService.getAllUser();
    }




}
