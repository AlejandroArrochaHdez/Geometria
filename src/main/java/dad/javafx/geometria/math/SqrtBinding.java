package dad.javafx.geometria.math;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class SqrtBinding extends DoubleBinding {

	private DoubleExpression r;
	
	public SqrtBinding(DoubleExpression r) {
		super();
		this.r = r;
		bind(r);
	}
	@Override
	protected double computeValue() {
		return Math.sqrt(r.get());
	}

}
