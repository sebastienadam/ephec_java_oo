package E032_FX_Toggle_button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Progam extends Application {

  @Override
  public void start(Stage primaryStage) {
    Button btnSend = new Button();
    Label lblMain = new Label("Sexe :");
    VBox root = new VBox(20);
    HBox tbBoxGender = new HBox(20);
    ToggleButton tbGenderFemale = new ToggleButton("F");
    ToggleButton tbGenderMale = new ToggleButton("H");
    ToggleGroup tbGroupGender = new ToggleGroup();

    lblMain.setFont(new Font("DejaVu Sans", 16));

    tbBoxGender.setAlignment(Pos.CENTER);
    tbBoxGender.getChildren().addAll(tbGenderMale,tbGenderFemale);

    tbGenderMale.setFont(new Font("DejaVu Sans", 16));
    tbGenderMale.setPrefWidth(64);
    tbGenderMale.setToggleGroup(tbGroupGender);

    tbGenderFemale.setFont(new Font("DejaVu Sans", 16));
    tbGenderFemale.setPrefWidth(64);
    tbGenderFemale.setToggleGroup(tbGroupGender);

    btnSend.setFont(new Font("DejaVu Sans", 16));
    btnSend.setPrefWidth(128);
    btnSend.setText("Soumettre");
    btnSend.setOnAction((ActionEvent event) -> {
      ToggleButton selected = (ToggleButton) tbGroupGender.getSelectedToggle();
      if (selected == null) {
        System.out.println("Inconnu");
      } else {
        System.out.println(selected.getText());
      }
    });

    root.setAlignment(Pos.CENTER);
    root.setPadding(new Insets(20));
    root.getChildren().addAll(lblMain,tbBoxGender,btnSend);

    Scene scene = new Scene(root);

    primaryStage.setTitle("Choise your sex");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}