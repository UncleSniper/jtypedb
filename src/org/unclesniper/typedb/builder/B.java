package org.unclesniper.typedb.builder;

import org.unclesniper.typedb.Expr;
import org.unclesniper.typedb.expr.AdditionExpression;

public final class B {

	private B() {}

	public static AdditionExpression<Short> plus(Expr<Short> leftOperand, Expr<Short> rightOperand) {
		return new AdditionExpression<Short>(leftOperand, rightOperand);
	}

}
