// Aprendendo JavaFX - 18/03/2026
// @author: Pedro Ivo

package com.github.vegedra.tutorial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/*  Application é uma classe abstrata que possui as funcionalidades da engine do JavaFX.
    Stage é o elemento que corresponde à janela na tela;
    Scene é o componente que guarda os elementos da janela.
    (semelhante aos panels do swing)
 */

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // Inicializador
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Cria o conteúdo na tela
    private Region createContent() {
        return new Label("Olá, mundo!");
    }
}
