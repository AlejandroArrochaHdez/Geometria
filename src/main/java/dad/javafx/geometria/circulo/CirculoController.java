package dad.javafx.geometria.circulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CirculoController {
	
	private CirculoModel model = new CirculoModel();
	private CirculoView  view = new CirculoView();
	
	public CirculoController() {
		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		view.getAreaLabel().textProperty().bind(Bindings.concat(model.areaProperty()));
		view.getPerimetroLabel().textProperty().bind(Bindings.concat(model.perimetroProperty()));
		
		view.getCirculo().radiusProperty().bind(model.radioProperty());;
	}
	
	public CirculoView getRoot() {
		return view;
	}
}