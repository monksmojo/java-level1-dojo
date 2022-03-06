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
public class MyAccount implements IntrestRate {
    int sa_amount;
    int time;
    int fd_amount;
    float si_sa;
    float si_fda; 
    MyAccount(int sa,int fda, int t){
        sa_amount=sa;
        time=t;
       fd_amount=fda;
    }
    
    void passbook(){
        System.out.println("Amount in saving account ="+sa_amount);
        System.out.println("fixed amount of "+fd_amount+" is done for "+time+" time");
    }

    @Override
    public void calculate_amnt() {
        si_sa=(float) ((sa_amount*SBR*1)/100);
        System.out.println("intrest on savings acount amount after 1 year is ="+si_sa);
        if(time >= 5){
        si_fda=(float) ((fd_amount*FDR2*1)/100);
        System.out.println("intrest on fixed acount amount after 1 year is ="+si_fda);
        }
        else{
         si_fda=(float) ((fd_amount*FDR1*1)/100);
         System.out.println("intrest on fixed acount amount after 1 year is ="+si_fda);
        }
        
    }


    
}
