package org.unclesniper.typedb;

public interface Table<SpecT extends Table<SpecT>> {

	String getName();

	TableReference<SpecT> alias(String alias);

	TableReference<SpecT> alias();

}
