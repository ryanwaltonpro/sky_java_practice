import java.io.File;
import java.io.FileInputStream;

public class ReadingFile {
    public static void main(String[] args){
        try (FileInputStream fin = new FileInputStream(new File("poem.txt"))) {
            System.out.println("=== Success ===");

            byte[] bArray = new byte[256];
            int tot = 0, numRead;
            for(; (numRead = fin.read(bArray)) != -1; tot += numRead){
                System.out.print(new String(bArray, 0, numRead));
            }
            System.out.println();
            System.out.println("Printed a total of " + tot + " bytes");
        } catch(Exception e){
            System.out.println("=== Error ===");
            System.out.println(e.getMessage());
        }
    }
}
