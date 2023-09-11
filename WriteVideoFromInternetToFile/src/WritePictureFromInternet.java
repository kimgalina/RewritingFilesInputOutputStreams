import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class WritePictureFromInternet {
    public static void main(String[] args) {
        final String URL ="https://amiel.club/uploads/posts/2022-03/1647763422_1-amiel-club-p-kartinki-po-garri-potteru-1.jpg";
        // попытаемся переписать побайтово трек из файла NotYou в NotYouVersion2
        // in - поток который по url копирует данные в байтах
        try(BufferedInputStream in = new BufferedInputStream(new URL(URL).openStream());
            FileOutputStream out = new FileOutputStream("myPicture.jpg")){
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