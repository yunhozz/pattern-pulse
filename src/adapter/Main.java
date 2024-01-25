package adapter;

public class Main {
    public static void main(String[] args) {
        FloatAdapter adapter = new FloatAdapterImpl();
        System.out.println(adapter.twiceOf(100f)); // 200.0
        System.out.println(adapter.halfOf(50f)); // 25.0
    }
}
