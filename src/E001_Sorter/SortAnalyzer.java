/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E001_Sorter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import E001_Sorter.util.Instru;

/**
 *
 * @author fredericferrant
 */
public class SortAnalyzer extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Font.loadFont(SortAnalyzer.class.getResource("../fonts/fontawesome-webfont.ttf").
        //  toExternalForm(), 12);
        launch(args);
    }

    private static void playNote(int val) {
        instru.note_on(30 + val);
        instru.note_off(30 + val);
    }

    private void sortValues() {
        Sorter.sort(val, this);
        //SorterFEF.sort(val, this);
    }

    public static int pauseTime = 10;
    private Label tNbComp;
    private Label tNbExch;
    private Label tElapsed;

    private int nbComp = 0;
    private int nbExch = 0;
    private long msStart = System.nanoTime();
    private long msElapsed = 0;

    private static Pane canv;
    private Scene scene;
    private RadioButton rbRand;
    private RadioButton rbInvr;
    private RadioButton rbAlms;
    private RadioButton rbLvls;
    private Button btnStart;
    private Button btnStep;
    private Button btnStop;

    private static Instru instru = new Instru();

    int[] val = new int[100];

    public void start(Stage primaryStage) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("SortAnalyzerApp.fxml"));
//        Scene scene = new Scene(root);

        BorderPane root;
        root = new BorderPane();
        root.setPrefHeight(400);
        root.setPrefWidth(640);

        canv = addCenterPane();
        root.setCenter(canv);

        VBox vbox = addRightVBox();
        root.setRight(vbox);

        HBox hbox = addBottomHBox();
        root.setBottom(hbox);

        scene = new Scene(root);
        primaryStage.setFullScreen(true);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Sort Analyzer");
        primaryStage.show();

        for (int i = 0; i < 100; i++) {
            val[i] = i + 1;
        }

    }

    public Pane addCenterPane() {
        Pane canv = new Pane();
        canv.setStyle("-fx-background-color: WHITE");
        return canv;
    }

    public VBox addRightVBox() {
        // Vbox on the right, with radio-buttons and start/stop buttons
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(8, 8, 8, 8));
        vbox.setSpacing(10);
        vbox.setMinWidth(140);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setStyle("-fx-background-color: #DDDDDD;");

        // ivbox = VBox.VBox for the radio-buttons
        VBox ivbox = new VBox();
        ivbox.setFillWidth(false);
        ivbox.setSpacing(8);
        ivbox.setAlignment(Pos.CENTER);

        Label txt = new Label("Select Sample");
        txt.setUnderline(true);

        ToggleGroup tg = new ToggleGroup();
        // rb = VBox.VBox.VBox to align the radio-buttons left
        VBox rb = new VBox();
        rb.setAlignment(Pos.CENTER_LEFT);

        rbRand = new RadioButton("Random");
        tg.getToggles().add(rbRand);
        rbRand.setSelected(true);

        rbInvr = new RadioButton("Inverse");
        tg.getToggles().add(rbInvr);

        rbAlms = new RadioButton("Almost Sorted");
        tg.getToggles().add(rbAlms);

        rbLvls = new RadioButton("Levels");
        tg.getToggles().add(rbLvls);

        // add radiobuttons and label in rb
        rb.getChildren().addAll(txt, rbRand, rbInvr, rbAlms, rbLvls);

        Button bGenerate = addGenerateButton();
        // add rb and button in ivbox
        ivbox.getChildren().addAll(rb, bGenerate);

        // Start - Step - Stop
        TilePane tilpan = new TilePane();
        tilpan.setPadding(new Insets(4, 4, 4, 4));
        tilpan.setAlignment(Pos.BOTTOM_CENTER);
        tilpan.setTileAlignment(Pos.BOTTOM_CENTER);
        tilpan.setHgap(0);

        tilpan.getChildren().addAll(
                btnStart = addBtn("\uf04b", false, "Start!")); //,
//                btnStep = addBtn("\uf04c", true, "Step"),
//                btnStop = addBtn("\uf04d", true, "Stop"));

        btnStart.setOnAction((ActionEvent event) -> {
            sortValues();
        });
