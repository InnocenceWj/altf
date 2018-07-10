package com.wj.altf.controller;

import com.wj.altf.entity.User;
import com.wj.altf.service.UserService;
import com.wj.altf.util.SnowflakeIdWorker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    @ResponseBody
    public Long addUser(User user) {
        if (user.getuName() == null || user.getuIconUrl() == null) {
            user.setuName(getName());
        }
        user.setuId(SnowflakeIdWorker.getInstance().nextId());
        user.setuRegisterTime(new Date());
        user.setuIsValid(true);
        userService.insert(user);
        return user.getuId();
    }

    public static String getName() {
        String name = "wx";
        Date ss = new Date();
        SimpleDateFormat format0 = new SimpleDateFormat("yyyyMMddHHmmss");
        name += format0.format(ss.getTime()) + (int) (Math.random() * 10);
        return name;
    }


}
