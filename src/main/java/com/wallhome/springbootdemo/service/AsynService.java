package com.wallhome.springbootdemo.service;/**
 * Created by Administrator on 2017/9/7.
 */

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * author : Administrator
 **/
@Service
public class AsynService
{

    @Async
    public void startVoidTypeAsyn() throws InterruptedException
    {
        System.out.println("异步方法开始执行");
        Thread.sleep(1000);
        System.out.println("异步方法执行完毕");
        throw new RuntimeException();
    }

}
