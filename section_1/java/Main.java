import java.io.*;

// Performs some sort of computation.
// Takes a command-line argument - says where to write to,
// one of file, terminal, network location
// 
public class Main {
    private static BufferedWriter writer = null;
    private static Socket socket = null;
    
    // Takes all the command-line arguments
    // Returns null if it's not writing to a file, otherwise
    // the name of the file to write to
    public static String getDestinationFile(String[] args) { ... }

    // Returns null if it's not writing to a network location
    public static NetworkLocation getNetworkDestination(String[] args) { ... }

    // problem: we need to maintain some state for open files (writer),
    // need to track if you've opened the file already
    public static void write(String destination,
                             NetworkLocation location,
                             String thingToWrite) throws IOException {
        if (destination != null) {
            // write to file
            if (writer == null) {
                writer = new BufferedWriter(new FileWriter(new File(destination)));
            }
            writer.write(thingToWrite);
        } else if (location != null) {
            // write to network
            if (socket == null) {
                socket = new Socket(location);
            }
            socket.send(thingToWrite);
        } else {
            // write to terminal
            System.out.println(thingToWrite);
        }
    }
    
    public static int doComputation(String destination,
                                    NetworkLocation location) throws IOException {
        // Start of computation...
        // Pretend code is here to meaningfully compute part of the result

        // now we want to do a status update
        write(destination, location, "still running");

        // ...now continue on with the computation        
    }

    public static void main(String[] args) throws IOException {
        String destination = getDestinationFile(args);
        NetworkLocation location = getNetworkDestination(args);
        int result = doComputation(destination, location);
        write(destination, location, "" + result);
        if (writer != null) {
            writer.close();
        }
        if (socket != null) {
            socket.disconnect();
        }
    }
}
