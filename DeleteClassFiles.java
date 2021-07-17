/*
    Created on: 17th July 2021
    Created by: Gyaneswar Singh(gyaneswarsingh53@gmail.com)
    This program takes the directory name as input and deletes all the class files within 
    the directory. It also deletes any file within any sub directories . 
    Basically it deletes any class file it finds in the entire folder;

    input is in format (for ex ) : D:\\Code
*/
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class DeleteClassFiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Scanner is slow but whatever
        String inputDirectory=sc.next();
        File Directory=new File(inputDirectory);
        if(Directory.isDirectory()){
            String contents[]=Directory.list();        
            String path=Directory.getPath();            
            for(int i=0;i<contents.length;i++){
                if(contents[i].charAt(0)!='.'){
                    path=path+"\\"+contents[i];
                    DeleteRecursively(path);
                    path=Directory.getPath();
                }
            }
        }else
            System.out.println("Not a directory :)");
    }

    public static void DeleteRecursively(String path){
        File check=new File(path);        
        boolean isDirectory=check.isDirectory();        

        if(isDirectory){
            String files[]=check.list();
            for(int i=0;i<files.length;i++){
                DeleteRecursively(path+"\\"+files[i]);
            }
            
        }else{
            if(path.contains(".class")){
                File DELETETHIS = new File(path);
                System.out.println(DELETETHIS.delete() ? path+": Deleted": path+": Error");                
            }
        }
    }   
}
