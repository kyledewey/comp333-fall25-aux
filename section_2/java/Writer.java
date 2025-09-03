public class Writer {
    private String destination;
    private NetworkLocation location;
    private BufferedWriter writer = null;
    private Socket socket = null;

    public Writer(String destination,
                  NetworkLocation location) {
        this.destination = destination;
        this.location = location;
    }

    public void write(String thingToWrite) throws IOException {
        if (destination != null) {
            // write to file
            if (writer == null) {
                writer = new BufferedWriter(new FileWriter(new File(destination)));
            }
            writer.write(thingToWrite);
        } else if (location != null) {
            // write to network
            if (socket != null) {
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
