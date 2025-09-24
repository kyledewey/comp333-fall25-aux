public interface ImmutableList {
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);

    public boolean isEmpty();

    // [3, 1, 2].addAmount(4): [7, 5, 6]
    // [5].addAmount(7): [12]
    // [].addAmount(1): []
    // [0].addAmount(1): [1]
    public ImmutableList addAmount(final int amount);
    
    public boolean equals(final Object other);
    public String toString();
    public int hashCode();
} // ImmutableList
