package singleton;

/*
new 명령어를 통해 인스턴스를 생성 시 호출한 개수만큼 인스턴스 생성.
싱글톤 : 시스템 안에서 단 하나의 인스턴스 생성 보장
프로그램 실행 -> getInstance 메소드 호출 -> Singleton 클래스 초기화 -> static 필드 초기화 -> 유일한 인스턴스 생성

<출력 결과>
start
Created Singleton
instance1과 instance2 동일성 비교 : true
end
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("start");

        //Created Singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1과 instance2 동일성 비교 : " + (instance1 == instance2)); //true
        System.out.println("end");
    }
}
