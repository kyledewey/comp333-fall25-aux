import java.io.*;

// Program performs some computation
// Program takes a command-line argument.
// Command-line argument says to write to file or terminal
public class Main {
    // returns null if we are writing to terminal, otherwise
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
            // write to file
            BufferedWriter writer =
                new BufferedWriter(new FileWriter(new File(destination)));
            writer.write(result);
            writer.close();
        }
    }
}
