package dad.javafx.geometria.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController {
	
	private HexagonoModel model = new HexagonoModel();
	private HexagonoView  view = new HexagonoView();
	
	public HexagonoController() {
		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		view.getAreaLabel().textProperty().bind(Bindings.concat(model.areaProperty()));
		view.getPerimetroLabel().textProperty().bind(Bindings.concat(model.perimetroProperty()));
		
		view.getHexagono().radiusProperty().bind(model.radioProperty());;
	}
	
	public HexagonoView getRoot() {
		return view;
	}
}