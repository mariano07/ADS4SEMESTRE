package Main;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class main extends Application { //1

	public static void main(String[] args) {
		launch(); //2
	}
		
		public void start(Stage palco) throws Exception { // 3
			StackPane raiz = new StackPane(); // 4
			Label lblMensagem = new Label(); // 5
			
			lblMensagem.setText("Primeira Aplicação com JAVAFX"); //6
			raiz.getChildren().add(lblMensagem); // 7
			
			Scene cena = new Scene(raiz, 250, 100); // 8 
			palco.setTitle("OO2 Aprendendo FX"); // 9
			palco.setScene(cena); // 10
			palco.show(); // 11 
		}

	}
