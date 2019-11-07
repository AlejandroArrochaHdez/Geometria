package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.math.MathBindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class TrianguloModel {
	
	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty altura = new SimpleDoubleProperty();
	private DoubleProperty hip = new SimpleDoubleProperty();
	private DoubleProperty cat = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	
	public TrianguloModel() {
		area.bind(base.multiply(altura).divide(2)); // (Base * altura) / 2
		cat.bind(base.divide(2));
		hip.bind(MathBindings.sqrt(MathBindings.pow(cat, 2.0).add(MathBindings.pow(altura, 2.0))));
		perimetro.bind(base.add(hip.multiply(2)));
		
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}
	

	public final double getBase() {
		return this.baseProperty().get();
	}
	

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}
	

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}
	

	public final double getAltura() {
		return this.alturaProperty().get();
	}
	

	public final void setAltura(final double altura) {
		this.alturaProperty().set(altura);
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}
	


	
	
	
}