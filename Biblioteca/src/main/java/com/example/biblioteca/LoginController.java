package com.example.biblioteca;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.io.File;

public class LoginController implements Initializable {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginError;
    @FXML
    private ImageView bookImageView;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File bookFile = new File("Images/biblioteca.jpg");
        Image bookImage = new Image(bookFile.toURI().toString());
        bookImageView.setImage(bookImage);
    }

    /**
     * Verifica datele de login la apasarea butonului de login
     *
     * @param event
     * @throws IOException
     */
    public void loginButtonUse(ActionEvent event) throws IOException {

        String user = username.getText();
        String pass = password.getText();

        if (user.equals("user") && pass.equals("password")) {
            System.out.println("succesful login");
            fereastraBiblioteca();
        }
        else {
            loginError.setText("Wrong login, try again.");

        }
    }

    /**
     * Schimba fereastra de login cu cea de la biblioteca
     *
     * @throws IOException
     */
    public void fereastraBiblioteca() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("libraryWindow.fxml"));

        Stage window = (Stage) loginButton.getScene().getWindow();
        window.setScene(new Scene(root,1181,605));

    }

    /**
     * Inchide fereastra de login si opreste programul
     *
     * @param event
     */
    public void cancelButtonUse(ActionEvent event ){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
