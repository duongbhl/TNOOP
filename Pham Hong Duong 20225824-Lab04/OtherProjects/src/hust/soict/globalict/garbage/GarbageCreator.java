package hust.soict.globalict.garbage;
import java.io.*;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        File file = new File("longtextfile.txt"); // Tệp văn bản dài
        BufferedReader br = new BufferedReader(new FileReader(file));

        String content = ""; // Không dùng StringBuffer
        String line;

        while ((line = br.readLine()) != null) {
            content += line; // Nối chuỗi bằng toán tử "+"
        }

        br.close();
        System.out.println("Content size: " + content.length());
    }
}

class NoGarbage {
    public static void main(String[] args) throws IOException {
        File file = new File("longtextfile.txt"); // Tệp văn bản dài
        BufferedReader br = new BufferedReader(new FileReader(file));

        StringBuffer content = new StringBuffer(); // Sử dụng StringBuffer
        String line;

        while ((line = br.readLine()) != null) {
            content.append(line); // Nối chuỗi bằng StringBuffer
        }

        br.close();
        System.out.println("Content size: " + content.length());
    }
}
