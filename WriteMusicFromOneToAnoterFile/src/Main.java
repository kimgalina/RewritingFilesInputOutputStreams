import java.io.*;
public class Main {
    public static void main(String[] args) {
        // попытаемся переписать побайтово трек из файла NotYou в NotYouVersion2
        try(FileInputStream in = new FileInputStream("NotYou.mp3");
            FileOutputStream out = new FileOutputStream("NotYouVersion2.mp3")){
            // побайтово читаем и записываем
            int c = in.read();
            while(c != -1){
                out.write(c);
                c = in.read();
            }
        }catch(IOException exc){
            System.err.println("Some Errors");
        }

    }
}