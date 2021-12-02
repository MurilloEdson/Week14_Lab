
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Problem1 {

    public static void main(String[] args) throws IOException {
        try {
            final int MAX = 10;
            int value;
            String fileName = "test.txt";
            PrintWriter outFile = new PrintWriter(fileName);
            Random rand = new Random();
            for (int line = 1; line <= MAX; line++) {
                for (int num = 1; num <= MAX; num++) {
                    value = rand.nextInt(90) + 10;
                    outFile.print(value + " ");
                }
                outFile.println();
            }
            outFile.close();
            System.out.println("Output file has been created: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found" + e.getMessage());
        } catch (IOException i) {
            System.err.println("File Not Found" + i.getMessage());
        } finally{
            System.out.println("Done");
        }
    }
}
