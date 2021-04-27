package Exception_Handling;
import java.io.*;



class N {
    void method() throws IOException {
        throw new IOException("device error");
    }
}
public class Throws_Keyword {

	public static void main(String[] args) throws IOException {
        N n = new N();
        n.method();

        System.out.println("normal flow...");
    }
}