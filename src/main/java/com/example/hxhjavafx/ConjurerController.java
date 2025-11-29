package com.example.hxhjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ConjurerController {
    public AnchorPane conjurerRoot;
    @FXML private Button homeButton;

    public void backToHome() throws IOException {
        new SceneChanger(conjurerRoot, "home.fxml");
        if (conjurerRoot == null) {
            throw new IllegalArgumentException("currentView is null");
        }
    }


}



