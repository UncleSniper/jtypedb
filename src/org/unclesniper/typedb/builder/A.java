package org.unclesniper.typedb.builder;

import org.unclesniper.typedb.Expr;
import org.unclesniper.typedb.expr.AdditionExpression;

public final class A {

	private A() {}

	public static AdditionExpression<Byte> plus(Expr<Byte> leftOperand, Expr<Byte> rightOperand) {
		return new AdditionExpression<Byte>(leftOperand, rightOperand);
	}

}
