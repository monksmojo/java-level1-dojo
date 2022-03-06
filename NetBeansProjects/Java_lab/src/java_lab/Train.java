package java_lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xenos martin
 */
public class Train {
final int total_ticket=40;
    static int occupied=10;
    synchronized public int check(int ticket){
        String thread_name=Thread.currentThread().getName();
        System.out.println(thread_name);
        if(thread_name.equals("BookTicket")){
            System.out.println("total tickets "+total_ticket);
            System.out.println("you want to book"+ticket);
                if(ticket+occupied<=total_ticket){
                    System.out.println("seats left "+(total_ticket-occupied));
                    occupied+=ticket;
                    return 1;
                }
        }
        
        else if(thread_name.equals("CancelTicket")){
            System.out.println("total tickets "+total_ticket);
            System.out.println("occupied seats "+occupied);
            System.out.println("you want to cancel"+ticket);
            if(ticket <= occupied){
                occupied-=ticket;
                System.out.println("seats left "+(total_ticket-occupied));
                return 1;
        }  
        }
        
            return 0;
        
        
    }
}