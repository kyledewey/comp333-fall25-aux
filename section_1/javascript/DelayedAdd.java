public class DelayedAdd {
    public final int x;
    public DelayedAdd(final int x) {
        this.x = x;
    }
    public int add(final int y) {
        return x + y;
    }

    public static DelayedAdd delayedAdd(final int x) {
        return new DelayedAdd(x);
        // DelayedAdd add5 = new DelayedAdd(5);
        // System.out.println(add5.add(6));
    }
}
