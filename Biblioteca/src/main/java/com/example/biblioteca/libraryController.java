package com.example.biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class libraryController implements Initializable{
    @FXML
    private HBox card;

    @FXML
    private GridPane locCarti;

    @FXML
    private List<carte> listaCarti;

    @FXML
    private Button butonImprumuturi;

    /**
     * Afiseaza cartile in ordine si detalii despre acestea
     *
     * @param locatie
     * @param resources
     */
    @Override
    public void initialize(URL locatie, ResourceBundle resources){
        listaCarti = new ArrayList<>(listaCarti());
        int coloana = 0;
        int linie = 1;
        try{
            for(carte carte : listaCarti){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("carte.fxml"));
                VBox box = fxmlLoader.load();
                carteController carteController = fxmlLoader.getController();
                carteController.setDate(carte);

                if(coloana == 4){
                    coloana=0;
                    ++linie;
                }
                locCarti.add(box,coloana++,linie);
                GridPane.setMargin(box,new Insets(10));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Creeaza o lista cu cartile din biblioteca
     *
     * @return
     */
    private List<carte> listaCarti(){
        List<carte> lista = new ArrayList<>();

        carte carte = new carte();
        carte.setTitlu("Ion");
        carte.setCoperta("/Images/Ion-liviurebreanu-edituraeduard.jpg");
        carte.setAutor("Autor: Liviu Rebreanu");
        carte.setAnDePublicatie("An de publicatie: 2006");
        carte.setPret("Pret: 67.00 lei");
        carte.setEditura("Editura: Eduard");
        lista.add(carte);

        carte = new carte();
        carte.setTitlu("Pe frontul de vest nimic nou");
        carte.setCoperta("/Images/Pefrontuldevestnimicnou-Polirom.jpg");
        carte.setAutor("Autor: Erich Maria Remarque");
        carte.setAnDePublicatie("An de publicatie: 2010");
        carte.setPret("Pret: 50.00 lei");
        carte.setEditura("Editura: Polirom");
        lista.add(carte);

        carte = new carte();
        carte.setTitlu("1984");
        carte.setCoperta("/Images/1984-PenguinBooks.jpg");
        carte.setAutor("Autor: George Orwell");
        carte.setAnDePublicatie("An de publicatie: 2007");
        carte.setPret("Pret: 53.00 lei");
        carte.setEditura("Editura: Penguin Books");
        lista.add(carte);

        carte = new carte();
        carte.setTitlu("Principele");
        carte.setCoperta("/Images/Principele-NiccoloMachiavelli-Humanitas.jpg");
        carte.setAutor("Autor: Niccolo Machiavelli");
        carte.setAnDePublicatie("An de publicatie: 2015");
        carte.setPret("Pret: 70.00 lei");
        carte.setEditura("Editura: Humanitas");
        lista.add(carte);

        carte = new carte();
        carte.setTitlu("The Atlantropa Articles");
        carte.setCoperta("/Images/TheAtlantropaArticles.jpg");
        carte.setAutor("Autor: Cody Franklin");
        carte.setAnDePublicatie("An de publicatie: 2019");
        carte.setPret("Pret: 84.00 lei");
        carte.setEditura("Editura: Mango");
        lista.add(carte);

        return lista;
    }

    /**
     * Schimba fereastra de biblioteca cu cea de imprumuturi
     *
     * @throws IOException
     */
    public void fereastraImprumuturi() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("imprumuturi.fxml"));

        Stage window = (Stage) butonImprumuturi.getScene().getWindow();
        window.setScene(new Scene(root,600,413));

    }

    /**
     * Actiunea pentru butonul de imprumuturi
     *
     * @param event
     * @throws IOException
     */
    public void butonImprumuturiUse(ActionEvent event ) throws IOException{
        fereastraImprumuturi();
    }
}
