package prototype;

import prototype.anonymous.MessageBox;
import prototype.anonymous.UnderlinePen;
import prototype.framework.Manager;
import prototype.framework.Product;

/*
new 를 사용해서 인스턴스를 만들 경우에는 클래스 이름을 반드시 지정해야함. 하지만, 클래스 명을 지정하지 않고 인스턴스를 생성할 때도 있음.
Java 의 cloneable 인터페이스와 clone 메소드 이용하여 복사. (like 게임 스킬 프리셋)

언제 사용할까?
1. 종류가 너무 많아 클래스로 정리되지 않는 경우
2. 클래스로부터 인스턴스 생성이 어려운 경우
3. framework와 생성할 인스턴스를 분리하고 싶은 경우
 */

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');

        manager.register("strong message", underlinePen);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world");
        Product p3 = manager.create("slash box");
        p3.use("slash box");
    }
}
