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
class Height_exception extends Exception {
    String rider_name;
    double rider_height;
    double min_height;
    
 Height_exception(Person p0,double temp_height,double height_required ){
     rider_name=p0.get_name();
     rider_height=temp_height;
     min_height=height_required;
 }
 
    @Override
     public String toString(){
        return String.format("Rider "+rider_name+"with height "+rider_height+" cannot ride becuase minimum height is "+min_height);
    }
}
