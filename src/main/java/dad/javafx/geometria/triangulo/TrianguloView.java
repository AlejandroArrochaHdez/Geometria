package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.shape.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class TrianguloView  extends BorderPane{
	
	private Label areaLabel, perimetroLabel;
	private TextField baseText, alturaText;
	private Triangle triangulo;
	
	public TrianguloView() {
		super();
		baseText = new TextField();
		alturaText = new TextField();
		
		areaLabel = new Label();
		perimetroLabel = new Label();
		
		triangulo = new Triangle();
		triangulo.setStroke(Color.BLACK);
		triangulo.setStrokeWidth(2);
		triangulo.setFill(Color.GREEN);
		
		HBox trianguloHbox = new HBox(triangulo);
		trianguloHbox.setAlignment(Pos.CENTER);
		
		GridPane panelGrid = new GridPane();
		panelGrid.addRow(0, new Label("Base: "), baseText);
		panelGrid.addRow(1, new Label("Altura: "), alturaText);
		panelGrid.addRow(2, trianguloHbox);
		panelGrid.addRow(3, new Label("Area: "), areaLabel);
		panelGrid.addRow(4, new Label("Perimetro: "), perimetroLabel);
		panelGrid.setAlignment(Pos.CENTER);
		panelGrid.setHgap(5);
		panelGrid.setVgap(5);
		
		GridPane.setColumnSpan(trianguloHbox, 2);
		
		setCenter(panelGrid);
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public TextField getBaseText() {
		return baseText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

	public Triangle getRectagulo() {
		return triangulo;
	}
	
}
