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
public class Person {
    int age;
    String name;
    double height;
    
    Person(int a,String n, double h){
        age=a;
        name=n;
        height=h;
    }

    /**
     *
     * @return
     */
    public double get_height(){
        return height;
    }
    
    public String get_name(){
        return name;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("name is "+name+" age= "+age+" & hieght= "+height);
    }
}
