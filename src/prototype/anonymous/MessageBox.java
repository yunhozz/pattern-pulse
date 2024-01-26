package prototype.anonymous;

import prototype.framework.Product;

public class MessageBox implements Product {
    private char mbChar;

    private MessageBox() {}

    public MessageBox(char mbChar) {
        this.mbChar = mbChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(mbChar);
        }

        System.out.println();
        System.out.println(mbChar + " " + s + " " + mbChar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(mbChar);
        }
        System.out.println(" ");
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

    public char getMbChar() {
        return mbChar;
    }
}
