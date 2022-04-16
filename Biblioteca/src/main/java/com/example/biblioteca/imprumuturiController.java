package com.example.biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;

public class imprumuturiController {

    @FXML
    private Button butonInapoi;

    @FXML
    private Button butonAfisare;

    @FXML
    private TextField imprumut1984;

    @FXML
    private TextField imprumutAtlantropa;

    @FXML
    private TextField imprumutFrontul;

    @FXML
    private TextField imprumutIon;

    @FXML
    private TextField imprumutPrincipele;

    /**
     * Actiunea pentru butonul de intoarcere la fereastra
     * biblioteca
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void butonInapoiUse(ActionEvent event)throws IOException {
        fereastraBiblioteca();
    }

    /**
     * Actiune pentru butonul de afisare al imprumuturilor
     *
     * @param event
     */
    @FXML
    void butonAfisareUse(ActionEvent event) {
        imprumutIon.setText(Main.Ion);
        imprumutPrincipele.setText(Main.Principele);
        imprumutAtlantropa.setText(Main.Atlantropa);
        imprumut1984.setText(Main.I984);
        imprumutFrontul.setText(Main.Frontul);
    }

    /**
     * Schimba fereastra de imprumuturi cu cea de biblioteca
     *
     * @throws IOException
     */
    public void fereastraBiblioteca() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("libraryWindow.fxml"));

        Stage window = (Stage) butonInapoi.getScene().getWindow();
        window.setScene(new Scene(root,1181,605));

    }

    /**
     * Salveaza in variabila Ion textul din text field
     * la actionare text fieldului
     *
     * @param event
     */
    @FXML
    void salvareIon(ActionEvent event) {
        Main.Ion = imprumutIon.getText();
        System.out.println(Main.Ion);
    }

    /**
     * Salveaza in variabila Principele textul din text field
     * la actionare text fieldului
     *
     * @param event
     */
    @FXML
    void salvarePrincipele(ActionEvent event) {
        Main.Principele = imprumutPrincipele.getText();
    }

    /**
     * Salveaza in variabila I984 textul din text field
     * actionare text fieldului
     *
     * @param event
     */
    @FXML
    void salvare1984(ActionEvent event) {
        Main.I984 = imprumut1984.getText();
    }

    /**
     * Salveaza in variabila Atlantropa textul din text field
     * la actionare text fieldului
     *
     * @param event
     */
    @FXML
    void salvareArticles(ActionEvent event) {
        Main.Atlantropa = imprumutAtlantropa.getText();
    }

    /**
     * Salveaza in variabila Frontul textul din text field
     * la actionare text fieldului
     *
     * @param event
     */
    @FXML
    void salvareFrontul(ActionEvent event) {
        Main.Frontul = imprumutFrontul.getText();
    }
}
