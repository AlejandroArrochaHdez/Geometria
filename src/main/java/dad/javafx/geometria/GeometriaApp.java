package dad.javafx.geometria;


import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.hexagono.HexagonoController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.triangulo.TrianguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeometriaApp extends Application {
	
	private RectanguloController rectanguloController;
	private TrianguloController trianguloController;
	private CirculoController circuloController;
	private HexagonoController hexagonoController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		rectanguloController = new RectanguloController();
		trianguloController = new TrianguloController();
		circuloController = new CirculoController();
		hexagonoController = new HexagonoController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		root.getTabs().add(new Tab("Rectangulo", rectanguloController.getRoot()));
		root.getTabs().add(new Tab("Triangulo", trianguloController.getRoot()));
		root.getTabs().add(new Tab("Circulo", circuloController.getRoot()));
		root.getTabs().add(new Tab("Hexagono", hexagonoController.getRoot()));
		
		Scene scene = new Scene(root, 640, 480);
		
		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
