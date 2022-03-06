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
public class T_threechild extends Thread{
    int no=6;
    T_threechild(String name){
     super(name);   
     System.out.println("Creation of thread child by extending thread class");   
     start();
    }

    /**
     *
     */
    @Override
    public void run(){
        Thread tt0=Thread.currentThread();
        String tn=tt0.getName();
        if(tn.equals("even_thread")) {
            System.out.println("Excution of-> "+tn);
            if(no%2==0){
              System.out.println(no+" Is Even");
            }
            else{
                System.out.println(no+" Is Not Even");
            }
            System.out.println("temination of-> "+tn);
        }
        
        
        else if(tn.equals("odd_thread")){
            System.out.println("Excution of-> "+tn);
            if(no%2!=0){
              System.out.println(no+" Is odd");
            }
            else{
                System.out.println(no+" Is Not odd");
            }
            System.out.println("temination of-> "+tn);
        }
        
        else{
            int flag=0;
            System.out.println("Excution of-> "+tn);
            for(int i=2; i<no; i++){
                if(no%i == 0){
                flag=1;    
                }
            }
            if(flag==1){
                System.out.println(no+" Is Not Prime");
            }
            else{
                System.out.println(no+" Is Prime");
            }
                
            
            System.out.println("temination of-> "+tn);
        }    
        
       }
    }

