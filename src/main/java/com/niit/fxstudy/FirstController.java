package com.niit.fxstudy;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class FirstController {

    @FXML
    public BorderPane mainPage;
    @FXML
    public BorderPane subPage;


    public void toSubPage() {
        mainPage.setVisible(false);
        subPage.setVisible(true);
    }

    public void backToMain() {
        subPage.setVisible(false);
        mainPage.setVisible(true);
    }
}
