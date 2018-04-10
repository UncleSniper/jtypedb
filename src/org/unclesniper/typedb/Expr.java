package org.unclesniper.typedb;

import org.unclesniper.typedb.expr.IntLiteralExpression;
import org.unclesniper.typedb.expr.ByteLiteralExpression;
import org.unclesniper.typedb.expr.LongLiteralExpression;
import org.unclesniper.typedb.expr.ShortLiteralExpression;
import org.unclesniper.typedb.expr.FloatLiteralExpression;
import org.unclesniper.typedb.expr.DoubleLiteralExpression;
import org.unclesniper.typedb.expr.ColumnReferenceExpression;
import org.unclesniper.typedb.expr.MaybeIntLiteralExpression;
import org.unclesniper.typedb.expr.MaybeByteLiteralExpression;
import org.unclesniper.typedb.expr.MaybeLongLiteralExpression;
import org.unclesniper.typedb.expr.MaybeShortLiteralExpression;
import org.unclesniper.typedb.expr.MaybeFloatLiteralExpression;
import org.unclesniper.typedb.expr.MaybeDoubleLiteralExpression;

public interface Expr<ReturnT> {

	public static <TableT extends Table<TableT>, TypeT>
	ColumnReferenceExpression<TableT, TypeT> column(ColumnReference<TableT, TypeT> column) {
		return new ColumnReferenceExpression<TableT, TypeT>(column);
	}

	public static <TableT extends Table<TableT>, TypeT>
	ColumnReferenceExpression<TableT, TypeT> column(TableReference<TableT> table, Column<TableT, TypeT> column) {
		return new ColumnReferenceExpression<TableT, TypeT>(column.ref(table));
	}

	public static <TableT extends Table<TableT>, TypeT>
	ColumnReferenceExpression<TableT, TypeT> column(TableReference<TableT> table, Column<TableT, TypeT> column,
			String alias) {
		return new ColumnReferenceExpression<TableT, TypeT>(column.ref(table, alias));
	}

	public static ByteLiteralExpression just(byte literalValue) {
		return new ByteLiteralExpression(literalValue);
	}

	public static ShortLiteralExpression just(short literalValue) {
		return new ShortLiteralExpression(literalValue);
	}

	public static IntLiteralExpression just(int literalValue) {
		return new IntLiteralExpression(literalValue);
	}

	public static LongLiteralExpression just(long literalValue) {
		return new LongLiteralExpression(literalValue);
	}

	public static FloatLiteralExpression just(float literalValue) {
		return new FloatLiteralExpression(literalValue);
	}

	public static DoubleLiteralExpression just(double literalValue) {
		return new DoubleLiteralExpression(literalValue);
	}

	public static MaybeByteLiteralExpression maybe(Byte literalValue) {
		return new MaybeByteLiteralExpression(literalValue);
	}

	public static MaybeShortLiteralExpression maybe(Short literalValue) {
		return new MaybeShortLiteralExpression(literalValue);
	}

	public static MaybeIntLiteralExpression maybe(Integer literalValue) {
		return new MaybeIntLiteralExpression(literalValue);
	}

	public static MaybeLongLiteralExpression maybe(Long literalValue) {
		return new MaybeLongLiteralExpression(literalValue);
	}

	public static MaybeFloatLiteralExpression maybe(Float literalValue) {
		return new MaybeFloatLiteralExpression(literalValue);
	}

	public static MaybeDoubleLiteralExpression maybe(Double literalValue) {
		return new MaybeDoubleLiteralExpression(literalValue);
	}

}
