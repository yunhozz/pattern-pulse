package abstract_factory.factory;

public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("클래스 " + classname + " 이 발견되지 않았습니다.");
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getLocalizedMessage());
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
