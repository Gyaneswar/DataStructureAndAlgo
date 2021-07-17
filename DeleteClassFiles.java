import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DeleteClassFiles {
    public static void main(String[] args) {
        File Directory=new File("D://Code");
        String contents[]=Directory.list();        
        String path=Directory.getPath();            
        for(int i=0;i<contents.length;i++){
            if(contents[i].charAt(0)!='.'){
                path=path+"\\"+contents[i];
                DeleteRecursively(path);
                path=Directory.getPath();
            }
        }

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
