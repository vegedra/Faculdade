// Aprendendo JavaFX - 18/03/2026
// @author: Pedro Ivo

package com.github.vegedra.tutorial;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;

/*  Application é uma classe abstrata que possui as funcionalidades da engine do JavaFX.
    Stage é o elemento que corresponde à janela na tela;
    Scene é o componente que guarda os elementos da janela.
    (semelhante aos panels do swing)
 */

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // Estados (evita coupling)
    private final StringProperty message = new SimpleStringProperty("");
    private final StringProperty name = new SimpleStringProperty("");

    // Inicializador
    @Override
    public void start(Stage primaryStage) {
        // Construtor - chama o metodo e define o tamanho da janela
        Scene scene = new Scene(createContent(), 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // O código abaixo foi feito pensado em evitar coupling e ser genérico

    // Cria o conteúdo na tela (vbox)
    private Region createContent() {
        // Guarda tudo aqui
        VBox results = new VBox(20, createInput(), createOutput(), createButton());
        results.setAlignment(Pos.CENTER);          // Alinhamento
        // Usar CSS
        results.getStylesheets().add(this.getClass().getResource("/css/stylesheet.css").toExternalForm());
        return results;
    }

    // Cria o botão e sua ação
    private Node createButton() {
        Button actionBtn = new Button("Clique em mim");
        actionBtn.setOnAction(evt -> setAction());    // Evento
        return actionBtn;
    }

    // Cria a area de input
    private Node createInput() {
        TextField inputText = new TextField("");
        inputText.textProperty().bindBidirectional(name);

        Label namePrompt = new Label("Nome:");
        namePrompt.getStyleClass().add("prompt-label"); // Usar estilo do CSS

        // HBox: Layout de caixa horizontal que mostra um texto e uma caixa de entrada da
        // esquerda para direita; Estamos instanciando-o como uma variavel
        HBox hBox = new HBox(6, namePrompt, inputText);
        hBox.setAlignment(Pos.CENTER);
        return hBox;
    }

    // Cria o output (evento do botão)
    private Node createOutput() {
        Label output = new Label("");
        output.getStyleClass().add("greeting-label");
        // Pode usar: Label results = styledLabel("", "greeting-label");
        output.textProperty().bind(message);    // Linka duas propriedas juntas, caso uma mude, a outra também muda
        return output;
    }

    // O evento do botão
    private void setAction() {
        message.set("Olá, " + name.get() + ".");
    }
}
