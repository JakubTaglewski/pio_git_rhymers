package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_INDEX = -1;
    public static final int EMPTY_RESULT = -1;
    public static final int FULL = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return getTotal() == EMPTY_INDEX;
    }

    public boolean isFull() {
        return getTotal() == FULL;
    }

    protected int Peekaboo() {
        if (callCheck())
            return EMPTY_RESULT;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RESULT;
        return numbers[total--];
    }

}
