import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class WriteVideoFromInternet {
    public static void main(String[] args) {

        // попытаемся переписать побайтово видео  из файла video.mp4 в myVideo.mp4
        // in - поток который по url копирует данные в байтах
        try(FileInputStream in = new FileInputStream("video.mp4");
            FileOutputStream out = new FileOutputStream("myVideo.mp4")){
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
