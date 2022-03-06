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
public class Caller implements Runnable {
    Call_me target;
    String name;
    Thread t1;
    
    Caller(Call_me t,String n){
        target=t;
        name=n;
        t1=new Thread(this,name);
        System.out.println(t1.getName()+"-> is born");
        t1.start();
    }

    @Override
    public void run() {
        System.out.println(t1.getName()+"-> is executing");
        target.call(name);
        System.out.println(t1.getName()+"-> is terminated");
    }
    
}
