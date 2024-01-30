package bridge;

import bridge.display.CountDisplay;
import bridge.display.Display;
import bridge.display.StringDisplay;

/*
브릿지 패턴 = '기능의 클래스 계층(Abstraction)'과 '구현의 클래스 계층(Implementor)'의 분리
요구 사항으로 기능의 추가가 왔다면 Abstractor쪽에 클래스를 추가만 해주면 되고, 구현의 상세로직이 변경되면 Implementor 쪽만 변경 혹은 추가하면 됨.

1. Abstraction(추상화)의 역할 (=Display)
'기능의 클래스 계층'의 최상위 클래스. Implementor 역할의 메소드를 사용해서 기본적인 기능만이 기술되어 있는 클래스.
이 인스턴스는 Implementor 역할을 가지고 있음.

2. RefineAbstraction(개선된 추상화)의 역할 (=CountDisplay)
Abstraction 역할에 대해 기능을 추가한 역할.

3. Implementor(구현자)의 역할 (=RawDisplay)
'구현의 클래스 계층'의 최상위 클래스. Abstraction역할의 인터페이스(API)를 구현하기 위한 메소드를 규정하는 역할.

4. Concrete Implementor(구체적인 구현자)의 역할 (=StringDisplay)
Implementor역할의 인터페이스(API)를 구체적으로 구현하는 역할.
 */

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplay("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplay("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplay("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);
    }
}
