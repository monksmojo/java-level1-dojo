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
public class Ride {
    String ride_name;
    int cost;
    double height_required;
    
    Ride(String rn,int c,double hr){
       ride_name=rn;
       cost=c;
       height_required=hr;
    }
    

    
    void check_height(Person p0) throws Height_exception{
        double temp_height=p0.get_height();
        if(temp_height<height_required){
            throw new Height_exception(p0,temp_height,height_required);
        }
        else{
            System.out.println(p0.get_name()+" can go on this ride");
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("Ride = "+ride_name +" cost= "+cost+" & hieght required= "+height_required);
    }
}
