package org.khanhtd.javafx.controller;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class StageSceneController {
	private Stage stage;
	private Scene scene;
	
	public Stage getStage() {
		return stage;
	}
	
	public StageSceneController setStage(Stage stage) {
		this.stage = stage;
		return this;
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public StageSceneController setScene(Scene scene) {
		this.scene = scene;
		return this;
	}
}
