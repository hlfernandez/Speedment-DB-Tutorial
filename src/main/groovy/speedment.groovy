import com.speedment.config.parameters.*

name = "hellospeedment";
packageLocation = "src/main/java";
packageName = "es.uvigo.ei.sing.hlfernandez";
enabled = true;
expanded = true;
dbms {
    ipAddress = "127.0.0.1";
    name = "db0";
    port = 3306;
    typeName = "MySQL";
    username = "mysqluser";
    enabled = true;
    expanded = true;
    schema {
        columnCompressionType = ColumnCompressionType.NONE;
        fieldStorageType = FieldStorageType.WRAPPER;
        name = "hellospeedment";
        schemaName = "hellospeedment";
        storageEngineType = StorageEngineType.ON_HEAP;
        defaultSchema = false;
        enabled = true;
        expanded = true;
        table {
            columnCompressionType = ColumnCompressionType.INHERIT;
            fieldStorageType = FieldStorageType.INHERIT;
            name = "user";
            storageEngineType = StorageEngineType.INHERIT;
            tableName = "user";
            enabled = true;
            expanded = false;
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                databaseType = java.lang.Long.class;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "id";
                typeMapper = com.speedment.internal.core.config.mapper.identity.LongIdentityMapper.class;
                autoincrement = true;
                enabled = true;
                expanded = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                databaseType = java.lang.String.class;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "name";
                typeMapper = com.speedment.internal.core.config.mapper.identity.StringIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                expanded = true;
                nullable = false;
            }
            column {
                columnCompressionType = ColumnCompressionType.INHERIT;
                databaseType = java.lang.Integer.class;
                fieldStorageType = FieldStorageType.INHERIT;
                name = "age";
                typeMapper = com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper.class;
                autoincrement = false;
                enabled = true;
                expanded = true;
                nullable = false;
            }
            primaryKeyColumn {
                name = "id";
                enabled = true;
                expanded = true;
            }
            index {
                name = "PRIMARY";
                enabled = true;
                expanded = true;
                unique = true;
                indexColumn {
                    name = "id";
                    orderType = OrderType.ASC;
                    enabled = true;
                    expanded = true;
                }
            }
            index {
                name = "name";
                enabled = true;
                expanded = true;
                unique = true;
                indexColumn {
                    name = "name";
                    orderType = OrderType.ASC;
                    enabled = true;
                    expanded = true;
                }
            }
        }
    }
}