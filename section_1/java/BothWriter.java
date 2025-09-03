public class BothWriter implements Writer {
    private final Writer first;
    private final Writer second;

    public BothWriter(final Writer first,
                      final Writer second) {
        this.first = first;
        this.second = second;
    }

    public void write(String thingToWrite) throws IOException {
        first.write(thingToWrite);
        second.write(thingToWrite);
    }
    
    public void close() {
        first.close();
        second.close();
    }
}

