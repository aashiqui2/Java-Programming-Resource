// ! file creation
import java.io.File;
import java.io.IOException;
public class FileFolderDemo1 {
    public static void main(String[] args) /*throws IOException*/ {
        // ! create file
        File file=new File("D:\\Programming\\2.Java Programming\\00.Basic\\25.File handling\\testFolders\\4.txt");
        boolean present=file.exists();
        System.out.println("File present : "+ present);
        if(present == false){
          try{
            boolean created=file.createNewFile();
            System.out.println("File created "+ created);
          }
          catch (IOException e){
            // System.out.println(e);
            e.printStackTrace();
          }
        }

    }
}
