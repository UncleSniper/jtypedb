package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class MaybeDoubleLiteralExpression implements Expr<Double> {

	private Double literalValue;

	public MaybeDoubleLiteralExpression(Double literalValue) {
		this.literalValue = literalValue;
	}

	public Double getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(Double literalValue) {
		this.literalValue = literalValue;
	}

}
