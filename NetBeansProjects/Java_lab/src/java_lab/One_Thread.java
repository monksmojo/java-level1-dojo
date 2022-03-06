/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;

/**
 *
 * @author monks_mojo
 */
public class One_Thread implements Runnable  {
    String a="hello";
    String b="world";
    One_Thread(){
        Thread t1= new Thread(this,"concatinator");
        System.out.println(t1+" is born");
        t1.start();
    }
    
    String return_string(){
        String c;
        c=a+b;
        return c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        String c=a+b;
        System.out.println("Concatination of two strings "+ a +"  "+ b+"  " +c);
        System.out.println("Termination of  "+Thread.currentThread());
    }
}
