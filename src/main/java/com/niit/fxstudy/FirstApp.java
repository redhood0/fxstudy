package com.niit.fxstudy;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

/**
 * 第一个使用了maven和bootstrap以及各种布局的javafx程序
 */
public class FirstApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/main.fxml");
        FXMLLoader loader = new FXMLLoader(location);
        StackPane pane = loader.load();


        //获取屏幕大小
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(pane, screenSize.width, screenSize.height);

        scene.getStylesheets().addAll("org/kordamp/bootstrapfx/bootstrapfx.css", "/css/style.css");


        primaryStage.getIcons().add(new Image("/img/logo.png"));
        primaryStage.setTitle("jianshu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
