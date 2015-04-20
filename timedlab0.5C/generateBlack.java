public class generateBlack {
    public static void main(String[] args) {

        System.out.println(generateBlackout(5));
    }
    public String generateBlackout(int length) {
        //your code here
        String blackout = "";
        for (int i = 0; i < length; i++) {
            blackout = blackout + "*";
        }
        return blackout;
    }
}
