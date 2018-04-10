package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class MaybeIntLiteralExpression implements Expr<Integer> {

	private Integer literalValue;

	public MaybeIntLiteralExpression(Integer literalValue) {
		this.literalValue = literalValue;
	}

	public Integer getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(Integer literalValue) {
		this.literalValue = literalValue;
	}

}
