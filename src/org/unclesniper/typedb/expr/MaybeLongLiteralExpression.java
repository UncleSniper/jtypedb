package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class MaybeLongLiteralExpression implements Expr<Long> {

	private Long literalValue;

	public MaybeLongLiteralExpression(Long literalValue) {
		this.literalValue = literalValue;
	}

	public Long getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(Long literalValue) {
		this.literalValue = literalValue;
	}

}
