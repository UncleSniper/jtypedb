package org.unclesniper.typedb;

public final class BasicColumn<TableT extends Table<TableT>, TypeT> implements Column<TableT, TypeT> {

	private final TableT table;

	private String name;

	public BasicColumn(TableT table, String name) {
		this.table = table;
		this.name = name;
	}

	public TableT getTable() {
		return table;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ColumnReference<TableT, TypeT> ref(TableReference<TableT> table, String alias) {
		return new BasicColumnReference<TableT, TypeT>(this, table, alias);
	}

	public ColumnReference<TableT, TypeT> ref(TableReference<TableT> table) {
		return new BasicColumnReference<TableT, TypeT>(this, table, null);
	}

}
