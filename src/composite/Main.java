package composite;

import composite.entry.Directory;
import composite.entry.File;

/*
컴퓨터의 파일 시스템에 '디렉토리'라는 개념처럼, 그 안에 또 다른 디렉토리가 있을 수 있고 파일이 있을 수도 있음. 즉, 재귀적인 구조를 만들어냄.
디렉토리와 파일의 공통점은 둘 다 디렉토리 안에 넣을 수 있다는 것이고, 이를 '디렉토리 엔트리'라고 부름.

File : '내용물'을 표시하는 역할을 하며 내부에는 다른 것을 넣을 수 없음.
Directory : '그릇'을 나타내는 역할을 하며 디렉토리 엔트리를 넣을 수 있음.
Entry : 디렉토리 엔트리 역할.
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
            rootDir.printList();

            System.out.println();

            System.out.println("Making user entries");
            Directory kim = new Directory("Kim");
            Directory Lee = new Directory("Lee");
            Directory park = new Directory("Park");
            usrDir.add(kim);
            usrDir.add(Lee);
            usrDir.add(park);
            kim.add(new File("diary.html", 100));
            kim.add(new File("Comosite.java", 200));
            Lee.add(new File("memo.text", 300));
            park.add(new File("game.doc", 400));
            park.add(new File("junk.mail", 500));
            rootDir.printList();

        } catch(FileTreatmentException e) {
            throw new IllegalArgumentException(e.getLocalizedMessage());
        }
    }
}
