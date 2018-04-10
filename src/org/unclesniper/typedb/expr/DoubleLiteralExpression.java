package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class DoubleLiteralExpression implements Expr<Double> {

	private double literalValue;

	public DoubleLiteralExpression(double literalValue) {
		this.literalValue = literalValue;
	}

	public double getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(double literalValue) {
		this.literalValue = literalValue;
	}

}
