package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class LongLiteralExpression implements Expr<Long> {

	private long literalValue;

	public LongLiteralExpression(long literalValue) {
		this.literalValue = literalValue;
	}

	public long getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(long literalValue) {
		this.literalValue = literalValue;
	}

}
