/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 *
 * @author monks_mojo
 */
public class Java_lab {
    

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws UnknownHostException,FileNotFoundException, IOException, ClassNotFoundException {
          Java_Awt jw=new Java_Awt();
          jw.Card_action();
        //Java_Awt.button_freames3();
        //Java_Awt.button_frames2();
        //Java_Awt.button_frames1();
        
        /*try{
        System.out.println("getByName()");
        InetAddress ina = InetAddress.getByName("www.google.com");
        System.out.println(ina);
        System.out.println("Host Name: "+ina.getHostName());  
        System.out.println("IP Address: "+ina.getHostAddress());  

            
        }catch(UnknownHostException ue){
            System.out.println(ue);
        }*/
        
        //Filefunction ff1=new Filefunction();
        //ff1.ObjectStream();
        //ff1.DataStream();
        //ff1.ByteArrayStream();
        //ff1.file_copy();
        //ff1.fis_function0();
        //ff1.fis_function1();
        
        
       //File_Creation fc1=new File_Creation();
       //fc1.filecreation();
       

        //Collection_classes cc=new Collection_classes();
       //cc.String_ArrayList();
       //cc.Integer_ArrayList();
       //cc.iterator_print();
       //cc.foreach_print();
       //cc.String_LinkedList();
       //cc.Integer_Hashset();
       //cc.Integer_Treeset();
       //cc.String_Hashmap();
       //cc.String_Treemap();
       //cc.String_Hashtable();
       //cc.state_property();
        
        
       /* Booking gratel=new Booking("gratel",55);
        gratel.book_seat(10);
        gratel.cancel_seats(8);*/
        
        
        /*Call_me target=new Call_me();
       Caller c1=new Caller(target,"c1.child");
       Caller c2=new Caller(target,"c2.child");*/
        
        /* Thread mt=Thread.currentThread();
        mt.setName("main Thread");
        System.out.println(mt.getName()+"->started execution ");
        FN_thread2 fn2=new FN_thread2("even_thread");
        String tf_name = fn2.tf.getName();
        if(tf_name.equals("even_thread")){
            try{
             fn2.tf.join();
             System.out.println(mt.getName()+"->is on hold ");
            }catch(InterruptedException e1){
                System.out.println("Cant put main thread to wait");
            }
            FN_thread2 fn22=new FN_thread2("odd_thread");
            System.out.println(mt.getName()+"->is terminated");
        }*/
       
       
        /*Thread mt=Thread.currentThread();
        mt.setName("main Thread");
        FN_thread1 fn1=new FN_thread1("concatinator");
        try{
        System.out.println(mt.getName()+"->started execution with priotity->"+mt.getPriority());
        Thread.sleep(200);
        System.out.println(mt.getName()+"->has been put to sleep");
        }catch(InterruptedException e1){
        System.out.println("Cant put main thread to sleep ");
        }
        System.out.println(mt.getName()+"->has woken up");
        FN_thread1 fn2=new FN_thread1("length_calculator");
        System.out.println(mt.getName()+"->has terminated");*/
        
        /*T_threechild tc1=new T_threechild("even_thread");
        T_threechild tc2=new T_threechild("odd_thread");
        T_threechild tc3=new T_threechild("prime_thread");*/
        /* Three_Thread obj1=new Three_Thread();
        Thread mt=new Thread();
        mt.setName("mainThread");
        String mt_name=mt.getName();
        System.out.println("excution of ->"+mt_name);
        int no=obj1.return_no();
        if(no>=10){
        System.out.println(no+" Greater than 10");
        }
        else{
        System.out.println(no+" less than 10");
        }
        System.out.println("termination of ->"+mt_name);*/
        /*One_Thread ot1 = new One_Thread();
        Thread t1=Thread.currentThread();
        System.out.println(t1);
        t1.setName("String Length Thread");
        String r=ot1.return_string();
        System.out.println("Executing "+t1.getName());
        System.out.println("Lenght of String "+r.length());
        System.out.println("termination "+t1.getName());*/
        /* Thread t1=Thread.currentThread();
        System.out.println(t1);
        t1.setName("Main Thread");
        System.out.println("name of the thread is--"+t1.getName());*/
        /*try{
        Ride r1=new Ride("Roller Coster",300,2.0);
        System.out.println(r1);
        Person p1=new Person(23,"monks mojo",3.5);
        System.out.println(p1);
        r1.check_height(p1);
        Person p2=new Person(22,"freddy mercury",1.5);
        System.out.println(p2);
        r1.check_height(p2);
        }catch(Height_exception he){
        System.out.println(he);   
        }*/
        /*int a=8,b=4;
        int arr[]={10,8,7,6};
        double result;
        try{
        result=a/b;
        System.out.println("Devision Result="+result);
        try{
        System.out.println("Array element"+arr[4]);
        }finally{
        System.out.println("nested try dosen't have its catch so going for outer try catch");
        }
        }
        catch(ArrayIndexOutOfBoundsException ae){
        System.out.println("Array out of Index");
        }
        catch(ArithmeticException ae){
        System.out.println("Cannot devide by 0");
        }
        catch(Exception e){
        System.out.println("Array out of index or no. is devided by zero");
        }*/
        /*try {Passbook p1=new Passbook(800,7);
        p1.deposit(1000);
        System.out.println(p1);
        p1.withdrawl(1200);
        System.out.println(p1);
        p1.withdrawl(200);
        }
        catch(PassbookException pe){
        System.out.println(pe);
        }*/
        /*MyAccount a1=new MyAccount(20000,50000,2);
        a1.passbook();
        a1.calculate_amnt();
        MyAccount a2=new MyAccount(40000,80000,8);
        a2.passbook();
        a2.calculate_amnt();*/
        /*DynamicArray da=new DynamicArray(4);
        da.push(10);
        da.push(20);
        da.push(30);
        da.push(40);
        da.push(50);
        da.pop();
        da.pop();
        da.stack_print();
        FixedArray f1=new FixedArray(5);
        f1.push(10);
        f1.push(20);
        f1.push(30);
        f1.push(40);
        f1.push(50);
        f1.pop();
        f1.pop();
        f1.stack_print();*/
        /* MoneyConvertor i2d=new MoneyConvertor(700);
        i2d.To_dollar();
        MoneyConvertor d2=new MoneyConvertor(8);
        d2.Dollar_to();*/
        //double b=3.145763;
        //char c='A';
        //int a=10;
        //String str1="777";
        //String str2="hello";
        //Wrapper_class w1=new Wrapper_class(c,str2);
        //System.out.println("welcome");
        //Strings_class s1=new Strings_class();
        /*Stack_class st1=new Stack_class();
        st1.create_stack();
        st1.pop_stack();
        st1.push_stack(99);
        st1.print_stack();*/
        //Call_class alpha=new Call_class();
        // Box_Tostring b1=new Box_Tostring(5,4);
        //System.out.println(b1);
    }
} 