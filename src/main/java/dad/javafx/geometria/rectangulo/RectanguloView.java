package dad.javafx.geometria.rectangulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView  extends BorderPane{
	
	private Label areaLabel, perimetroLabel;
	private TextField anchoText, altoText;
	private Rectangle rectagulo;
	
	public RectanguloView() {
		super();
		anchoText = new TextField();
		altoText = new TextField();
		
		areaLabel = new Label();
		perimetroLabel = new Label();
		
		rectagulo = new Rectangle();
		rectagulo.setStroke(Color.BLACK);
		rectagulo.setStrokeWidth(2);
		rectagulo.setFill(Color.rgb(0, 162, 232));
		
		HBox rectanguloHbox = new HBox(rectagulo);
		rectanguloHbox.setAlignment(Pos.CENTER);
		
		GridPane panelGrid = new GridPane();
		panelGrid.addRow(0, new Label("Ancho: "), anchoText);
		panelGrid.addRow(1, new Label("Alto: "), altoText);
		panelGrid.addRow(2, rectanguloHbox);
		panelGrid.addRow(3, new Label("Area: "), areaLabel);
		panelGrid.addRow(4, new Label("Perimetro: "), perimetroLabel);
		panelGrid.setAlignment(Pos.CENTER);
		panelGrid.setHgap(5);
		panelGrid.setVgap(5);
		
		GridPane.setColumnSpan(rectanguloHbox, 2);
		
		setCenter(panelGrid);
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public TextField getAnchoText() {
		return anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public Rectangle getRectagulo() {
		return rectagulo;
	}
	
}
