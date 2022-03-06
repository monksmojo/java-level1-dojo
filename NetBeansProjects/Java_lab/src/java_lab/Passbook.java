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
public class Passbook {
    double acc_bal;
    final double min_bal=500;
    int acc_id;
    
    Passbook(double bal, int id){
       this.acc_bal=bal;
       acc_id=id;
    }
    
    void deposit(double d_amount ){
        acc_bal+=d_amount;
    }
    
    void withdrawl(double w_amount)throws PassbookException {
       double temp_bal=acc_bal- w_amount;
       if(temp_bal<=min_bal){
           throw new PassbookException(temp_bal);
       }
       else{
           acc_bal-=w_amount;
       }
       
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("current balance is "+this.acc_bal+"of account id"+this.acc_id);
    }
}
