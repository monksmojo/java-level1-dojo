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
public class Wrapper_class {
    Wrapper_class(int i, String str)
    {
        System.out.println("integer no. wrapper class \n");
        Integer i1=new Integer(i);
        Integer i2=new Integer(str);
        Integer i3=Integer.valueOf("76");
        
        System.out.println("the INT value "+i2.intValue());
        System.out.println("the FLOAT value "+i1.floatValue());
        System.out.println("the INT to String value "+i1.toString());
        System.out.println("the BYTE value "+i2.byteValue());
        System.out.println("the doubleValue value "+i2.doubleValue());
        System.out.println("the longValue value "+i3.longValue());
        System.out.println("the shortValue value "+i3.shortValue());
         System.out.println("Invoking object :"+i1+" Called Object :"+i2);
        System.out.println(i1.compareTo(i2));
        System.out.println("Calling Integer object i1:"+i1+" Called Integer Object i2:"+i1);
        System.out.println(i1.equals(i1));
        System.out.println("Returning simple data type");
        System.out.println(Integer.parseInt(str));

    }
    Wrapper_class(double d, String str){
        Double d1=new Double(d);
        Double d2=new Double(str);
        Double d3=Double.valueOf("76.88");
        
        System.out.println("The DOUBLE value "+d2.doubleValue());
        System.out.println("The INT value "+d1.intValue());
        System.out.println("The BYTE value "+d1.byteValue());
        System.out.println("The FLOAT value "+d2.floatValue());
        System.out.println("The LONG value "+d2.longValue());
        System.out.println("The SHORT value "+d3.shortValue());
        System.out.println("The STRING "+d3.toString());
        System.out.println("Invoking object :"+d1+" Called Object :"+d2);
        System.out.println(d1.compareTo(d2));
        System.out.println("Invoking object :"+d1+" Called Object :"+d2);
        System.out.println(d1.equals(d2));
        System.out.println("Returning simple data type");
        System.out.println(Double.parseDouble(str));

        
    }
    
        Wrapper_class(char ch, String str){
        Character ch1=new Character(ch);
        char[] ch2= str.toCharArray();
        System.out.println("Is it a letter"+Character.isLetter(ch1));
        System.out.println(ch2);
        System.out.println("Is it a Digit"+Character.isDigit(ch1));
        System.out.println("Is it a uppercase"+Character.isUpperCase(ch1));
        System.out.println("Is it a lowercase"+Character.isLowerCase(ch1));
        System.out.println("To uppercase"+Character.toUpperCase(ch1));
        System.out.println("To lowercase"+Character.toLowerCase(ch1));
    }
            
    
}
