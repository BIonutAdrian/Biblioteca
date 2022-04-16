package com.example.biblioteca;

import com.example.biblioteca.carte;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class carteController {
    @FXML
    private Label anDePublicatie;

    @FXML
    private Label autor;

    @FXML
    private ImageView coperta;

    @FXML
    private Label titlu;

    @FXML
    private VBox card;

    @FXML
    private Label editura;

    @FXML
    private Label pret;


    /**
     * Functie pentru setarea datelor unei carti
     *
     * @param carte
     */
    public void setDate(carte carte){
        Image poza = new Image(getClass().getResourceAsStream(carte.getCoperta()));

        coperta.setImage(poza);
        titlu.setText(carte.getTitlu());
        autor.setText(carte.getAutor());
        editura.setText(carte.getEditura());
        pret.setText(carte.getPret());
        anDePublicatie.setText(carte.getAnDePublicatie());

    }
}
