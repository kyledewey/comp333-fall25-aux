public interface ImmutableList {
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);

    // [3, 1, 2].addAmount(4): [7, 5, 6]
    //    new Cons(3, ...).addAmount(4)
    // [5].addAmount(1): [6]
    //    new Cons(5, ...).addAmount(5)
    // [9, 2].addAmount(2): [11, 4]
    //    new Cons(9, ...).addAmount(2)
    // [].addAmount(3): []
    //    new Nil().addAmount(3): []
    public ImmutableList addAmount(final int amount);
    
    public String toString();
    public int hashCode();
    public boolean equals(final Object other);
} // ImmutableList
