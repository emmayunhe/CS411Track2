package simpledb.parse;

import simpledb.query.Constant;
import java.util.*;

/**
 * Data for the SQL <i>insert</i> statement.
 * @author Edward Sciore
 */
public class Rename {
   private String tblname;
   private String tblnameNew;
   
   /**
    * Saves the table name and the field and value lists.
    */
   public Rename(String tblname, String tblnameNew) {
      this.tblname = tblname;
      this.tblnameNew = tblnameNew;
   }
   
   /**
    * Returns the name of the affected table.
    * @return the name of the affected table
    */
   public String tableName() {
      return tblname;
   }
   
   /**
    * Returns the new name of the affected table.
    * @return the new name of the affected table.
    */
   public String tblnameNew() {
      return tblnameNew;
   }
}

