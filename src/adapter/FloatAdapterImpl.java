package adapter;

public class FloatAdapterImpl implements FloatAdapter {
    @Override
    public Float twiceOf(Float f) {
        return (float) Math.twoTime(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        if (f <= 0) {
            System.out.println("분모가 0 이하입니다");
        }
        return (float) Math.half(f.doubleValue());
    }
}
