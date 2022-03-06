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
public class Strings_class {
    Strings_class(){
        System.out.println("Inside Strings class \n");
        System.out.println("Testing Various string class function\n");
        
        char ch1[]={'a','b','c','d','e','f','g'};
        String s1=new String(ch1);
        System.out.println("creating a string out of charater array");
        System.out.println(s1);
      
        String s2=new String(ch1,2,4);
        System.out.println("creating a substring out of charater array");
        System.out.println(s2);
        
        byte b1[]={67,68,69,70,71};
        String s3=new String(b1);
        System.out.println("creating a string out of byte array\n"+s3);
        
        
        String s4=new String(b1,2,3);
        System.out.println("creating a substring out of charater array\n"+s4);
        
        char ch2[]=new char[s2.length()];
        byte b2[]=new byte[s2.length()];
        s2.getChars(0, 3, ch2, 0);
        b2=s2.getBytes();
        System.out.println("converting string into character array\n");
        for(int i=0;i<ch2.length;i++)
        {
            System.out.println(ch2[i]);
        }
        
        System.out.println("converting string into bytes array\n");
        for(int i=0;i<b2.length;i++)
        {
            System.out.println(b2[i]);
        }
        
        String l1="Collateral";
        String l2="Damage";
        String l3="damage";
        System.out.println("lentgh of a string \t"+l1.length());
        System.out.println("concatination of two strings\n"+l1+l2);
        System.out.println(l1.charAt(0)+"\t char at 0 index using charat function");
        if(l2.equals(l3))
        {
            System.out.println("two strings are eqaual with case senstivity\n");
        }
        else if(l2.equalsIgnoreCase(l3))
        {
            System.out.println("two strings are eqaual without case senstivity\n");
        }
        
        else
        {
            System.out.println("two strings are not equal");
        }
        
        System.out.println("comparing of two strings with compare to function \t"+l1.compareTo(l2));
        System.out.println("converting string into upper case \t"+l1.toUpperCase());
        System.out.println("converting string into lower case \t"+l1.toLowerCase());
    }
}

