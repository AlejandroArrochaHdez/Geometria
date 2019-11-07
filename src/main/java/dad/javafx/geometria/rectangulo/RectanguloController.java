package dad.javafx.geometria.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {
	
	private RectanguloModel model = new RectanguloModel();
	private RectanguloView  view = new RectanguloView();
	
	public RectanguloController() {
		view.getAnchoText().textProperty().bindBidirectional(model.anchoProperty(), new NumberStringConverter());
		view.getAltoText().textProperty().bindBidirectional(model.altoProperty(), new NumberStringConverter());
		view.getAreaLabel().textProperty().bind(Bindings.concat(model.areaProperty()));
		view.getPerimetroLabel().textProperty().bind(Bindings.concat(model.perimetroProperty()));
		
		view.getRectagulo().widthProperty().bind(model.anchoProperty());;
		view.getRectagulo().heightProperty().bind(model.altoProperty());
	}
	
	public RectanguloView getRoot() {
		return view;
	}
}
