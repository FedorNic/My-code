package Seminar.Seminar_17;

public class Counter implements AutoCloseable {
    private int count;
    private boolean closed = false;

    public void increment() {
        if (closed) {
            throw new IllegalStateException("Counter already closed");
        }
        count++;
    }

    public static void main(String[] args) {
        try (Counter count = new Counter()) {
            count.increment();
            count.increment();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        if (closed) {
            throw new Exception("Counter already closed");
        }
        closed = true;
    }
}