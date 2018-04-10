package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class AdditionExpression<ReturnT> implements Expr<ReturnT> {

	private final Expr<ReturnT> leftOperand;

	private final Expr<ReturnT> rightOperand;

	public AdditionExpression(Expr<ReturnT> leftOperand, Expr<ReturnT> rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	public Expr<ReturnT> getLeftOperand() {
		return leftOperand;
	}

	public Expr<ReturnT> getRightOperand() {
		return rightOperand;
	}

}
