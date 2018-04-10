package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class FloatLiteralExpression implements Expr<Float> {

	private float literalValue;

	public FloatLiteralExpression(float literalValue) {
		this.literalValue = literalValue;
	}

	public float getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(float literalValue) {
		this.literalValue = literalValue;
	}

}
