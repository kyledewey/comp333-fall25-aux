import java.io.*;

// Program performs some computation
// Program takes a command-line argument.
// Command-line argument says to write to file or terminal
public class Main {
    public static BufferWriter writer = null;
    
    // returns null if we are writing to terminal, otherwise
    // the name of the file to write to
    public static String getDestinationFile(String[] args) { ... }

    public static void write(String destination,
                             String thingToWrite) throws IOException {
        if (destination == null) {
            // write to terminal
            System.out.println(thingToWrite);
        } else {
            // write to file
            if (writer == null) {
                writer = new BufferedWriter(new FileWriter(new File(destination)));
            }
            writer.write(thingToWrite);
        }
    }

    public static int doComputation(String destination) throws IOException {
        // Pretend there is some work done here for the computation

        // give user status update
        write(destination, "still running");

        // Finish the computation...        
    }

    public static void main(String[] args) throws IOException {
        String destination = getDestinationFile(args);
        int result = doComputation(destination);
        write(destination, "" + result);
        if (writer != null) {
            writer.close();
        }
    }
}
