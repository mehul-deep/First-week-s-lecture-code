import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class HelloWorld {
    public static void main(String[] args){
        In fileInput = new In(args[0]); //This is to open the file
        while(!fileInput.isEmpty()) {
            String data = fileInput.readString(); //Used to reading from tthe file
            StdOut.println(data); //This is to print the result.
        }

    }
}
