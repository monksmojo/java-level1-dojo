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
public class FixedArray implements StackInterface{
    int[] st;
    int top;
    int size=0;
    
    FixedArray(int s){
        size=s;
        top=-1;
        st= new int[size];
    }

    @Override
    public void push(int ele) {
        if(top >= size){
            System.out.println("OVERFLOW");
            st= new int[size*2];
        }
        else{
            System.out.println("element pushed into stack"+ele);
            ++top;
            st[top] = ele;
        }
    }

    @Override
    public void pop() {
        if(top<=-1){
            System.out.println("UNDERFLOW");
        }
        else{
            System.out.println("element poped out of stack is "+st[top]);
            --top;
            
        }
    }
    
    void stack_print(){
        System.out.println("Printing of stack");
        for(int i=0; i <= top;i++){
            System.out.println(st[i]);
        }
    }
    
}
