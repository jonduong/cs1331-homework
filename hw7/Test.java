public class Test {
    public static void main(String[] args) {
        Gnome c = new Gnome();
        System.out.println(c);
        System.out.println(c.getName());
        Field field = new Field();
        field.buyCard(c);
    }
}
