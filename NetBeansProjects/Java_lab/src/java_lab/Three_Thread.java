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
public class Three_Thread implements Runnable {
   int no=9;
   Three_Thread(){
       Thread tt1=new Thread(this,"even_thread");
       Thread tt2=new Thread(this,"odd_thread");
       Thread tt3=new Thread(this,"prime_thread");
       tt1.start();
       tt2.start();
       tt3.start();
   }
   
   public int return_no(){
       return no;
   }

    @Override
    public void run() {
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

