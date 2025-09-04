public class NetworkWriter implements Writer {
    private final NetworkLocation location;
    private Socket socket = null;

    public NetworkWriter(final NetworkLocation location) {
        this.location = location;
    }

    public void write(String thingToWrite) throws IOException {
        // write to network
        if (socket != null) {
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
