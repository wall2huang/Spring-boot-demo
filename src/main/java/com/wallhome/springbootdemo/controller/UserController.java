package com.wallhome.springbootdemo.controller;/**
 * Created by Administrator on 2017/6/4.
 */

import com.github.wall2huang.annotation.ZkValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * author : Administrator
 **/
@RestController
@ZkValue
public class UserController
{

    @ZkValue(path = "/springBoot/demo", value = "测试")
    private String value;

    @RequestMapping("/test")
    public String  test()
    {
        return value;
    }

}
