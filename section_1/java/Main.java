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
        // ad-hoc polymorphism comes in: which specific write method is
        // determined at runtime.
        writer.write("still running");

        // ...now continue on with the computation        
    }

    public static void main(String[] args) throws IOException {
        String destination = getDestinationFile(args);
        NetworkLocation location = getNetworkDestination(args);
        Writer writer = null;
        if (destination != null && location != null) {
            writer = new BothWriter(new FileWriter(destination),
                                    new NetworkWriter(location));
        } else if (destination != null) {
            // subtyping polymorphism: can substitute FileWriter for Writer
            writer = new FileWriter(destination);
        } else if (location != null) {
            writer = new NetworkWriter(location);
        } else {
            writer = new TerminalWriter();
        }

        int result = doComputation(writer);
        writer.write("" + result);
        writer.close();

        // Writer writeToTerminal = new Writer(null, null);
        // writeToTerminal.write("foo");
    }
}
