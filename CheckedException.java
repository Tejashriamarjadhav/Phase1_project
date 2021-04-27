package Exception_Handling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("jtp.txt"); // may throw exception
            pw.println("saved");
        }
       
        catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            pw.close();
        }
        System.out.println("File saved successfully");
    }
}