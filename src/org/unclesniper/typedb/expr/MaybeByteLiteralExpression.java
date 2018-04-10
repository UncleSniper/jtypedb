package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class MaybeByteLiteralExpression implements Expr<Byte> {

	private Byte literalValue;

	public MaybeByteLiteralExpression(Byte literalValue) {
		this.literalValue = literalValue;
	}

	public Byte getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(Byte literalValue) {
		this.literalValue = literalValue;
	}

}
