package com.example.hxhjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EnhancerController {
    public AnchorPane enhancerRoot;
    @FXML private Button homeButton;

    public void backToHome() throws IOException {
        new SceneChanger(enhancerRoot, "home.fxml");
        if (enhancerRoot == null) {
            throw new IllegalArgumentException("currentView is null");
        }
    }


}



