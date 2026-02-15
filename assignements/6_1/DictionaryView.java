import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller;

    @Override
    public void start(Stage primaryStage) {

        controller = new DictionaryController();

        // UI Components
        TextField wordField = new TextField();
        wordField.setPromptText("Enter a word");

        Button searchButton = new Button("Search");

        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setWrapText(true);
        resultArea.setPrefWidth(300);
        resultArea.setPrefHeight(100);

        // Button action
        searchButton.setOnAction(e -> {
            String word = wordField.getText();
            String result = controller.search(word);
            resultArea.setText(result);
        });

        // Layout
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(15));
        root.setHgap(10);
        root.setVgap(10);

        root.getChildren().addAll(
                new Label("Word:"), 
                wordField, 
                searchButton, 
                new Label("Meaning:"), 
                resultArea
        );

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("Virtual Dictionary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
