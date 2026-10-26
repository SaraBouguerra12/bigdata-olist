// ORM class for table 'geolocation'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 26 19:50:19 UTC 2026
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

public class geolocation extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("geolocation_zip_code_prefix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation.this.geolocation_zip_code_prefix = (String)value;
      }
    });
    setters.put("geolocation_lat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation.this.geolocation_lat = (Double)value;
      }
    });
    setters.put("geolocation_lng", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation.this.geolocation_lng = (Double)value;
      }
    });
    setters.put("geolocation_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation.this.geolocation_city = (String)value;
      }
    });
    setters.put("geolocation_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        geolocation.this.geolocation_state = (String)value;
      }
    });
  }
  public geolocation() {
    init0();
  }
  private String geolocation_zip_code_prefix;
  public String get_geolocation_zip_code_prefix() {
    return geolocation_zip_code_prefix;
  }
  public void set_geolocation_zip_code_prefix(String geolocation_zip_code_prefix) {
    this.geolocation_zip_code_prefix = geolocation_zip_code_prefix;
  }
  public geolocation with_geolocation_zip_code_prefix(String geolocation_zip_code_prefix) {
    this.geolocation_zip_code_prefix = geolocation_zip_code_prefix;
    return this;
  }
  private Double geolocation_lat;
  public Double get_geolocation_lat() {
    return geolocation_lat;
  }
  public void set_geolocation_lat(Double geolocation_lat) {
    this.geolocation_lat = geolocation_lat;
  }
  public geolocation with_geolocation_lat(Double geolocation_lat) {
    this.geolocation_lat = geolocation_lat;
    return this;
  }
  private Double geolocation_lng;
  public Double get_geolocation_lng() {
    return geolocation_lng;
  }
  public void set_geolocation_lng(Double geolocation_lng) {
    this.geolocation_lng = geolocation_lng;
  }
  public geolocation with_geolocation_lng(Double geolocation_lng) {
    this.geolocation_lng = geolocation_lng;
    return this;
  }
  private String geolocation_city;
  public String get_geolocation_city() {
    return geolocation_city;
  }
  public void set_geolocation_city(String geolocation_city) {
    this.geolocation_city = geolocation_city;
  }
  public geolocation with_geolocation_city(String geolocation_city) {
    this.geolocation_city = geolocation_city;
    return this;
  }
  private String geolocation_state;
  public String get_geolocation_state() {
    return geolocation_state;
  }
  public void set_geolocation_state(String geolocation_state) {
    this.geolocation_state = geolocation_state;
  }
  public geolocation with_geolocation_state(String geolocation_state) {
    this.geolocation_state = geolocation_state;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof geolocation)) {
      return false;
    }
    geolocation that = (geolocation) o;
    boolean equal = true;
    equal = equal && (this.geolocation_zip_code_prefix == null ? that.geolocation_zip_code_prefix == null : this.geolocation_zip_code_prefix.equals(that.geolocation_zip_code_prefix));
    equal = equal && (this.geolocation_lat == null ? that.geolocation_lat == null : this.geolocation_lat.equals(that.geolocation_lat));
    equal = equal && (this.geolocation_lng == null ? that.geolocation_lng == null : this.geolocation_lng.equals(that.geolocation_lng));
    equal = equal && (this.geolocation_city == null ? that.geolocation_city == null : this.geolocation_city.equals(that.geolocation_city));
    equal = equal && (this.geolocation_state == null ? that.geolocation_state == null : this.geolocation_state.equals(that.geolocation_state));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof geolocation)) {
      return false;
    }
    geolocation that = (geolocation) o;
    boolean equal = true;
    equal = equal && (this.geolocation_zip_code_prefix == null ? that.geolocation_zip_code_prefix == null : this.geolocation_zip_code_prefix.equals(that.geolocation_zip_code_prefix));
    equal = equal && (this.geolocation_lat == null ? that.geolocation_lat == null : this.geolocation_lat.equals(that.geolocation_lat));
    equal = equal && (this.geolocation_lng == null ? that.geolocation_lng == null : this.geolocation_lng.equals(that.geolocation_lng));
    equal = equal && (this.geolocation_city == null ? that.geolocation_city == null : this.geolocation_city.equals(that.geolocation_city));
    equal = equal && (this.geolocation_state == null ? that.geolocation_state == null : this.geolocation_state.equals(that.geolocation_state));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.geolocation_zip_code_prefix = JdbcWritableBridge.readString(1, __dbResults);
    this.geolocation_lat = JdbcWritableBridge.readDouble(2, __dbResults);
    this.geolocation_lng = JdbcWritableBridge.readDouble(3, __dbResults);
    this.geolocation_city = JdbcWritableBridge.readString(4, __dbResults);
    this.geolocation_state = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.geolocation_zip_code_prefix = JdbcWritableBridge.readString(1, __dbResults);
    this.geolocation_lat = JdbcWritableBridge.readDouble(2, __dbResults);
    this.geolocation_lng = JdbcWritableBridge.readDouble(3, __dbResults);
    this.geolocation_city = JdbcWritableBridge.readString(4, __dbResults);
    this.geolocation_state = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeString(geolocation_zip_code_prefix, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(geolocation_lat, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(geolocation_lng, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_state, 5 + __off, 1, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(geolocation_zip_code_prefix, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(geolocation_lat, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(geolocation_lng, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(geolocation_state, 5 + __off, 1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.geolocation_zip_code_prefix = null;
    } else {
    this.geolocation_zip_code_prefix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_lat = null;
    } else {
    this.geolocation_lat = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_lng = null;
    } else {
    this.geolocation_lng = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_city = null;
    } else {
    this.geolocation_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geolocation_state = null;
    } else {
    this.geolocation_state = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.geolocation_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_zip_code_prefix);
    }
    if (null == this.geolocation_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geolocation_lat);
    }
    if (null == this.geolocation_lng) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geolocation_lng);
    }
    if (null == this.geolocation_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_city);
    }
    if (null == this.geolocation_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_state);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.geolocation_zip_code_prefix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_zip_code_prefix);
    }
    if (null == this.geolocation_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geolocation_lat);
    }
    if (null == this.geolocation_lng) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geolocation_lng);
    }
    if (null == this.geolocation_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_city);
    }
    if (null == this.geolocation_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, geolocation_state);
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
    __sb.append(FieldFormatter.hiveStringDropDelims(geolocation_zip_code_prefix==null?"\\N":geolocation_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lat==null?"\\N":"" + geolocation_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lng==null?"\\N":"" + geolocation_lng, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(geolocation_city==null?"\\N":geolocation_city, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(geolocation_state==null?"\\N":geolocation_state, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(geolocation_zip_code_prefix==null?"\\N":geolocation_zip_code_prefix, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lat==null?"\\N":"" + geolocation_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geolocation_lng==null?"\\N":"" + geolocation_lng, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(geolocation_city==null?"\\N":geolocation_city, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(geolocation_state==null?"\\N":geolocation_state, delimiters));
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
    if (__cur_str.equals("null")) { this.geolocation_zip_code_prefix = null; } else {
      this.geolocation_zip_code_prefix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geolocation_lat = null; } else {
      this.geolocation_lat = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geolocation_lng = null; } else {
      this.geolocation_lng = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.geolocation_city = null; } else {
      this.geolocation_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.geolocation_state = null; } else {
      this.geolocation_state = __cur_str;
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
    if (__cur_str.equals("null")) { this.geolocation_zip_code_prefix = null; } else {
      this.geolocation_zip_code_prefix = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geolocation_lat = null; } else {
      this.geolocation_lat = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geolocation_lng = null; } else {
      this.geolocation_lng = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.geolocation_city = null; } else {
      this.geolocation_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.geolocation_state = null; } else {
      this.geolocation_state = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    geolocation o = (geolocation) super.clone();
    return o;
  }

  public void clone0(geolocation o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("geolocation_zip_code_prefix", this.geolocation_zip_code_prefix);
    __sqoop$field_map.put("geolocation_lat", this.geolocation_lat);
    __sqoop$field_map.put("geolocation_lng", this.geolocation_lng);
    __sqoop$field_map.put("geolocation_city", this.geolocation_city);
    __sqoop$field_map.put("geolocation_state", this.geolocation_state);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("geolocation_zip_code_prefix", this.geolocation_zip_code_prefix);
    __sqoop$field_map.put("geolocation_lat", this.geolocation_lat);
    __sqoop$field_map.put("geolocation_lng", this.geolocation_lng);
    __sqoop$field_map.put("geolocation_city", this.geolocation_city);
    __sqoop$field_map.put("geolocation_state", this.geolocation_state);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
