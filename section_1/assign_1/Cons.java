public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public ImmutableList addAmount(final int amount) {
        // [3, 1, 2].addAmount(4)
        // -Expected return value: [7, 5, 6]
        // -amount: 4 
        // -head: 3
        // -tail: [1, 2]
        // -this: [3, 1, 2]

        ImmutableList rest = tail.addAmount(amount);
        // [1, 2].addAmount(4): [5, 6]
        // rest: [5, 6]
        int currentValue = head + amount;
        // 3 + 4
        // currentValue: 7
        // return new Cons(currentValue, rest);

        ImmutableList returnValue = new Cons(currentValue, rest);
        return returnValue;
        // return new Cons(head + amount, tail.addAmount(amount));
    }

    public int length() {
        // [3, 1, 4, 5].length()
        // -Expected return value: 4
        // -head: 3
        // -tail: [1, 4, 5]
        // -this: [3, 1, 4, 5]

        // know I need a recursive call to length
        // ...length()...
        //
        // Recursive case needs to be able to reach the base case
        // want to make recursive call on something smaller than
        // what I started with ([3, 1, 4, 5])
        //
        // [1, 4, 5].length(): 3
        // restLength: 3

        int restLength = tail.length();
        return 1 + restLength;

        // return 1 + tail.length();
    }
    
    public int sum() { // empty list sum is defined as 0
        return 7;
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
