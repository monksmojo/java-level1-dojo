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
public class Stack_class {
    int top;
    int[] stack=new int[10];
    
    Stack_class(){
        top=-1;
    }
    
    void create_stack(){
        System.out.println("Creation of stack\n");
        for(int i=0; i<stack.length-1; i++)
        {
            stack[i]=i;
            ++top;
        }
    }
    
    void pop_stack(){
        System.out.println("Pop operation on Stack");
        if(top<=-1){
            System.out.println("underflow\n");
        }
        else{
        int del=stack[top];
        System.out.println("element poped out of stack is   "+del);
        --top;
        }
    }
    
    void push_stack(int ele){
        System.out.println("push operation on Stack");
        if(top>stack.length){
            System.out.println("overflow\n");
        }
        else{
            ++top;
            stack[top]=ele;
        }
    }
    
    void print_stack(){
        System.out.println("printing of stack");
        for(int i=0; i<=top; i++){
            System.out.println(stack[i]);
        }
    }
}
