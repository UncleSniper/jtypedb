package org.unclesniper.typedb;

public final class BasicColumnReference<TableT extends Table<TableT>, TypeT>
		implements ColumnReference<TableT, TypeT> {

	private final Column<TableT, TypeT> column;

	private final TableReference<TableT> table;

	private String alias;

	public BasicColumnReference(Column<TableT, TypeT> column, TableReference<TableT> table, String alias) {
		this.column = column;
		this.table = table;
		this.alias = alias;
	}

	public BasicColumnReference(Column<TableT, TypeT> column, TableReference<TableT> table) {
		this(column, table, null);
	}

	public Column<TableT, TypeT> getColumn() {
		return column;
	}

	public TableReference<TableT> getTable() {
		return table;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
