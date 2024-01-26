package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardFactory;

/*
신분증(IDCard)을 만드는 공장을 주제로 코드 작성.
(framework) Product, Factory -> (implement) IDCard, IDCardFactory
Factory : 템플릿 메소드 패턴, 제품 인스턴스 생성(=createProduct), 신분증 소유자 등록(=registerProduct)
Product : 제품 사용(=use)
 */

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("박윤호");
        Product card2 = factory.create("yunhozz");

        card1.use();
        card2.use();
        System.out.println(((IDCardFactory) factory).getOwners()); //박윤호, yunhozz
    }
}
