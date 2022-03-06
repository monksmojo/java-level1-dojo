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
public class Booking implements Runnable {
String p_name;
    int age;
    int bticket=0;
    int cticket=0;
    Train seat;
    Booking(String pn, int a){
        p_name=pn;
        age=a;
        seat=new Train();
        
    }
    
    
@Override
    public String toString(){
        return String.format("Passenger name = " + this.p_name + " age= "+ this.age +" has booked"+bticket+" tickets and has cancelled "+ cticket+" tickets");
    }
    
    void book_seat(int pess){
        bticket=pess;
        Thread bt= new Thread(this,"BookTicket");
        bt.start();
    }
    
    void cancel_seats(int pess){
        System.out.println("Cancillation of ticket");
        cticket=pess;
        Thread ct= new Thread(this,"CancelTicket");
        ct.start();
        
    }

    @Override
    public void run() {
        Thread current=Thread.currentThread();
        String ct_name=current.getName();
        
        if(ct_name.equals("BookTicket")){
            System.out.println("Booking in progress");
            int res = seat.check(bticket);
            if(res==1){
                System.out.println("Your"+bticket+"tickets have been booked" );
            }
            else{
                System.out.println("Your"+bticket+"cannot be booked");
                System.out.println("no vacant seats available");
            }
        }
        
        else{
            System.out.println("Cancillation in progress");
            if(cticket < bticket){
              int res=seat.check(cticket);
              if(res==1){
                  System.out.println("Your"+cticket+"tickets have been cancelled" );
              }
            }
            else{
                System.out.println("Your"+cticket+"cannot be cancelled");
                System.out.println("cancillation more than booking seats");
            }
        }
    }
    
    
}
