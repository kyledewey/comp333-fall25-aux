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
    }

    public static void main(String[] args) {
        final DelayedAdd add5 = delayedAdd(5);
        final DelayedAdd add7 = delayedAdd(7);
        System.out.println(add5.add(2));
        System.out.println(add7.add(2));
    }
}
