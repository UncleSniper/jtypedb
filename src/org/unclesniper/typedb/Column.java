package org.unclesniper.typedb;

public interface Column<TableT extends Table<TableT>, TypeT> {

	TableT getTable();

	String getName();

	ColumnReference<TableT, TypeT> ref(TableReference<TableT> table, String alias);

	ColumnReference<TableT, TypeT> ref(TableReference<TableT> table);

}
