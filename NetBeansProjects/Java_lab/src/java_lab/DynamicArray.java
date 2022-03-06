/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;

public class DynamicArray {
    int[] st;
    int top;
    int size=0;
    
    DynamicArray(int s){
        size=s;
        top=-1;
        st= new int[size];
    }

    public void push(int ele) {
        if(top >= (size-1) ){
            System.out.println("OVERFLOW");
            System.out.println("INCREASING THE SIZE OF ARRAY");
            int temp[];
            temp = new int[size*2];
            for(int i=0; i <= top; i++)
            {
                temp[i]=st[i];
            }
            st=temp;
            ++top;
            st[top]=ele;
            System.out.println("element pushed into stack"+ele);
                    
        }
        
        else{
            ++top;
            st[top] = ele;
            System.out.println("element pushed into stack"+ele);
        }
    }

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
        for(int i=0; i<= top;i++){
            System.out.println(st[i]);
        }
    }
}
