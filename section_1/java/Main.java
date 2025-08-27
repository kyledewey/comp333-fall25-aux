import java.io.*;

// Performs some sort of computation.
// Takes a command-line argument - says where to write to,
// either terminal or file
// 
public class Main {
    // Takes all the command-line arguments
    // Returns null if it's writing to the terminal, otherwise
    // the name of the file to write to
    public static String getDestinationFile(String[] args) { ... }
    
    public static int doComputation() { ... }

    public static void main(String[] args) throws IOException {
        String destination = getDestinationFile(args);
        int result = doComputation();
        if (destination == null) {
            // write to terminal
            System.out.println(result);
        } else {
            BufferedWriter writer =
                new BufferedWriter(new FileWriter(new File(destination)));
            writer.write(result);
            writer.close();
        }
    }
}
