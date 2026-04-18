package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer sluy do przechowywania i zarządzania zestawem liczb całkowitych w strukturze przypominającej stos
 */
public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];
    private int total = -1;

    /**
     * Zwraca aktualna wartość indeksu total.
     * @return aktualny stan licznika elementów
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową liczbę do tablicy, o ile nie osiągnięto maksymalnej pojemności
     * @param in liczba całkowita, która ma zostać dodana
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka nie zawiera zadnych elementów
     * @return true, jeśli tablica jest pusta; false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza czy wyliczanka osiągnęłą swój maksymalny limit elementów
     * @return true jeśli tablica jest pełna; false w przeciwnym razie
     */
    public boolean isFull() {
        return total == 11;
    }
    /**
     * Pozwala podejrzeć ostatnio dodaną wartość bez usuwania jej.
     * @return ostatnio dodana wartość lub -1 jeśli wyliacznka jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Zwraca ostatnio dodaną wartość i usuwa ją z wyliczanki
     * @return ostatnio dodana liczba lub -1 jeśli wyliczanka jest pusta
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
