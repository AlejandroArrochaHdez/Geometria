package dad.javafx.geometria.hexagono;

import dad.javafx.geometria.shape.Hexagon;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class HexagonoView  extends BorderPane{
	
	private Label areaLabel, perimetroLabel;
	private TextField radioText;
	private Hexagon hexagono;
	
	public HexagonoView() {
		super();
		radioText = new TextField();
		
		areaLabel = new Label();
		perimetroLabel = new Label();
		
		hexagono = new Hexagon();
		hexagono.setStroke(Color.BLACK);
		hexagono.setStrokeWidth(2);
		hexagono.setFill(Color.PURPLE);
		
		HBox hexagonHbox = new HBox(hexagono);
		hexagonHbox.setAlignment(Pos.CENTER);
		
		GridPane panelGrid = new GridPane();
		panelGrid.addRow(0, new Label("Radio: "), radioText);
		panelGrid.addRow(1, hexagonHbox);
		panelGrid.addRow(2, new Label("Area: "), areaLabel);
		panelGrid.addRow(3, new Label("Perimetro: "), perimetroLabel);
		panelGrid.setAlignment(Pos.CENTER);
		panelGrid.setHgap(5);
		panelGrid.setVgap(5);
		
		GridPane.setColumnSpan(hexagonHbox, 2);
		
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

	public Hexagon getHexagono() {
		return hexagono;
	}
	
}
