public class Nil implements ImmutableList {
    public Nil() {}

    public ImmutableList addAmount(final int amount) {
        // [].addAmount(1): []
        // amount: 1
        // this: []
        // return new Nil();
        return this;
    }
    
    public boolean isEmpty() {
        return true;
    }
    
    public int length() {
        return 0;
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
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode
} // Nil
    
