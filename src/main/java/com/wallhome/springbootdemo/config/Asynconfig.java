package com.wallhome.springbootdemo.config;/**
 * Created by Administrator on 2017/9/7.
 */

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/**
 * author : Administrator
 **/
@Configuration
@EnableAsync
public class Asynconfig implements AsyncConfigurer
{


    @Override
    public Executor getAsyncExecutor()
    {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(10);
        executor.initialize();
        return executor;

    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler()
    {
        return new AsyncUncaughtExceptionHandler()
        {
            @Override
            public void handleUncaughtException(Throwable throwable, Method method, Object... objects)
            {
                System.out.println("异步方法返回值为空并且抛出错误");
            }
        };
    }
}
