package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_RHYMER = -1;
    public static final int MAX_CAPACITY = 12;
    public static final int DEFAULT_VALUE = -1;
    public static final int STACK_FULL_INDICATOR = 11;

    private final int[] numbers = new int[MAX_CAPACITY];

    private int total = EMPTY_RHYMER;

    public int getTotal(){
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == STACK_FULL_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
}
