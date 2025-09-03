import java.io.*;

// Performs some sort of computation.
// Takes a command-line argument - says where to write to,
// one of file, terminal, network location
// 
public class Main {    
    // Takes all the command-line arguments
    // Returns null if it's not writing to a file, otherwise
    // the name of the file to write to
    public static String getDestinationFile(String[] args) { ... }

    // Returns null if it's not writing to a network location
    public static NetworkLocation getNetworkDestination(String[] args) { ... }
    
    public static int doComputation(Writer writer) throws IOException {
        // Start of computation...
        // Pretend code is here to meaningfully compute part of the result

        // now we want to do a status update
        writer.write("still running");

        // ...now continue on with the computation        
    }

    public static void main(String[] args) throws IOException {
        String destination = getDestinationFile(args);
        NetworkLocation location = getNetworkDestination(args);
        Writer writer = new Writer(destination, location);
        int result = doComputation(writer);
        writer.write("" + result);
        writer.close();

        // Writer writeToTerminal = new Writer(null, null);
        // writeToTerminal.write("foo");
    }
}
