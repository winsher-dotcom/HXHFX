package com.example.hxhjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    public Button emitterButton;
    public AnchorPane homeRoot;
    public Button enhancerButton;

    @FXML
    private void openEmitterPage(ActionEvent event) throws IOException {
        new SceneChanger(homeRoot, "emitter.fxml");
    }

    @FXML
    private void openConjurerPage(ActionEvent event) throws IOException {
        new SceneChanger(homeRoot, "Conjurer.fxml");
    }

    @FXML
    private void openEnhancerPage(ActionEvent event) throws IOException {
        new SceneChanger(homeRoot, "enhancer.fxml");
    }

    @FXML
    private void openSpecialistPage(ActionEvent event) throws IOException {
        new SceneChanger(homeRoot, "specialist.fxml");
    }
}





