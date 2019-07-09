package com.liu.base.coll013;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class UseCopyOnWrite {

    public static void main(String[] args) {
        //读写分离的容器
        CopyOnWriteArrayList<String> cwal = new CopyOnWriteArrayList<String>();
        CopyOnWriteArraySet<String> cwas = new CopyOnWriteArraySet<String>();

        cwal.add("hello");
        cwal.add("world");


    }
}
