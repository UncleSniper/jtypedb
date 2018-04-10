package org.unclesniper.typedb.builder;

import org.unclesniper.typedb.Expr;
import org.unclesniper.typedb.expr.AdditionExpression;

public final class E {

	private E() {}

	public static AdditionExpression<Float> plus(Expr<Float> leftOperand, Expr<Float> rightOperand) {
		return new AdditionExpression<Float>(leftOperand, rightOperand);
	}

}
