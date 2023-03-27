package com.classlearn.多线程;

public class 线程进程和程序 {
    //实现一边播放歌曲，一边调节音量
    public static void main(String[] args) {
        线程进程和程序 test1 = new 线程进程和程序();
        test1.playMusic();
        test1.playVoice();
        //不可能交替执行
        //程序：磁盘上的应用程序，一个程序由多个进程组成
        //进程：正在运行的程序，一个进程由多个线程组成
        //线程：程序执行流的最小单位
    }
    public void playMusic(){
        for(int i=0;i<=100;i++){
            System.out.println(i+" ");
        }
    }
    public void playVoice(){
        for(char ch='A';ch<='z';ch++){
            System.out.println(ch);
        }
    }

}
