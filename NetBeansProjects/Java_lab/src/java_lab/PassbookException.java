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
public class PassbookException extends Exception {
    double low_bal;
    PassbookException(double a){
        low_bal=a;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("cannot withdrawl this much amount\n leads to low balance of"+low_bal);
    }
}
