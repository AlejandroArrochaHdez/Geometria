package dad.javafx.geometria.circulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView  extends BorderPane{
	
	private Label areaLabel, perimetroLabel;
	private TextField radioText;
	private Circle circulo;
	
	public CirculoView() {
		super();
		radioText = new TextField();
		
		areaLabel = new Label();
		perimetroLabel = new Label();
		
		circulo = new Circle();
		circulo.setStroke(Color.BLACK);
		circulo.setStrokeWidth(2);
		circulo.setFill(Color.RED);
		
		HBox circuloHbox = new HBox(circulo);
		circuloHbox.setAlignment(Pos.CENTER);
		
		GridPane panelGrid = new GridPane();
		panelGrid.addRow(0, new Label("Radio: "), radioText);
		panelGrid.addRow(1, circuloHbox);
		panelGrid.addRow(2, new Label("Area: "), areaLabel);
		panelGrid.addRow(3, new Label("Perimetro: "), perimetroLabel);
		panelGrid.setAlignment(Pos.CENTER);
		panelGrid.setHgap(5);
		panelGrid.setVgap(5);
		
		GridPane.setColumnSpan(circuloHbox, 2);
		
		setCenter(panelGrid);
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public TextField getRadioText() {
		return radioText;
	}

	public Circle getCirculo() {
		return circulo;
	}
	
}
