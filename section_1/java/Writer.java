public class Writer {
    private BufferedWriter writer = null;
    private Socket socket = null;
    private final String destination = null;
    private final NetworkLocation location = null;

    public Writer(final String destination) {
        // only writing to files
        this.destination = destination;
    }
    public Writer(final NetworkLocation location) {
        // only writing to network
        this.location = location;
    }

    public Writer(final String destination,
                  final NetworkLocation location) {
        // writing to BOTH file and network
        this.destination = destination;
        this.location = location;
    }
    
    // public Writer(final String destination,
    //               final NetworkLocation location) {
    //     assert ((destination == null && location == null) ||
    //             (destination != null && location == null) ||
    //             (destination == null && location != null));
    //     this.destination = destination;
    //     this.location = location;
    // }

    // problem: we need to maintain some state for open files (writer),
    // need to track if you've opened the file already
    public void write(String thingToWrite) throws IOException {
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

    public void close() {
        if (writer != null) {
            writer.close();
        }
        if (socket != null) {
            socket.disconnect();
        }
    }        
}
