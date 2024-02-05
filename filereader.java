import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
//import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

public class filereader {
    public static void main(String[] args) {
        String s = " hello world my people, how are you";
        byte data[] = s.getBytes();
        Path p = Paths.get(".\\FileReader.txt");
        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
