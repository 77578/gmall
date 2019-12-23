package com.ljm.demo.service;


import com.ljm.demo.bean.UmsMember;
import com.ljm.demo.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress>  getReceiveAddressByMemberId(String memberId);
}
