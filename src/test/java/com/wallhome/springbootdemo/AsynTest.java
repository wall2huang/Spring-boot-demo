package com.wallhome.springbootdemo;/**
 * Created by Administrator on 2017/9/7.
 */

import com.wallhome.springbootdemo.service.AsynService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author : Administrator
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class AsynTest
{
    @Autowired
    private AsynService asynService;

    @Test
    public void testExceptionHandler() throws InterruptedException
    {
        asynService.startVoidTypeAsyn();
        Thread.sleep(4000);
    }

}
