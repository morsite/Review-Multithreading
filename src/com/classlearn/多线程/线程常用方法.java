package com.classlearn.多线程;

public class 线程常用方法 {
    public static void main(String[] args) {
        System.out.println(111);
        //static void sleep(long millis) 让进城休眠指定的时间 单位 毫秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Test4{
    public static void main(String[] args) {
        /*1.getId 2.getName 3.getState 4.getPriority 5.setName 6.setPriority 7.currentThread*/
        ThreadA ta = new ThreadA();
        ta.setName("A线程");
        ta.setPriority(4);
        ta.start();
    }
}
class ThreadA extends Thread{
    @Override
    public void run() {
        System.out.println("sdfghj");
        System.out.println("id:"+Thread.currentThread()/*当前运行的线程*/.getId());
        System.out.println("name："+Thread.currentThread().getName());
        System.out.println("优先级："+Thread.currentThread().getPriority());
        System.out.println("State:"+Thread.currentThread().getState());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("zxcvbn");
    }
}
