// ORM class for table 'customers'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 26 19:50:07 UTC 2026
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class customers extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("customer_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customers.this.customer_id = (String)value;
      }
    });
    setters.put("customer_unique_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customers.this.customer_unique_id = (String)value;
      }
    });
    setters.put("customer_zip_code_prefix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customers.this.customer_zip_code_prefix = (String)value;
      }
    });
    setters.put("customer_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customers.this.customer_city = (String)value;
      }
    });
    setters.put("customer_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customers.this.customer_state = (String)value;
      }
    });
  }
  public customers() {
    init0();
  }
  private String customer_id;
  public String get_customer_id() {
    return customer_id;
  }
  public void set_customer_id(String customer_id) {
    this.customer_id = customer_id;
  }
  public customers with_customer_id(String customer_id) {
    this.customer_id = customer_id;
    return this;
  }
  private String customer_unique_id;
  public String get_customer_unique_id() {
    return customer_unique_id;
  }
  public void set_customer_unique_id(String customer_unique_id) {
    this.customer_unique_id = customer_unique_id;
  }
  public customers with_customer_unique_id(String customer_unique_id) {
    this.customer_unique_id = customer_unique_id;
    return this;
  }
  private String customer_zip_code_prefix;
  public String get_customer_zip_code_prefix() {
    return customer_zip_code_prefix;
  }
  public void set_customer_zip_code_prefix(String customer_zip_code_prefix) {
    this.customer_zip_code_prefix = customer_zip_code_prefix;
  }
  public customers with_customer_zip_code_prefix(String customer_zip_code_prefix) {
    this.customer_zip_code_prefix = customer_zip_code_prefix;
    return this;
  }
  private String customer_city;
  public String get_customer_city() {
    return customer_city;
  }
  public void set_customer_city(String customer_city) {
    this.customer_city = customer_city;
  }
  public customers with_customer_city(String customer_city) {
    this.customer_city = customer_city;
    return this;
  }
  private String customer_state;
  public String get_customer_state() {
    return customer_state;
  }
  public void set_customer_state(String customer_state) {
    this.customer_state = customer_state;
  }
  public customers with_customer_state(String customer_state) {
    this.customer_state = customer_state;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customers)) {
      return false;
    }
    customers that = (customers) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.customer_unique_id == null ? that.customer_unique_id == null : this.customer_unique_id.equals(that.customer_unique_id));
    equal = equal && (this.customer_zip_code_prefix == null ? that.customer_zip_code_prefix == null : this.customer_zip_code_prefix.equals(that.customer_zip_code_prefix));
    equal = equal && (this.customer_city == null ? that.customer_city == null : this.customer_city.equals(that.customer_city));
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customers)) {
      return false;
    }
    customers that = (customers) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.customer_unique_id == null ? that.customer_unique_id == null : this.customer_unique_id.equals(that.customer_unique_id));
    equal = equal && (this.customer_zip_code_prefix == null ? that.customer_zip_code_prefix == null : this.customer_zip_code_prefix.equals(that.customer_zip_code_prefix));
    equal = equal && (this.customer_city == null ? that.customer_city == null : this.customer_city.equals(that.customer_city));
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.customer_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_unique_id = JdbcWritableBridge.readString(2, __dbResults);
    this.customer_zip_code_prefix = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_city = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_state = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.customer_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_unique_id = JdbcWritableBridge.readString(2, __dbResults);
    this.customer_zip_code_prefix = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_city = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_state = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(customer_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_unique_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_zip_code_prefix, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_state, 5 + __off, 1, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(customer_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_unique_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_zip_code_prefix, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_state, 5 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.customer_id = null;
    } else {
    this.customer_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_unique_id = null;
    } else {
    this.customer_unique_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_zip_code_prefix = null;
    } else {
    this.customer_zip_code_prefix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_city = null;
    } else {
    this.customer_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_state = null;
    } else {
    this.customer_state = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.customer_unique_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_unique_id);
    }
    if (null == this.customer_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_zip_code_prefix);
    }
    if (null == this.customer_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_city);
    }
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.customer_unique_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_unique_id);
    }
    if (null == this.customer_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_zip_code_prefix);
    }
    if (null == this.customer_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_city);
    }
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_id==null?"\\N":customer_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_unique_id==null?"\\N":customer_unique_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_zip_code_prefix==null?"\\N":customer_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_city==null?"\\N":customer_city, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_state==null?"\\N":customer_state, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_id==null?"\\N":customer_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_unique_id==null?"\\N":customer_unique_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_zip_code_prefix==null?"\\N":customer_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_city==null?"\\N":customer_city, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_state==null?"\\N":customer_state, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_unique_id = null; } else {
      this.customer_unique_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_zip_code_prefix = null; } else {
      this.customer_zip_code_prefix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_city = null; } else {
      this.customer_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_unique_id = null; } else {
      this.customer_unique_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_zip_code_prefix = null; } else {
      this.customer_zip_code_prefix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_city = null; } else {
      this.customer_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    customers o = (customers) super.clone();
    return o;
  }

  public void clone0(customers o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("customer_unique_id", this.customer_unique_id);
    __sqoop$field_map.put("customer_zip_code_prefix", this.customer_zip_code_prefix);
    __sqoop$field_map.put("customer_city", this.customer_city);
    __sqoop$field_map.put("customer_state", this.customer_state);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("customer_unique_id", this.customer_unique_id);
    __sqoop$field_map.put("customer_zip_code_prefix", this.customer_zip_code_prefix);
    __sqoop$field_map.put("customer_city", this.customer_city);
    __sqoop$field_map.put("customer_state", this.customer_state);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
