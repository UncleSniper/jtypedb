package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class IntLiteralExpression implements Expr<Integer> {

	private int literalValue;

	public IntLiteralExpression(int literalValue) {
		this.literalValue = literalValue;
	}

	public int getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(int literalValue) {
		this.literalValue = literalValue;
	}

}
