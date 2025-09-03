public class TerminalWriter implements Writer {
    public void write(String thingToWrite) throws IOException {
        System.out.println(thingToWrite);
    }
    public void close() {
    }
}
