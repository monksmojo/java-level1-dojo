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
public class Box_Tostring {
    int length;
    int breadth;
    Box_Tostring(int l,int b){
        length=l;
        breadth=b;
    }


    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("length = " + this.length + " bredth = "+ this.breadth);
    }
}

