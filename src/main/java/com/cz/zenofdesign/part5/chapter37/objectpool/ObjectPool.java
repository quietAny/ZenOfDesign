package com.cz.zenofdesign.part5.chapter37.objectpool;

import java.util.Hashtable;

/**
 * @ClassName: ObjectPool
 * @date: 2019/7/17  11:17
 * @author: guohao
 * @Description:
 */
public abstract class ObjectPool<T> {
    //容器，容纳对象
    private Hashtable<T,ObjectStatus> pool = new Hashtable<T, ObjectStatus>();
    //初始化对象放在池中
    public ObjectPool(){
        pool.put(create(),new ObjectStatus());
    }
    //从Hashtable中取出空闲元素
    public synchronized T checkOut(){
        for (T t : pool.keySet()) {
            if(pool.get(t).validate()){
                pool.get(t).setUsing();
                return t;
            }
        }
        return null;
    }
    //归还对象
    public synchronized void checkIn(T t){
        pool.get(t).setFree();
    }

    class ObjectStatus{
        //占用
        public void setUsing(){
        }
        //释放
        public void setFree(){
        }
        //检查是否可用
        public boolean validate(){
            return false;
        }
    }

    public abstract T create();
}
