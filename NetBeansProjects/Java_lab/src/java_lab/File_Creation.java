/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab;

import java.io.File;

/**
 *
 * @author xenos martin
 */
public class File_Creation {
public void filecreation(){
    System.out.println("creating files and directores");
    File f1 = new File("D:\\directory0");
    File f2=new File(f1.getPath(),"file1.txt");
    File f3=new File(f1.getPath(),"file2.txt");
    File f4=new File(f1.getPath(),"/directory1");
    System.out.println("all the directories and file in"+ f1.getName()+"parent directory");
    System.out.println("path of "+ f1.getName()+ " is "+f1.getPath());
    System.out.println("Absolute path of "+ f1.getName()+ " is "+f1.getAbsolutePath());
    System.out.println("path of "+ f2.getName()+ " is "+f2.getPath());
    System.out.println("Absolute path of "+ f2.getName()+ " is "+f2.getAbsolutePath());
    System.out.println("all the directories and file in"+ f1.getName()+"parent directory");
        File[] filesList = f1.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                System.out.println("Is a Directory "+f.getName());
            if(f.isFile()){
                System.out.println("Is a file "+f.getName());
            }
        }

    }
}    

