package simpledb.parse;

import simpledb.query.Constant;
import java.util.*;

/**
 * Data for the SQL <i>insert</i> statement.
 * @author Edward Sciore
 */
public class Rename {
   private boolean tableOrColn; // true = table; false = coln;
   private String tblname;
   private String prevString;
   private String newString;
   
   /**
    * Saves the table name and the field and value lists.
    */
   public Rename(boolean tableOrColn, String tblname, String prevString, String newString) {
      this.tableOrColn = tableOrColn;
      this.tblname = tblname;
      this.prevString = prevString;
      this.newString = newString;
   }
   
   public boolean tableOrColn(){
      return tableOrColn;
   }
   /**
    * Returns the name of the affected table.
    * @return the name of the affected table
    */
   public String tblname() {
      return tblname;
   }
   
   /**
    * Returns the new name of the affected table.
    * @return the new name of the affected table.
    */
   public String prevString() {
      return prevString;
   }

   public String newString(){
      return newString;
   }
}

