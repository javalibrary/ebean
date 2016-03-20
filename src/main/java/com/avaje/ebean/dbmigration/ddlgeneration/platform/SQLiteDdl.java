package com.avaje.ebean.dbmigration.ddlgeneration.platform;

import com.avaje.ebean.config.dbplatform.DbIdentity;
import com.avaje.ebean.config.dbplatform.DbTypeMap;
import com.avaje.ebean.dbmigration.ddlgeneration.DdlBuffer;

import java.io.IOException;

/**
 * DB2 platform specific DDL.
 */
public class SQLiteDdl extends PlatformDdl {

  public SQLiteDdl(DbTypeMap platformTypes, DbIdentity dbIdentity) {
    super(platformTypes, dbIdentity);
    this.identitySuffix = "";
    this.inlineForeignKeys = true;
  }

  @Override
  public void addTableComment(DdlBuffer apply, String tableName, String tableComment) throws IOException {
    // not supported
  }

  @Override
  public void addColumnComment(DdlBuffer apply, String table, String column, String comment) throws IOException {
    // not supported
  }

  @Override
  public String alterTableAddForeignKey(String tableName, String fkName, String[] columns, String refTable, String[] refColumns) {
    // not supported
    return null;
  }
}
