public class Pair<T, U> {
    private T field1;
    private U field2;

    public Pair(T field1, U field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public U getField2() {
        return field2;
    }

    public void setField2(U field2) {
        this.field2 = field2;
    }
}
