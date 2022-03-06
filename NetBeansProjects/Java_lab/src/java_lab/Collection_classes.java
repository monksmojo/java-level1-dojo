/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeMap;
//import javafx.beans.property.Property;

/**
 *
 * @author monks_mojo
 */
public class Collection_classes {
    
       ArrayList <String> al1 = new ArrayList();

    void String_ArrayList(){
        
        System.out.println("adding 5 element into arraylist");
        al1.add("jhon");
        al1.add("watson");
        al1.add("mayer");
        al1.add("trovolta");
        al1.add("kennedy");
        System.out.println("Size of ArrayList= "+al1.size());
        System.out.println("printing content of arraylist");
        System.out.println(al1);
        System.out.println("adding element at perticular index");
        al1.add(1,"sherlock");
        System.out.println("Size of ArrayList= "+al1.size());
        System.out.println("printing content of arraylist");
        System.out.println(al1);
        System.out.println("removing the element from ArrayList");
        al1.remove("kennedy");
        al1.remove("trovolta");
        System.out.println("Size of ArrayList= "+al1.size());
        System.out.println("printing content of arraylist");
        System.out.println(al1);
        
    }
    
    void iterator_print(){
        Iterator it=al1.iterator();
        System.out.println("printing elements of arraylist with the help of iterator");
        while(it.hasNext()!=false){
            System.out.println(it.next());
        }
    }
    
    void foreach_print(){
        System.out.println("printing element of arraylist with the help of foreach loop");
        for(String o: al1){
            System.out.println(o);
        }
    }
    
    
    void Integer_ArrayList(){
        ArrayList <Integer> ai1 = new ArrayList();
        System.out.println("adding 4 element into  Integer arraylist 1");
        ai1.add(2);
        ai1.add(4);
        ai1.add(6);
        ai1.add(8);
        System.out.println("Size of ArrayList 1= "+ai1.size());
        System.out.println("printing content of arraylist 1");
        System.out.println(ai1);
        System.out.println("adding element at perticular index");
        ai1.add(1,1);
        System.out.println("Size of ArrayList 1= "+ai1.size());
        System.out.println("printing content of arraylist 1");
        System.out.println(ai1);
        System.out.println("Creating a second ArrayList same size as first ArrayList");
        ArrayList <Integer> ai2 = new ArrayList(ai1.size());
        System.out.println("adding 4 element into  Integer arraylist 2");
        ai2.add(12);
        ai2.add(14);
        ai2.add(16);
        ai2.add(18);
        System.out.println("Size of ArrayList 2= "+ai2.size());
        System.out.println("printing content of arraylist 2");
        System.out.println(ai2);
        System.out.println("Converting first ArrayList into array to find sum of element");
        Integer[] arr= new Integer[ai1.size()];
        arr=ai1.toArray(arr);
        int sum=0;
        System.out.println("elements of array");
        for (Integer arr1 : arr) {
            System.out.println(arr1);
            sum += arr1;
        }
        System.out.println("Sum of Elements");
        System.out.println(sum);
    }
    
    void String_LinkedList(){
        System.out.println("creating a linkedlist");
        LinkedList <String> ll1=new LinkedList();
        System.out.println("adding 5 elemennts to linkedlist");
        ll1.addFirst("Kurt");
        ll1.push("eminem");
        ll1.add("jimmy");
        ll1.add(0,"JIMI");
        ll1.addLast("Robert");
        System.out.println("elements in the list");
        System.out.println(ll1);
        System.out.println("first element"+ ll1.getFirst());
        System.out.println("last element"+ll1.getLast());
        System.out.println("size of linked list"+ll1.size());
        System.out.println("Removing of second element");
        ll1.remove(2);
        System.out.println("size of linked list after removing 1 element"+ll1.size());
        System.out.println("elements in the final list");
        System.out.println(ll1);
    }
    
    
    
