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
	        Button btnInfo = new Button("Mostrar diálogo de informação");
	        Button btnErro = new Button("Mostrar diálogo de error");
	        Button btnAviso = new Button("Mostrar diálogo de aviso");

	        btnInfo.setOnAction(e -> {
	            Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
	            dialogoInfo.setTitle("Diálogo de informação");
	            dialogoInfo.setHeaderText("Esse é o cabeçalho...");
	            dialogoInfo.setContentText("Informação importante!");
	            dialogoInfo.showAndWait();
	        });
	        btnErro.setOnAction(e -> {
	            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
	            dialogoErro.setTitle("Diálogo de Error");
	            dialogoErro.setHeaderText("Esse é o cabeçalho...");
	            dialogoErro.setContentText("UM ERROR!!! UM ERRO ACONTECEU!!!");
	            dialogoErro.showAndWait();
	        });
	        btnAviso.setOnAction(e -> {
	            Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
	            dialogoAviso.setTitle("Diálogo de Aviso");
	            dialogoAviso.setHeaderText("Esse é o cabeçalho...");
	            dialogoAviso.setContentText("AVISO IMPORTANTE! TENHA EM MENTE ISSO!");
	            dialogoAviso.showAndWait();
	        });

	        VBox raiz = new VBox(20);
	        raiz.setAlignment(Pos.CENTER);
	        raiz.getChildren().addAll(btnInfo, btnErro, btnAviso);

	        Scene cena = new Scene(raiz, 450, 200);
	        stage.setTitle("Diálogos de erro e informação");
	        stage.setScene(cena);
	        stage.show();
	    }

	}

