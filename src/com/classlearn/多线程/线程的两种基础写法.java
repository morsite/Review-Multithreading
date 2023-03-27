package com.classlearn.多线程;

public class 线程的两种基础写法 {
    public static void main(String[] args) {
        /*
        * java.lang.Thread
        * run:线程中的主执行方法 程序必须放在run方法中才能得以实行
        * start:启动该线程中的方法 让run方法里面的东西执行
        * 创建线程的两种方式：
        *           1.继承Thread
        *               class 线程类 extends Thread{
        *                   public void run(){
        *                           }}
        *               线程类 对象 = new线程类();
        *               对象.start();
        *           2.实现Runnable接口
        *                   class 线程类 implements Runnable{
        *                       public void run(){
        *                       }
        *                   线程类 对象 = new线程类();
        *                   new Thread(对象).start();}
        * */

        Music m = new Music();
        m.start();
        Voice voice = new Voice();
        new Thread(voice).start();
    }
    static class Music extends Thread{
        @Override
        public void run() {
            for(int i=0;i<=100;i++){
                System.out.print(i+" ");
            }
        }
    }

    static class Voice implements Runnable{
        @Override
        public void run() {
            for(char ch='A';ch<='z';ch++){
                System.out.print(ch);
            }
        }
    }
}
