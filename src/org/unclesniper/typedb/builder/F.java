package org.unclesniper.typedb.builder;

import org.unclesniper.typedb.Expr;
import org.unclesniper.typedb.expr.AdditionExpression;

public final class F {

	private F() {}

	public static AdditionExpression<Double> plus(Expr<Double> leftOperand, Expr<Double> rightOperand) {
		return new AdditionExpression<Double>(leftOperand, rightOperand);
	}

}
