package adapter;

public class Math {
    public static double twoTime(double num) {
        return num * 2;
    }

    public static double half(double num) {
        if (num <= 0) {
            System.out.println("분모가 0 이하입니다");
        }
        return num / 2;
    }
}
