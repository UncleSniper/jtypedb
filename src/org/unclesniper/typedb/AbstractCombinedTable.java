package org.unclesniper.typedb;

public abstract class AbstractCombinedTable<SpecT extends AbstractCombinedTable<SpecT>>
		implements Table<SpecT>, TableReference<SpecT> {

	private String name;

	private String alias;

	private final SpecT table;

	public AbstractCombinedTable(SpecT table, String name, String alias) {
		this.table = table;
		this.name = name;
		this.alias = alias;
	}

	public AbstractCombinedTable(SpecT table, String name) {
		this(table, name, null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public SpecT alias(String alias) {
		return aliasImpl(table, name, alias);
	}

	public SpecT alias() {
		return aliasImpl(table, name, null);
	}

	protected abstract SpecT aliasImpl(SpecT table, String name, String alias);

}
