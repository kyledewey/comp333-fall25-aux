import java.io.*;

// Program performs some computation
// Program takes a command-line argument.
// Command-line argument says to write to a
// file, terminal, or network location
public class Main {
    // returns the name of the file to write to, or null
    // if we aren't writing to a file
    public static String getDestinationFile(String[] args) { ... }

    // returns the location of the place to write to on the network,
    // or null if we aren't writing to the network
    public static NetworkLocation getNetworkLocation(String[] args) { ... }

    public static int doComputation(Writer writer) throws IOException {
        // Pretend there is some work done here for the computation
        // give user status update
        writer.write("still running");
        // Finish the computation...        
    }

    public static void main(String[] args) throws IOException {
        String destination = getDestinationFile(args);
        NetworkLocation location = getNetworkLocation(args);
        Writer writer = new Writer(destination, location);
        int result = doComputation(writer);
        writer.write("" + result);
        writer.close();
    }
}
