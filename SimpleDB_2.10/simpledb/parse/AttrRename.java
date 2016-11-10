package simpledb.parse;

import simpledb.query.Constant;
import java.util.*;

/**
 * Data for the SQL <i>insert</i> statement.
 * @author Edward Sciore
 */
public class AttrRename {
   private String tblname;
   private String attrPrev;
   private String attrNew;
   
   /**
    * Saves the table name and the field and value lists.
    */
   public AttrRename(String tblname, String attrPrev, String attrNew) {
      this.tblname = tblname;
      this.attrPrev = attrPrev;
      this.attrNew = attrNew;
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
   public String attrPrev() {
      return attrPrev;
   }

   public String attrNew() {
      return attrNew; 
   }
}

