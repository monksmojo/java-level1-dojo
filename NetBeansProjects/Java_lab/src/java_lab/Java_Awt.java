/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;
import static com.sun.java.accessibility.util.AWTEventMonitor.addItemListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author xenos martin
 */
public class Java_Awt implements ActionListener,ItemListener {
        JFrame f4;
        Checkbox c1,c2,c3,c4,c5,c6;
        Button b1,b2;
        Panel p1,p2,p3,p4,p5;
        Label l1,l2,l3,l4;
        CardLayout c= new CardLayout();
        String msg="";
    public static void button_frames1(){
        JFrame f1=new JFrame();
        Label l2=new Label("FLOW LAYOUT");
        Label l1=new Label("DO YOU LIKE MCA IN LBSIM");
        f1.add(l2);
        f1.add(l1);
        f1.setLayout(new FlowLayout(FlowLayout.LEADING));
        
        Button b1=new Button("ARE YOU KIDDIND ME");
        Button b2=new Button("NO");
        Button b3=new Button("HELL NO");
        
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        
        f1.setLayout(new FlowLayout(FlowLayout.LEFT));
        f1.setSize(300,300);
        f1.setVisible(true);

    }
    
    public static void button_frames2(){
        JFrame f2=new JFrame();
        JLabel jl1=new JLabel("BorderLayout");
        JButton jb1=new JButton("NORTH");
        JButton jb2=new JButton("SOUTH");
        JButton jb3=new JButton("EAST");
        JButton jb4=new JButton("WEST");
        JButton jb5=new JButton("CENTER");
        
        f2.add(jl1);
        f2.add(jb1,BorderLayout.NORTH);
        f2.add(jb2,BorderLayout.SOUTH);
        f2.add(jb3,BorderLayout.EAST);
        f2.add(jb4,BorderLayout.WEST);
        f2.add(jb5,BorderLayout.CENTER);
        
        f2.setSize(300,300);
        f2.setVisible(true);
    }
    
    public static void button_freames3(){
        JFrame jf3=new JFrame();
        Label l3=new Label("GRID LAYOUT");
        String name;
        jf3.add(l3);
        for(int i=0; i<10; i++){
            name=String.format("%d",i+1);
            jf3.add(new Button(name));
        }
        jf3.setLayout(new GridLayout(3,5,2,2));
        jf3.setSize(400,400);
        jf3.setVisible(true);
    }
    
    public void Card_action(){
        f4=new JFrame("Operating System");
        f4.setLayout(new GridLayout(3,1));
        p1=new Panel(new FlowLayout());
        f4.add(p1);
        b1=new Button("Windows");
        b2=new Button("Other");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p1.add(b1,Component.CENTER_ALIGNMENT);
        p1.add(b2,Component.CENTER_ALIGNMENT);
        
        p2=new Panel(new GridLayout());
        c1=new Checkbox("Window XP",true);
        c2=new Checkbox("WINDOWS 7");
        c3=new Checkbox("WINDOWS 10");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        p2.add(c1);
        p2.add(c2);
        p2.add(c3);
        
        p3=new Panel(new GridLayout());
        
        c4=new Checkbox("Ubuntu",true);
        c5=new Checkbox("Fedora");
        c6=new Checkbox("Android");
        c4.addItemListener(this);
        c5.addItemListener(this);
        c6.addItemListener(this);
        p3.add(c4);
        p3.add(c5);
        p3.add(c6);
        
        p4=new Panel(c);
        p4.add(p3);
        p4.add(p2);
        f4.add(p4);
        l1 = new Label("You have SELECTED: ");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label(" ");
        
        p5 = new Panel(new GridLayout(1,2));
        p5.add(l1,Component.LEFT_ALIGNMENT);
        p5.add(l2,Component.LEFT_ALIGNMENT);
        p5.add(l3,Component.LEFT_ALIGNMENT);
        p5.add(l4,Component.CENTER_ALIGNMENT);
        f4.add(p5);
        f4.setVisible(true);
        f4.setSize(500,400);


        

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        c.next(p4);
        msg=" ";
        l2.setText(msg);
  
    }

    @Override
    public void itemStateChanged(ItemEvent i) {
    Checkbox c = (Checkbox)i.getSource();
        if(c==c1||c==c4){
            l2.setText(" ");
            if(i.getStateChange()==1){
                l2.setText(((Checkbox) i.getSource()).getLabel());
            }else if(i.getStateChange()==0){
                l2.setText(" ");
            }
        }
        if(c==c2||c==c5){
            l3.setText(" ");
            if(i.getStateChange()==1){
                l3.setText(((Checkbox) i.getSource()).getLabel());
            }else if(i.getStateChange()==0){
                l3.setText(" ");
            }
        }
        if(c==c3||c==c6){
            l4.setText(" ");
            if(i.getStateChange()==1){
                l4.setText(((Checkbox) i.getSource()).getLabel());
            }else if(i.getStateChange()==0){
                l4.setText(" ");
            }
        }

    }
    
}
