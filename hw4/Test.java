public class Test {
    public static void main(String[] args) {
        TA tet = new TA(1, 1, 1, "Jonathan", "Duong", "jduong6");
        System.out.println(tet.getFirstName());
        System.out.println(tet.getLastName());
        System.out.println(tet.getUsername());
        System.out.println(tet.getStudyHours());
        System.out.println(tet.getNonStudyHours());
        tet.study(30);
        System.out.println(tet.getStudyHours());
        tet.relax(70);
        System.out.println(tet.getNonStudyHours());
        System.out.println(tet.getStudyPercentage());
        System.out.println(tet.getHope());
        tet.loseHope(50);
        System.out.println(tet.getHope());
        tet.loseHope(60);
        System.out.println(tet.getHope());
        System.out.println(tet.getPizza());
        tet.eatPizza(100);
        System.out.println(tet.getPizza());
        System.out.println(tet.getPiazzaScore());
        tet.setPiazzaScore(.5);
        System.out.println(tet.getPiazzaScore());
        System.out.println(tet.getOfficeHoursScore());
        tet.setOfficeHoursScore(.7);
        System.out.println(tet.getOfficeHoursScore());
        System.out.println(tet.getRecitationScore());
        tet.setRecitationScore(.3);
        System.out.println(tet.getRecitationScore());
    }
}
