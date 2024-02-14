package visitor;

import visitor.element.Directory;
import visitor.element.File;
import visitor.element.FileTreatmentException;
import visitor.visitor.ListVisitor;

/*
방문자 패턴 : 데이터 구조와 처리를 분리하는 패턴
데이터 구조 안에 많은 요소가 저장되어 있고, 그 각 요소에 대해 '처리'를 한다고 할 때,
Visitor Pattern 에서는 데이터구조와 처리를 분리하여 데이터 구조 내부를 순회하는 방문자(Visitor)클래스를 준비해서 그 클래스에게 처리를 위임.
만약, 새로운 처리를 추가할 때는 새로운 '방문자(Visitor)'를 만들고, 데이터 구조영역에서 순회하려는 '방문자'에 대해 접근을 허용.
 */

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.accept(new ListVisitor());

            System.out.println();
            System.out.println("Making user entries...");

            Directory kim = new Directory("Kim");
            Directory lee = new Directory("Lee");
            Directory park = new Directory("Park");

            usrDir.add(kim);
            usrDir.add(lee);
            usrDir.add(park);
            kim.add(new File("diary.html", 100));
            kim.add(new File("Composite.java", 200));
            lee.add(new File("memotex", 300));
            park.add(new File("game.doc", 400));
            park.add(new File("junk.mail", 500));
            rootDir.accept(new ListVisitor());

        } catch (FileTreatmentException e) {
            e.fillInStackTrace();
        }
    }
}
