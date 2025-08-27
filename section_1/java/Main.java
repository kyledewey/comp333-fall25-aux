import java.io.*;

// Performs some sort of computation.
// Takes a command-line argument - says where to write to,
// either terminal or file
// 
public class Main {
    private static BufferedWriter writer = null;
    
    // Takes all the command-line arguments
    // Returns null if it's writing to the terminal, otherwise
    // the name of the file to write to
    public static String getDestinationFile(String[] args) { ... }

    // problem: we need to maintain some state for open files (writer),
    // need to track if you've opened the file already
    public static void write(String destination,
                             String thingToWrite) throws IOException {
        if (destination == null) {
            // write to terminal
            System.out.println(thingToWrite);
        } else {
            if (writer == null) {
                writer = new BufferedWriter(new FileWriter(new File(destination)));
            }
            writer.write(thingToWrite);
        }
    }
    
    public static int doComputation(String destination) throws IOException {
        // Start of computation...
        // Pretend code is here to meaningfully compute part of the result

        // now we want to do a status update
        write(destination, "still running");

        // ...now continue on with the computation        
    }

    public static void main(String[] args) throws IOException {
        String destination = getDestinationFile(args);
        int result = doComputation();
        write(destination, "" + result);
        if (writer != null) {
            writer.close();
        }
    }
}
