package org.unclesniper.typedb;

public interface TableReference<SpecT extends Table<SpecT>> {

	Table<SpecT> getTable();

	String getAlias();

}
