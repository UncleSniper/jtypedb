package org.unclesniper.typedb.builder;

import org.unclesniper.typedb.Expr;
import org.unclesniper.typedb.expr.AdditionExpression;

public final class D {

	private D() {}

	public static AdditionExpression<Long> plus(Expr<Long> leftOperand, Expr<Long> rightOperand) {
		return new AdditionExpression<Long>(leftOperand, rightOperand);
	}

}
