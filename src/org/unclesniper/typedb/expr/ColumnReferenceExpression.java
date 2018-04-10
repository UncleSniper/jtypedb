package org.unclesniper.typedb.expr;

import org.unclesniper.typedb.Expr;
import org.unclesniper.typedb.Table;
import org.unclesniper.typedb.ColumnReference;

public class ColumnReferenceExpression<TableT extends Table<TableT>, TypeT> implements Expr<TypeT> {

	private final ColumnReference<TableT, TypeT> column;

	public ColumnReferenceExpression(ColumnReference<TableT, TypeT> column) {
		this.column = column;
	}

	public ColumnReference<TableT, TypeT> getColumn() {
		return column;
	}

}
