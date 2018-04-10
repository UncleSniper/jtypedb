package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class MaybeShortLiteralExpression implements Expr<Short> {

	private Short literalValue;

	public MaybeShortLiteralExpression(Short literalValue) {
		this.literalValue = literalValue;
	}

	public Short getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(Short literalValue) {
		this.literalValue = literalValue;
	}

}
