/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author xenos martin
 */
class Employee implements Serializable {
    public String ename;
    public int eno;
    public String edesignation;
    Employee(String ename, int eno,String edesignation){
        this.ename=ename;
        this.eno=eno;
        this.edesignation=edesignation;
    }
    @Override
    public String toString(){
        return String.format("employee name"+ename+"employee designation"+eno+"employee designation"+edesignation);
    }
}
public class Filefunction {
    void fis_function0() throws FileNotFoundException{
    System.out.println("creating files and directores");
    try{
    File f1 = new File("‪D:\\directory0\\file1.txt");
    FileInputStream fis=new FileInputStream("D:\\directory0\\file1.txt");
    System.out.println("using the Fileinputstream constructor to read from file");
    System.out.println("1. read();");
    int read0=fis.read();
    System.out.println("no. of characters that are readed from the filr are"+read0);
    System.out.println("2. read(byte b[]);");
    int nobyte=fis.available();
    byte[] text=new byte[nobyte];
    int read1 = fis.read(text);
    
    for(byte b: text){
        System.out.print((char)b);
    }
    
    }catch(Exception e){
        System.out.println(e);
    }

    
    }
    
    void fis_function1() throws FileNotFoundException, IOException{
    File f1 = new File("‪D:\\directory0\\file1.txt");
    FileInputStream fis=new FileInputStream("D:\\directory0\\file1.txt");
    int no=fis.read();
    int size=fis.available();
    System.out.println("part1");
    System.out.println("no. of character in file"+no);
    System.out.println("size of file"+size);
    
    
    System.out.println("part 2");
    System.out.println("save  part of file in byte array");
    int part=size/4;
    byte[] text0=new byte[part];
    int r=fis.read(text0);
    System.out.println("part of file saved in  byte array which is");
        for(byte b : text0){
        System.out.print((char)b);
    }
    
    System.out.println("\n part 3");
    System.out.println("skip a part of file");
    fis.skip(part);
    System.out.println("part of a file skipped");
    
    System.out.println("part 4");
    System.out.println("print a part on screen");
    byte[] text1=new byte[part];
    int r1=fis.read(text1);
    for(byte b : text1){
        System.out.print((char)b);
    }
    
    
    }
    
    void file_copy() throws FileNotFoundException, IOException{
        
       try(FileOutputStream fos = new FileOutputStream("D:\\directory0\\\\file2.txt")) {
           System.out.println("writing into a file");
             String s="God is woman.";    
             byte text1[]=s.getBytes();  
             fos.write(text1);
             fos.flush();
             fos.close();
            System.out.println("data written into file"); 
             
             FileInputStream fis=new FileInputStream("D:\\directory0\\file2.txt");
             System.out.println("Reading from a file");
             int size=fis.available();
             byte[] text2=new byte[size+5];
             fis.read(text2);
             for(byte b: text2){
                 System.out.print((char)b);
             }
    
       }catch(Exception e){
           System.out.println(e);
       }
       System.out.println("\nsuccess...");
          
    }
    void ByteArrayStream() throws IOException{
        System.out.println("BYTEARRAYOUTPUT STREAM");
        FileInputStream fis=new FileInputStream("D:\\directory0\\file2.txt");
        System.out.println("Reading from a file to Byte Array");
        int size=fis.available();
        byte[] bs0=new byte[size+5];
        fis.read(bs0);
        ByteArrayOutputStream BAOS=new ByteArrayOutputStream();
        System.out.println("writimg a Byte Array to BYTE_ARRAY_OUTPUT_STREAM");
        BAOS.write(bs0);
        System.out.println("extracting from  BYTE_ARRAY_OUTPUT_STREAM");
        byte[] ba=BAOS.toByteArray();
        for(byte b :ba){
            System.out.print((char)b);
        }
        
        System.out.println("BYTEARRAYINPUT STREAM");
        System.out.println("creating BYTE_ARRAY_INPUT_STREAM");
        int c;
        System.out.println("reading from a byte Array");
        ByteArrayInputStream BAIS=new ByteArrayInputStream(bs0);
        while((c=BAIS.read())!=-1){
            System.out.println((char)c);
        }
    }
    
    void DataStream() throws IOException{
        System.out.println("program to show DATA OUTPUT STREAM");
        DataOutputStream DOS=new DataOutputStream(new FileOutputStream("D:\\directory0\\file1.txt"));
        System.out.println("Writing int");
        DOS.writeInt(10);
        System.out.println("Writing double");
        DOS.writeDouble(12.56);
        System.out.println("Writing string");
        DOS.writeUTF("The chain Breakers");
        DOS.close();
        System.out.println("program to show DATA INPUT STREAM");
        DataInputStream DIS=new DataInputStream(new FileInputStream("D:\\directory0\\file1.txt"));
        System.out.println("Reading int");
        System.out.println(DIS.readInt());
        System.out.println("Reading double");
        System.out.println(DIS.readDouble());
        System.out.println("Reading String");
        System.out.println(DIS.readUTF());
        DIS.close();
    }
    
    void ObjectStream() throws IOException, ClassNotFoundException{
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\directory0\\file3.txt"));
        Employee akshita=new Employee("akshita",001,"Captain");
        oos.writeObject(akshita);
        System.out.println("Object has been written/ searlized");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\directory0\\file3.txt"));
        Employee ak=null;
        System.out.println("DeSerializing reading from employee records");
        ak=(Employee)ois.readObject();
        System.out.println(ak);
    }

}
