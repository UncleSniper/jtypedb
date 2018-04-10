package org.unclesniper.typedb;

public abstract class AbstractTable<SpecT extends AbstractTable<SpecT>> implements Table<SpecT> {

	private String name;

	public AbstractTable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TableReference<SpecT> alias() {
		return alias(null);
	}

}
