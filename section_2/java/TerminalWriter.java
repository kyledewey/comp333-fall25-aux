public class TerminalWriter implements Writer {
    public TerminalWriter() {}

    public void write(String thingToWrite) throws IOException {
        // write to terminal
        System.out.println(thingToWrite);
    }

    public void close() {}
}
