databaseChangeLog = {

	changeSet(author: "rego (generated)", id: "1362961820612-1") {
		createTable(tableName: "category") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "categoryPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name_key", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "parent_category_id", type: "bigint")
		}
	}

	changeSet(author: "rego (generated)", id: "1362961820612-2") {
		createTable(tableName: "customer") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "customerPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "vat_number", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "rego (generated)", id: "1362961820612-3") {
		createTable(tableName: "machine") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "machinePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "customer_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "longvarchar") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "year_manufatured", type: "integer") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "rego (generated)", id: "1362961820612-4") {
		createTable(tableName: "machine_category") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "machine_categPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "category_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "machine_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "rego (generated)", id: "1362961820612-5") {
		addForeignKeyConstraint(baseColumnNames: "parent_category_id", baseTableName: "category", constraintName: "FK302BCFE8CD574B8", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "category", referencesUniqueColumn: "false")
	}

	changeSet(author: "rego (generated)", id: "1362961820612-6") {
		addForeignKeyConstraint(baseColumnNames: "customer_id", baseTableName: "machine", constraintName: "FK31314447765E50CD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "customer", referencesUniqueColumn: "false")
	}

	changeSet(author: "rego (generated)", id: "1362961820612-7") {
		addForeignKeyConstraint(baseColumnNames: "category_id", baseTableName: "machine_category", constraintName: "FKE0C189F61A87BCCD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "category", referencesUniqueColumn: "false")
	}

	changeSet(author: "rego (generated)", id: "1362961820612-8") {
		addForeignKeyConstraint(baseColumnNames: "machine_id", baseTableName: "machine_category", constraintName: "FKE0C189F64F9B9E27", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "machine", referencesUniqueColumn: "false")
	}
}
