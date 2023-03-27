package com.classlearn.多线程;

public class Test5 {
    public static void main(String[] args) {
        ThreadC tc = new ThreadC();
        tc.setName("猫");
        tc.setPriority(Thread.MIN_PRIORITY);//最小优先级1

        ThreadC tc2 = new ThreadC();
        tc2.setName("狗");
        tc2.setPriority(Thread.MAX_PRIORITY);//最大优先级10

        ThreadC tc3 = new ThreadC();
        tc3.setName("兔");
        tc3.setPriority(Thread.NORM_PRIORITY);//正常优先级5
        tc.start();
        tc2.start();
        tc3.start();
    }
}
class ThreadC extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}