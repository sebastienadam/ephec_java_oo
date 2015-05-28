/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E034_Boutonneur;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Sébastien
 */
public class Program extends Application {

  private void onButtonClicked(MouseEvent mouseEvent) {
    if (mouseEvent.getSource() instanceof Button) {
      System.out.println(((Button) mouseEvent.getSource()).getText() + " cliqué!");
      System.out.println("Vous avez cliqué sur les coordonnées ("
              + ((int) mouseEvent.getSceneX()) + ","
              + ((int) mouseEvent.getSceneY()) + ")");
    }
  }

  private void createButton(Button button, FlowPane fp) {
    Button btn = new Button(button.getText() + " " + fp.getChildren().size());
    btn.setOnMouseClicked(button.getOnMouseClicked());
    fp.getChildren().add(btn);
  }

  private void removeButton(FlowPane fp) {
    if (fp.getChildren().size() > 1) {
      fp.getChildren().remove(fp.getChildren().size() - 1);
    }
  }

  @Override
  public void start(Stage primaryStage) {
    try {
      BorderPane root = new BorderPane();
      Scene scene = new Scene(root, 400, 400);

      Button btnMangez = new Button("Mangez-moi!");
      Button btnBuvez = new Button("Buvez-moi!");

      FlowPane fp = new FlowPane(4, 4, btnBuvez, btnMangez);

      btnMangez.setOnMouseClicked(mouseEvent -> {
        onButtonClicked(mouseEvent);
        createButton((Button)mouseEvent.getSource(), fp);
      });
      btnBuvez.setOnMouseClicked(mouseEvent -> {
        onButtonClicked(mouseEvent);
        removeButton(fp);
      });

      scene.setOnKeyPressed(keyEvent -> {
        String pressed = keyEvent.getCode().toString();
        System.out.println("Touce '" + pressed + "' enfoncée");
        switch (pressed) {
          case "B":
            removeButton(fp);
            break;
          case "M":
            createButton(btnMangez, fp);
            break;
        }
      });

      root.setCenter(fp);

      primaryStage.setTitle("Hello World!");
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

}
