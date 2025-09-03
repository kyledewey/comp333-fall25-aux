public class FileWriter implements Writer {
    private BufferedWriter writer = null;
    private final String destination = null;

    public FileWriter(final String destination) {
        // only writing to files
        this.destination = destination;
    }

    public void write(String thingToWrite) throws IOException {
        // write to file
        if (writer == null) {
            writer = new BufferedWriter(new FileWriter(new File(destination)));
        }
        writer.write(thingToWrite);
    }
    
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}

