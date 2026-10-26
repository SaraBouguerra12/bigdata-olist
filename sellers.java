// ORM class for table 'sellers'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 26 19:50:52 UTC 2026
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

public class sellers extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("seller_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sellers.this.seller_id = (String)value;
      }
    });
    setters.put("seller_zip_code_prefix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sellers.this.seller_zip_code_prefix = (String)value;
      }
    });
    setters.put("seller_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sellers.this.seller_city = (String)value;
      }
    });
    setters.put("seller_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sellers.this.seller_state = (String)value;
      }
    });
  }
  public sellers() {
    init0();
  }
  private String seller_id;
  public String get_seller_id() {
    return seller_id;
  }
  public void set_seller_id(String seller_id) {
    this.seller_id = seller_id;
  }
  public sellers with_seller_id(String seller_id) {
    this.seller_id = seller_id;
    return this;
  }
  private String seller_zip_code_prefix;
  public String get_seller_zip_code_prefix() {
    return seller_zip_code_prefix;
  }
  public void set_seller_zip_code_prefix(String seller_zip_code_prefix) {
    this.seller_zip_code_prefix = seller_zip_code_prefix;
  }
  public sellers with_seller_zip_code_prefix(String seller_zip_code_prefix) {
    this.seller_zip_code_prefix = seller_zip_code_prefix;
    return this;
  }
  private String seller_city;
  public String get_seller_city() {
    return seller_city;
  }
  public void set_seller_city(String seller_city) {
    this.seller_city = seller_city;
  }
  public sellers with_seller_city(String seller_city) {
    this.seller_city = seller_city;
    return this;
  }
  private String seller_state;
  public String get_seller_state() {
    return seller_state;
  }
  public void set_seller_state(String seller_state) {
    this.seller_state = seller_state;
  }
  public sellers with_seller_state(String seller_state) {
    this.seller_state = seller_state;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sellers)) {
      return false;
    }
    sellers that = (sellers) o;
    boolean equal = true;
    equal = equal && (this.seller_id == null ? that.seller_id == null : this.seller_id.equals(that.seller_id));
    equal = equal && (this.seller_zip_code_prefix == null ? that.seller_zip_code_prefix == null : this.seller_zip_code_prefix.equals(that.seller_zip_code_prefix));
    equal = equal && (this.seller_city == null ? that.seller_city == null : this.seller_city.equals(that.seller_city));
    equal = equal && (this.seller_state == null ? that.seller_state == null : this.seller_state.equals(that.seller_state));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sellers)) {
      return false;
    }
    sellers that = (sellers) o;
    boolean equal = true;
    equal = equal && (this.seller_id == null ? that.seller_id == null : this.seller_id.equals(that.seller_id));
    equal = equal && (this.seller_zip_code_prefix == null ? that.seller_zip_code_prefix == null : this.seller_zip_code_prefix.equals(that.seller_zip_code_prefix));
    equal = equal && (this.seller_city == null ? that.seller_city == null : this.seller_city.equals(that.seller_city));
    equal = equal && (this.seller_state == null ? that.seller_state == null : this.seller_state.equals(that.seller_state));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.seller_id = JdbcWritableBridge.readString(1, __dbResults);
    this.seller_zip_code_prefix = JdbcWritableBridge.readString(2, __dbResults);
    this.seller_city = JdbcWritableBridge.readString(3, __dbResults);
    this.seller_state = JdbcWritableBridge.readString(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.seller_id = JdbcWritableBridge.readString(1, __dbResults);
    this.seller_zip_code_prefix = JdbcWritableBridge.readString(2, __dbResults);
    this.seller_city = JdbcWritableBridge.readString(3, __dbResults);
    this.seller_state = JdbcWritableBridge.readString(4, __dbResults);
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
    JdbcWritableBridge.writeString(seller_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seller_zip_code_prefix, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seller_city, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seller_state, 4 + __off, 1, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(seller_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seller_zip_code_prefix, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seller_city, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seller_state, 4 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.seller_id = null;
    } else {
    this.seller_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seller_zip_code_prefix = null;
    } else {
    this.seller_zip_code_prefix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seller_city = null;
    } else {
    this.seller_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seller_state = null;
    } else {
    this.seller_state = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.seller_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_id);
    }
    if (null == this.seller_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_zip_code_prefix);
    }
    if (null == this.seller_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_city);
    }
    if (null == this.seller_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_state);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.seller_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_id);
    }
    if (null == this.seller_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_zip_code_prefix);
    }
    if (null == this.seller_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_city);
    }
    if (null == this.seller_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seller_state);
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
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_id==null?"\\N":seller_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_zip_code_prefix==null?"\\N":seller_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_city==null?"\\N":seller_city, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_state==null?"\\N":seller_state, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_id==null?"\\N":seller_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_zip_code_prefix==null?"\\N":seller_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_city==null?"\\N":seller_city, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(seller_state==null?"\\N":seller_state, delimiters));
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
    if (__cur_str.equals("null")) { this.seller_id = null; } else {
      this.seller_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.seller_zip_code_prefix = null; } else {
      this.seller_zip_code_prefix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.seller_city = null; } else {
      this.seller_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.seller_state = null; } else {
      this.seller_state = __cur_str;
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
    if (__cur_str.equals("null")) { this.seller_id = null; } else {
      this.seller_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.seller_zip_code_prefix = null; } else {
      this.seller_zip_code_prefix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.seller_city = null; } else {
      this.seller_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.seller_state = null; } else {
      this.seller_state = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    sellers o = (sellers) super.clone();
    return o;
  }

  public void clone0(sellers o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("seller_id", this.seller_id);
    __sqoop$field_map.put("seller_zip_code_prefix", this.seller_zip_code_prefix);
    __sqoop$field_map.put("seller_city", this.seller_city);
    __sqoop$field_map.put("seller_state", this.seller_state);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("seller_id", this.seller_id);
    __sqoop$field_map.put("seller_zip_code_prefix", this.seller_zip_code_prefix);
    __sqoop$field_map.put("seller_city", this.seller_city);
    __sqoop$field_map.put("seller_state", this.seller_state);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
