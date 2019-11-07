package dad.javafx.geometria.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController {
	
	private TrianguloModel model = new TrianguloModel();
	private TrianguloView  view = new TrianguloView();
	
	public TrianguloController() {
		view.getBaseText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAlturaText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
		view.getAreaLabel().textProperty().bind(Bindings.concat(model.areaProperty()));
		view.getPerimetroLabel().textProperty().bind(Bindings.concat(model.perimetroProperty()));
		
		view.getRectagulo().baseProperty().bind(model.baseProperty());;
		view.getRectagulo().heightProperty().bind(model.alturaProperty());
	}
	
	public TrianguloView getRoot() {
		return view;
	}
}