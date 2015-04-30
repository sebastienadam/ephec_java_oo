package E031_FX_BorderPane_HBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class E031_FX_BorderPane_HBox extends Application {

  private BorderPane root = new BorderPane();
  private HBox btnPanel = new HBox(10);
  private Label lblTitle = new Label("App Title");
  private Button btnSave = new Button("Save");
  private Button btnQuit = new Button("Quit");
  private Button btnCancel = new Button("Cancel");

  @Override
  public void start(Stage primaryStage) {
    lblTitle.setFont(Font.font(STYLESHEET_MODENA).font("DejaVu Sans", FontWeight.BOLD, 36));
    lblTitle.setTextFill(Color.BLUE);
    root.setTop(lblTitle);
    btnPanel.getChildren().add(btnSave);
    btnPanel.getChildren().add(btnQuit);
    btnPanel.getChildren().add(btnCancel);
    btnPanel.setAlignment(Pos.CENTER);
    root.setBottom(btnPanel);
    BorderPane.setMargin(lblTitle, new Insets(10, 0, 10, 0));
    BorderPane.setMargin(btnPanel, new Insets(10, 0, 10, 0));
    BorderPane.setAlignment(lblTitle, Pos.CENTER);
    primaryStage.setScene(new Scene(root));
    primaryStage.setHeight(480);
    primaryStage.setWidth(640);
    primaryStage.setTitle("BorderPane width HBox");
    primaryStage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

}
