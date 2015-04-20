import java.util.Collections;
import java.util.Comparator;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;

/**
 * This represents the MailReader app.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class MailReader extends Application {
    private Mailbox inbox;
    private Mailbox important;
    private Mailbox trash;
    private Server server;
    /**
     * Makes the boxes.
     */
    public void initializeBoxes() {
        inbox = new Mailbox("Inbox");
        important = new Mailbox("Important");
        trash = new Mailbox("Trash");
        server = new Server();
        mail.add(inbox);
        mail.add(important);
        mail.add(trash);
    }

    private Button refresh;
    private Button flag;
    private Button delete;
    private Button sortSender;
    private Button sortDate;
    private Button sortSub;
    /**
     * Makes the buttons.
     */
    public void initializeButtons() {
        refresh = new Button("Refresh");
        refresh.setOnAction(e -> {
                try {
                    inbox.add(server.newMail());
                    messageList.requestFocus();
                    letters.clear();
                    for (Message messer : currentBox.getMessages()) {
                        letters.add(messer);
                    }
                } catch (IndexOutOfBoundsException x) {
                    System.out.println();
                    System.out.println("I only made 4 letters to pull from");
                    System.out.println("the server, so you can only do it 4");
                    System.out.println("times. I know...I'm lazy.");
                }
            });

        flag = new Button("Flag");
        flag.setOnAction(e -> {
                important.add(currentLetter);
                letters.clear();
                for (Message messer : currentBox.getMessages()) {
                    letters.add(messer);
                }
            });
        flag.setDisable(true);

        delete = new Button();
        delete.setText("Delete");
        delete.setOnAction(e -> {
                trash.add(currentLetter);
                inbox.remove(currentLetter);
                if (important.isIn(currentLetter)) {
                    important.remove(currentLetter);
                }
                letters.clear();
                for (Message messer : currentBox.getMessages()) {
                    letters.add(messer);
                }
                messageList.requestFocus();
            });
        delete.setDisable(true);

        sortSender = new Button();
        sortSender.setText("Sort by Sender");
        sortSender.setOnAction(e -> {
                Collections.sort(letters, new Comparator<Message>() {
                    public int compare(Message a, Message b) {
                        return a.getSender().getName()
                                .compareTo(b.getSender().getName());
                    }
                });
            });

        sortDate = new Button();
        sortDate.setText("Sort by Date");
        sortDate.setOnAction(e -> {
                Collections.sort(letters, new Comparator<Message>() {
                    public int compare(Message a, Message b) {
                        return a.getDate()
                                .compareTo(b.getDate());
                    }
                });
                Collections.reverse(letters);
            });

        sortSub = new Button();
        sortSub.setText("Sort by Subject");
        sortSub.setOnAction(e -> {
                Collections.sort(letters, new Comparator<Message>() {
                    public int compare(Message a, Message b) {
                        return a.getSubject()
                                .compareTo(b.getSubject());
                    }
                });
            });
    }

    private ObservableList<Mailbox> mail;
    private Mailbox currentBox;
    private ObservableList<Message> letters;
    private Message currentLetter;
    private ListView<Mailbox> inboxList;
    private ListView<Message> messageList;
    private ObservableList<String> mess;
    private ListView<String> messList;
    private String thing;
    private TextArea content;
    private String mesSub;
    private String mesSen;
    private String mesDat;

    @Override public void start(Stage stage) {
        mail = FXCollections.observableArrayList();
        inboxList = new ListView<Mailbox>(mail);
        letters = FXCollections.observableArrayList();
        messageList = new ListView<Message>(letters);


        initializeBoxes();
        initializeButtons();

        ToolBar buttonBar = new ToolBar(refresh, new Separator(), sortSender,
                sortDate, sortSub, new Separator(), flag, delete);


        VBox inboxes = new VBox();
        inboxes.getChildren().addAll(inboxList);

        VBox totLetters = new VBox();
        totLetters.getChildren().addAll(messageList);

        thing = "";
        mesSub = "Subject";
        mesSen = "Sender";
        mesDat = "Date";

        content = new TextArea();
        content.setText(thing);
        content.setPrefColumnCount(27);
        content.setWrapText(true);

        Label labSub = new Label();
        labSub.setText(mesSub);
        labSub.setFont(new Font(20));
        Label labSen = new Label();
        labSen.setText(mesSen);
        Label labDat = new Label();
        labDat.setText(mesDat);
        Label disclaim = new Label();
        disclaim.setText("\n\n   There are only 4\n   letters the in server,\n"
                + "   so you can only\n   refresh 4 times.");

        HBox lower = new HBox();
        lower.getChildren().addAll(labSen, labDat);
        lower.setSpacing(20);

        VBox contents = new VBox();
        contents.getChildren().addAll(labSub, lower, content, disclaim);

        HBox layout = new HBox();
        layout.getChildren().addAll(inboxes, totLetters, contents);

        VBox all = new VBox();
        all.getChildren().addAll(buttonBar, layout);

        inboxList.getSelectionModel().selectedItemProperty()
            .addListener(new ChangeListener<Mailbox>() {
                public void changed(ObservableValue<? extends Mailbox>
                        observable, Mailbox oldBox, Mailbox newBox) {
                    currentBox = newBox;
                    letters.clear();
                    for (Message messer : currentBox.getMessages()) {
                        letters.add(messer);
                    }
                    flag.setDisable(true);
                    delete.setDisable(true);
                    //For some reason, a bunch of stuff pops up in the
                    //command line, but it didn't affect the program, and was
                    //too long to read through to try to catch it.
                }
            });

        messageList.getSelectionModel().selectedItemProperty()
            .addListener(new ChangeListener<Message>() {
                public void changed(ObservableValue<? extends Message>
                        observable, Message oldMess, Message newMess) {
                    currentLetter = newMess;
                    thing = currentLetter.getBody();
                    content.setText("\n" + thing);
                    flag.setDisable(false);
                    delete.setDisable(false);
                    mesSub = currentLetter.getSubject();
                    mesSen = currentLetter.getSender().toString();
                    mesDat = currentLetter.getDate().toString();
                    labSub.setText(mesSub);
                    labSen.setText(mesSen);
                    labDat.setText(mesDat);
                }
            });

        Scene scene = new Scene(all);
        stage.setScene(scene);
        stage.setTitle("MailReader");
        stage.show();

    }
}
