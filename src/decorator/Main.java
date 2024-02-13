package decorator;

import decorator.border.FullBorder;
import decorator.border.SideBorder;
import decorator.display.Display;
import decorator.display.StringDisplay;

/*
원천 객체(Object)에 기능을 추가해나가는 디자인 패턴.
상속 대상인 객체를 감싸서 다른 기능을 추가해주는 객체를 데코레이터(Decorator)라고 함.
데코레이터는 자신이 둘러싼 속성 및 기능을 동일하게 제공하기 때문에 데코레이터의 존재는 이를 사용하는 유저에게 감춰짐.
그리고, 기존 객체에 대한 요청을 중간에 가로채서 해당 객체에 전달하는데, 그 사이에 전&후 처리로 다른 작업을 추가할 수 있음.

객체의 타입과 호출 가능한 메소드를 그대로 유지하면서 객체에 새로운 기능을 추가할 때, 또는 상속을 통해 서브 클래스를 계속 만드는 것이 비효율적일 때 사용.
 */

public class Main {

    public static void main(String[] args) {
        StringDisplay stringDisplay = new StringDisplay("Hello, world");
        SideBorder sideBorder = new SideBorder(stringDisplay, '#');
        FullBorder fullBorder = new FullBorder(sideBorder);

        stringDisplay.show();
        sideBorder.show();
        fullBorder.show();

        Display display = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("안녕하세요.")
                                        ), '*')
                        )
                ), '/');
        display.show();
    }
}
