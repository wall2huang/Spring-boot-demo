package com.wallhome.springbootdemo.patterns.ObServerPattern;/**
 * Created by Administrator on 2017/6/5.
 */

import java.util.Observable;
import java.util.Observer;

/**
 * author : Administrator
 **/
public class Watcher implements Observer
{
    @Override
    public void update(Observable o, Object arg)
    {
        System.out.println("被观察者的引用传进来了" + o);
        System.out.println("参数也传进来了" + arg);
    }
}
