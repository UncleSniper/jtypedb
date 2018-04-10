package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class ShortLiteralExpression implements Expr<Short> {

	private short literalValue;

	public ShortLiteralExpression(short literalValue) {
		this.literalValue = literalValue;
	}

	public short getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(short literalValue) {
		this.literalValue = literalValue;
	}

}
