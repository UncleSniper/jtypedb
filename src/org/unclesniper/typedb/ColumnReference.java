package org.unclesniper.typedb;

public interface ColumnReference<TableT extends Table<TableT>, TypeT> {

	Column<TableT, TypeT> getColumn();

	TableReference<TableT> getTable();

	String getAlias();

}
