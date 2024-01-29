package builder;

/*
빌딩을 지을 때, 아래에서 위로 조금씩 만들어 가는 것 처럼, 전체를 구성하는 각 부분을 만들면서 단계를 밟아가며 만들어가는 디자인 패턴.
Main <-> Builder <-> Director 사이 약한 결합을 형성하여, 교환 가능성을 높일 수 있도록 설계하자.
 */

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.constructor();
            System.out.println(textBuilder.getResult());

        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.constructor();
            System.out.println(htmlBuilder.getResult() + "가 작성되었습니다.");

        } else {
            usage();
            System.exit(0);
        }
    }

    private static void usage(){
        System.out.println("Usage: java Main plain 일반 텍스트로 문서 작성");
        System.out.println("Usage: java Main html HTML 파일 문서 작성");
    }
}
