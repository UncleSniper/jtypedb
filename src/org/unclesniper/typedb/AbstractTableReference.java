package org.unclesniper.typedb;

public abstract class AbstractTableReference<SpecT extends Table<SpecT>> implements TableReference<SpecT> {

	private final Table<SpecT> table;

	private String alias;

	public AbstractTableReference(Table<SpecT> table, String alias) {
		this.table = table;
		this.alias = alias;
	}

	public AbstractTableReference(Table<SpecT> table) {
		this(table, null);
	}

	public Table<SpecT> getTable() {
		return table;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
