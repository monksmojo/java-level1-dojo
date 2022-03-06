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
public class FN_thread2 implements Runnable {
    int no=6;
    public Thread tf;

    FN_thread2(String name){
        tf=new Thread(this,name);
        tf.start();
    }
    @Override
    public void run() {
        String tf_name=tf.getName();
        if(tf_name.equals("odd_thread")) {
            System.out.println("Excution of-> "+tf_name);
            if(no%2!=0){
                System.out.println(no+" Is odd");
            }
            else{
                System.out.println(no+" Is Not odd");
            }
            System.out.println("Temination of-> "+tf_name);
        }
        
        
        if(tf_name.equals("even_thread")) {
            System.out.println("Excution of-> "+tf_name);
            if(no%2==0){
                System.out.println(no+" Is Even");
            }
            else{
                System.out.println(no+" Is Not Even");
            }
            System.out.println("temination of-> "+tf_name);
        }
        
    }
    
}
