package janelasav;

import org.omg.CORBA.portable.ApplicationException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(); //2
	}
	
	    @Override
	    public void start(Stage stage) {
	        Button btnInfo = new Button("Mostrar di�logo de informa��o");
	        Button btnErro = new Button("Mostrar di�logo de error");
	        Button btnAviso = new Button("Mostrar di�logo de aviso");

	        btnInfo.setOnAction(e -> {
	            Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
	            dialogoInfo.setTitle("Di�logo de informa��o");
	            dialogoInfo.setHeaderText("Esse � o cabe�alho...");
	            dialogoInfo.setContentText("Informa��o importante!");
	            dialogoInfo.showAndWait();
	        });
	        btnErro.setOnAction(e -> {
	            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
	            dialogoErro.setTitle("Di�logo de Error");
	            dialogoErro.setHeaderText("Esse � o cabe�alho...");
	            dialogoErro.setContentText("UM ERROR!!! UM ERRO ACONTECEU!!!");
	            dialogoErro.showAndWait();
	        });
	        btnAviso.setOnAction(e -> {
	            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
	            dialogoAviso.setTitle("Di�logo de Aviso");
	            dialogoAviso.setHeaderText("Esse � o cabe�alho...");
	            dialogoAviso.setContentText("AVISO IMPORTANTE! TENHA EM MENTE ISSO!");
	            dialogoAviso.showAndWait();
	        });

	        VBox raiz = new VBox(20);
	        raiz.setAlignment(Pos.CENTER);
	        raiz.getChildren().addAll(btnInfo, btnErro, btnAviso);

	        Scene cena = new Scene(raiz, 450, 200);
	        stage.setTitle("Di�logos de erro e informa��o");
	        stage.setScene(cena);
	        stage.show();
	    }

	}