    void Integer_Hashset(){
       HashSet<Integer> hs= new HashSet();
       System.out.println("A HashSet");
       System.out.println("inserting 5 elements");
       hs.add(2);
       hs.add(4);
       hs.add(6);
       hs.add(8);
       hs.add(10);
       System.out.println("printing value of hashset");
       System.out.println(hs);
       System.out.println("Floor function");
   }
   
   
    void Integer_Treeset(){
       TreeSet<Integer> ts= new TreeSet();
       System.out.println("A treeSet");
       System.out.println("inserting 5 elements");
       ts.add(1);
       ts.add(3);
       ts.add(5);
       ts.add(7);
       ts.add(9);
       System.out.println("printing value of Treeset");
       System.out.println(ts);
       System.out.println("Floor function  "+ ts.floor(8));
       System.out.println("higher function  "+ ts.higher(8));
       System.out.println("lower function  "+ ts.lower(8));
       System.out.println("Pollfirst function  "+ ts.pollFirst());
       System.out.println("Polllast function  "+ ts.pollLast());
       System.out.println("printing value of Treeset after functions");
       System.out.println(ts);
   }
    
    void String_Hashmap(){
        System.out.println("creating a HashMap <String,Double> ");
        HashMap hm =new HashMap();
        System.out.println("Inserting data into hashmap");
        hm.put("clark",15000.35);
        hm.put("bruce",20000.30);
        hm.put("steven",10000.85);
        hm.put("kendric",45000.15);
        hm.put("tupac",78000.25);
        System.out.println("key and value of hashmap"+hm);
        System.out.println("geting only the key values");
        Set <String> se1=hm.keySet();
        for(String s: se1){
        System.out.println(s);
        }
        System.out.println("getting account balance of tupac");
        double bal=(double) hm.get("tupac");
        bal+=15000;
        System.out.println("updating account balance of tupac");
        hm.put("tupac", bal);
        System.out.println("hashmap elements are updating value");
        System.out.println(hm);
    }
    
    void String_Treemap(){
        System.out.println("creating a TreeMap <String,Double> ");
        TreeMap tm =new TreeMap();
        System.out.println("Inserting data into treemap");
        tm.put("david",15000.35);
        tm.put("jimmi",20000.30);
        tm.put("dan",10000.85);
        tm.put("alex",45000.15);
        tm.put("matt",78000.25);
        System.out.println("key and value of treemap"+tm);
        System.out.println("geting only the key values");
        Set <String> s2=tm.keySet();
        for(String s: s2){
        System.out.println(s);
        }
        System.out.println("getting account balance of matt");
        double bal=(double) tm.get("matt");
        bal+=15000;
        System.out.println("updating account balance of matt");
        tm.put("matt", bal);
        System.out.println("treemap elements are updating value");
        System.out.println(tm);
    }
    
    void String_Hashtable(){
        System.out.println("creating a HashTable <String,Double> ");
        Hashtable ht =new Hashtable();
        System.out.println("Inserting data into Hashtable ");
        ht.put("paul",16000.35);
        ht.put("lenon",21000.30);
        ht.put("ringo",12000.85);
        ht.put("jon",41000.15);
        ht.put("robert",74000.25);
        System.out.println("key and value of hashmap"+ht);
        System.out.println("geting only the key values in the enumeration");
        Enumeration <String> en=ht.keys();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        System.out.println("getting account balance of robert");
        double bal;
        bal = (double) ht.get("robert");
        System.out.println("old balance of robert"+bal);
        bal+=15000;
        System.out.println("new balance of robert"+bal);
        System.out.println("updating account balance of robert");
        ht.put("tupac", bal);
        System.out.println("hashmap elements are updating value");
        System.out.println(ht);
    }
    
    void state_property(){
        Properties pr = new Properties();
        System.out.println("creating a Properties object");
        System.out.println("Inserting data into properties <States,Capital> ");
        pr.put("punjab","chandigarh");
        pr.put("rajisthan","jaipur");
        pr.put("madhya pradesh","jaipur");
        pr.put("sikkim","gangtok");
        pr.put("tamil nadi","chennai");
        System.out.println("key and value of hashmap"+pr);
        System.out.println("geting only the key values in the enumeration");
        Enumeration en=pr.propertyNames();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