//        btnStart.setOnAction(new EventHandler<ActionEvent>() {
//
//          @Override
//          public void handle(ActionEvent event) {
//            sortValues();
//          }
//        });
  //          btnStart.setDisable(true);
        //        btnStop.setDisable(false);
        //      btnStep.setDisable(true);

  //      btnStop.setOnAction((ActionEvent event) -> {
        //         btnStop.setDisable(true);
        //       btnStart.setDisable(false);
        //     btnStep.setDisable(false);
        //});
        // add ivbox and tile-panel in right vbow
        vbox.getChildren().addAll(ivbox, tilpan);
        return vbox;
    }

    private Button addBtn(String bTxt, boolean disable, String text) {
        Button btn = new Button();
        btn.setText(bTxt);
        btn.setStyle("-fx-font-family: FontAwesome;");
        btn.setDisable(disable);
        return btn;
    }

    public HBox addBottomHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(8, 8, 8, 4));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #CCDDEE;");
        hbox.setAlignment(Pos.CENTER_LEFT);

        TilePane tp = new TilePane();
        tp.setAlignment(Pos.CENTER_LEFT);
        tp.setMinWidth(640);
        tNbComp = new Label("0");
        tNbExch = new Label("0");
        tElapsed = new Label("0");
        tp.getChildren().addAll(addLbl("0", "Nb Comp.:", tNbComp),
                addLbl("0", "Nb Exch.:", tNbExch),
                addLbl("0", "Elapsed:", tElapsed));

        hbox.getChildren().add(tp);

        return hbox;
    }

    private Node addLbl(String val, String txt, Label lbl) {
        lbl.setMinSize(120, 12);
        lbl.setStyle("-fx-background-color: rgba(0, 0, 0, 0);text-align: right; ");
        HBox hb = new HBox(new Label(txt), lbl);
//        HBox hb = new HBox();
//        hb.getChildren().addAll(new Label(txt), lbl);
        hb.prefWidth(200);
        hb.maxHeight(14);

        return hb;
    }

    public static void traceValue(int pos, int val, Color col) {
        int w = 12;
        Rectangle delRect = new Rectangle(w, 820);
        delRect.setFill(Color.WHITE);
        delRect.setStroke(Color.WHITE);
        delRect.relocate(20 + pos * w, 20);
        Rectangle rect = new Rectangle(w, 8 * val);
        rect.setFill(col);
        rect.setStroke(Color.WHITE);
        rect.relocate(20 + pos * w, 830 - 8 * val);
        Platform.runLater(new Runnable() {
            public void run() {
                canv.getChildren().add(delRect);
                canv.getChildren().add(rect);
            }
        });
        try {
            Thread.sleep(pauseTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(SortAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        playNote(val);
    }

    private Button addGenerateButton() {
        Button bGenerate = new Button("Generate");
        bGenerate.setAlignment(Pos.CENTER);
        bGenerate.setOnAction((ActionEvent event) -> {
            new Thread() {
                public void run() {
                    Platform.runLater(new Runnable() {
                        public void run() {
                            canv.getChildren().clear();
                            //btnStop.setDisable(true);
                            //btnStart.setDisable(false);
                            //btnStep.setDisable(false);
                        }
                    });
                    if (rbRand.isSelected()) {
                        randomPopulation();
                    } else if (rbInvr.isSelected()) {
                        inversePopulation();
                    } else if (rbAlms.isSelected()) {
                        almostSortedPopulation();
                    } else if (rbLvls.isSelected()) {
                        leveledPopulation();
                    }

                    for (int i = 1; i < 100; i++) {
                        traceValue(i, val[i], Color.BLACK);
                    }

                }
            }.start();
        });
        return bGenerate;
    }

    private void randomPopulation() {
        inversePopulation();
        for (int c = 0; c <= 1000; c++) {
            int i = (int) (Math.random() * 100);
            int j = (int) (Math.random() * 100);
            swapValues(i, j);
        }

    }

    private void inversePopulation() {
        for (int i = 0; i < 100; i++) {
            val[i] = 101 - i;
        }
    }

    private void almostSortedPopulation() {
        for (int i = 0; i < 100; i++) {
            val[i] = i + 1;
        }

        for (int c = 0; c <= 10; c++) {
            int i = (int) (Math.random() * 100);
            int j = (int) (Math.random() * 100);
            swapValues(i, j);
        }

    }

    private void leveledPopulation() {
        for (int i = 0; i < 100; i++) {
            val[i] = 10 * (i / 10 + 1);
        }
    }

    private void swapValues(int i, int j) {
        int t = val[j];
        val[j] = val[i];
        val[i] = t;
    }

    public void exchangeValues(int i, int j) {
        swapValues(i, j);
        traceValue(i, val[i], Color.DARKBLUE);
        traceValue(j, val[j], Color.DARKBLUE);
    }

    void setValue(int pos, int v) {
        val[pos] = v;
        traceValue(pos, val[pos], Color.DARKBLUE);
    }

}
