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
public class MoneyConvertor implements MoneyChanger {

    
    float Currency;
    /**
     *
     */
    MoneyConvertor( int c){
        Currency=c;
    }
    @Override
    public void To_dollar(){
        System.out.println("your currency into dollar is = "+Currency/70);
    }
    @Override
    public void Dollar_to(){
        System.out.println("Dollar to inr = "+Currency*70);
        System.out.println("Dollar to nepalese rupee = "+Currency*100);
        System.out.println("Dollar to bangladeah daka = "+Currency*111);
    }
}
