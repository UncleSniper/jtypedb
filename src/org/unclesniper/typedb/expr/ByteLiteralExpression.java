package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;

public class ByteLiteralExpression implements Expr<Byte> {

	private byte literalValue;

	public ByteLiteralExpression(byte literalValue) {
		this.literalValue = literalValue;
	}

	public byte getLiteralValue() {
		return literalValue;
	}

	public void setLiteralValue(byte literalValue) {
		this.literalValue = literalValue;
	}

}
