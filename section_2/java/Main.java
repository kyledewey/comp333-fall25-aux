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
        Writer writer;
        if (destination != null) {
            // subtyping polymorphism: expected a Writer, received a
            // FileWriter (which is a specific kind of Writer, i.e.,
            // a subtype of Writer). Compile-time.
            writer = new FileWriter(destination);
        } else if (location != null) {
            writer = new NetworkWriter(location);
        } else {
            writer = new TerminalWriter();
        }
        
        int result = doComputation(writer);

        // virtual dispatch involving write (ad-hoc polymorphism)
        // runtime feature - we delay the determination of the specific
        // write method called until runtime
        writer.write("" + result);
        writer.close();
    }
}
