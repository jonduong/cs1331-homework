public class PracticeTL {
    public static String[] redactSentences(String[] sentences,
        String[] blacklist) {
        //TODO: your code here
        for (int j = 0; j < sentences.length; j++) {
            redact(sentences[j], blacklist);
        }
        return sentences;
    }

    public static String generateBlackout(int length) {
        String blackout = "";
        for (int i = 0; i < length; i++) {
            blackout = blackout + "*";
        }
        return blackout;
    }

    public static String redact(String sentence, String[] blacklist) {
        for (int k = 0; k < blacklist.length; k++) {
            sentence = sentence.replace(blacklist[k],
            generateBlackout(blacklist[k].length()));
        }
        return sentence;
    }

    public static void main(String[] args) {
        String[] sentences = {"Jason Bourne fell off a building into a river",
            "Aaron Cross was the next step up from Treadstone",
            "This is innocent text", "Can you tell I'm a huge Bourne fan?"};
        String[] blacklist = {"Jason", "Bourne", "Treadstone"};

        System.out.println(java.util.Arrays.toString(
            redactSentences(sentences, blacklist)));
    }
}
