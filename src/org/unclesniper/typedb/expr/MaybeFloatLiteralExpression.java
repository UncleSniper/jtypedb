package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class MaybeFloatLiteralExpression implements Expr<Float> {

	private Float literalValue;

	public MaybeFloatLiteralExpression(Float literalValue) {
		this.literalValue = literalValue;
	}

	public Float getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(Float literalValue) {
		this.literalValue = literalValue;
	}

}
