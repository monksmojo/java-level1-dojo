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
public class Call_me {
    synchronized public void call(String name){
    System.out.println("[ we are starting"+name +"but going to sleep");
    try{
        Thread t1=Thread.currentThread();
        System.out.println("we are making->"+t1.getName()+"-> to sleep");
        Thread.sleep(500);
    }catch(InterruptedException e1){
        Thread t1=Thread.currentThread();
        System.out.println(t1.getName()+"-> cant go to sleep");
    }
    System.out.println(name +"->just woke up GOODBYE ALL MY FRNDS ]");
}
    
}
