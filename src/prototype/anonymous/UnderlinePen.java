package prototype.anonymous;

import prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulChar;

    private UnderlinePen() {}

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println();

        for (int i = 0; i < length; i++) {
            System.out.println(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.getLocalizedMessage();
        }
        return product;
    }

    public char getUlChar() {
        return ulChar;
    }
}
