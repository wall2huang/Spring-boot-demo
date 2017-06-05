package com.wallhome.springbootdemo.patterns.ObServerPattern;/**
 * Created by Administrator on 2017/6/5.
 */

import java.util.Observable;

/**
 * author : Administrator
 **/
public class Watched extends Observable
{

    public static void main(String[] args)
    {
        Watcher watcher = new Watcher();
        Watched watched = new Watched();
        watched.addObserver(watcher);

        watched.setChanged();
        watched.notifyObservers("hello");

    }




}
