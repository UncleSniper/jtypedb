package org.unclesniper.typedb.builder;

import org.unclesniper.typedb.Expr;
import org.unclesniper.typedb.expr.AdditionExpression;

public final class C {

	private C() {}

	public static AdditionExpression<Integer> plus(Expr<Integer> leftOperand, Expr<Integer> rightOperand) {
		return new AdditionExpression<Integer>(leftOperand, rightOperand);
	}

}
