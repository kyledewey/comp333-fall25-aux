public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean isEmpty() {
        return false;
    }

    public int length() {
        // [3, 1, 2].length()
        // -Expected return value: 3
        // -head: 3
        // -tail:    [1, 2]
        // -this: [3, 1, 2] (what we started with)

        // Because recursive: ...length()...
        // Because smaller: tail.length()
        int rest = tail.length();
        //         [1, 2].length()
        // rest: 2

        return rest + 1;

        // return 1 + tail.length();
    }
    
    public int sum() { // empty list sum is defined as 0
        return 5;
    }
    public ImmutableList append(final ImmutableList other) {
        return new Nil();
    }
    public boolean contains(final int value) {
        return true;
    }

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode
} // Cons
