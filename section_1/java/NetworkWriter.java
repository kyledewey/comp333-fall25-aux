public class NetworkWriter implements Writer {
    private Socket socket = null;
    private final NetworkLocation location = null;

    public Writer(final NetworkLocation location) {
        // only writing to network
        this.location = location;
    }

    public void write(String thingToWrite) throws IOException {
        // write to network
        if (socket == null) {
            socket = new Socket(location);
        }
        socket.send(thingToWrite);
    }

    public void close() {
        if (socket != null) {
            socket.disconnect();
        }
    }
}
