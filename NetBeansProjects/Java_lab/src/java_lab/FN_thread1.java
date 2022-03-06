/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;

/**
 *
 * @author xenos martin
 */
public class FN_thread1 extends Thread {
    String s1="Hello";
    String s2="Darkness";
    static int p=3;

    /**
     *
     */
    public Thread t1;
    FN_thread1(String name){
        super(name);
        System.out.println("creating thread by extending the thread class");
        start();
    }

    /**
     *
     */
    @Override
    public void run(){
        t1=Thread.currentThread();
        String to_name=t1.getName();
        if(to_name.equals("concatinator")){
            t1.setPriority(++p);
            System.out.println(to_name+"execution started with prioroty"+ p);
            String s3=s1+s2;
            System.out.println("concatination of "+ s1+" "+s2+" is "+s3);
        }
        else{
            t1.setPriority(++p);
            System.out.println(to_name+"execution started with priority"+ p);
            String s3=s1+s2;
            System.out.println("length of string"+ s3+" is "+s3.length());
            
        }
    }
}
