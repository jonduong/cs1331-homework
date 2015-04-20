

public class Redactor {

    //your code here

    public static String generateBlackout(int length) {
        //your code here
        String blackout = "";
        for (int i = 0; i < length; i++) {
            blackout = blackout + "*";
        }
        return blackout;
    }

    public static String redactDocument(String document, String[]blacklist) {
        //your code here
        String sentance = document;
        for (int j = 0; j < blacklist.length; j++) {
            String black = generateBlackout(blacklist[j].length());
            sentance = sentance.replaceAll(blacklist[j], black);
        }
        return sentance;
    }

    public static String[] redactDocuments(String[] documents, String[] blacklist) {
        //your code here
        String[] newDocument = new String[documents.length];
        for (int k = 0; k < documents.length; k++) {
            newDocument[k] = redactDocument(documents[k], blacklist);
        }
        return newDocument;
    }

    public static void main(String... args) {
        String[] documents = {"Jason Bourne fell off a building into a river",
            "Aaron Cross was the next step up from Treadstone",
            "This is innocent text", "Can you tell I'm a huge Bourne fan?"};
        String[] blacklist = {"Jason", "Bourne", "Treadstone"};
        //String thing = redactDocuments(documents, blacklist).toString();
        System.out.println("Whatever");
    }
}
