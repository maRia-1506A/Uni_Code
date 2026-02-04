import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    public String readFirstLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        return br.readLine();
    }

    public static void main(String[] args) {
        ThrowsDemo tr = new ThrowsDemo();

        try {
            String file = tr.readFirstLine("data.txt");
            System.out.println(file);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}