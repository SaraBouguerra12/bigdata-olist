// ORM class for table 'order_payments'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 26 19:50:33 UTC 2026
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

public class order_payments extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("order_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_payments.this.order_id = (String)value;
      }
    });
    setters.put("payment_sequential", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_payments.this.payment_sequential = (Integer)value;
      }
    });
    setters.put("payment_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_payments.this.payment_type = (String)value;
      }
    });
    setters.put("payment_installments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_payments.this.payment_installments = (Integer)value;
      }
    });
    setters.put("payment_value", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_payments.this.payment_value = (java.math.BigDecimal)value;
      }
    });
  }
  public order_payments() {
    init0();
  }
  private String order_id;
  public String get_order_id() {
    return order_id;
  }
  public void set_order_id(String order_id) {
    this.order_id = order_id;
  }
  public order_payments with_order_id(String order_id) {
    this.order_id = order_id;
    return this;
  }
  private Integer payment_sequential;
  public Integer get_payment_sequential() {
    return payment_sequential;
  }
  public void set_payment_sequential(Integer payment_sequential) {
    this.payment_sequential = payment_sequential;
  }
  public order_payments with_payment_sequential(Integer payment_sequential) {
    this.payment_sequential = payment_sequential;
    return this;
  }
  private String payment_type;
  public String get_payment_type() {
    return payment_type;
  }
  public void set_payment_type(String payment_type) {
    this.payment_type = payment_type;
  }
  public order_payments with_payment_type(String payment_type) {
    this.payment_type = payment_type;
    return this;
  }
  private Integer payment_installments;
  public Integer get_payment_installments() {
    return payment_installments;
  }
  public void set_payment_installments(Integer payment_installments) {
    this.payment_installments = payment_installments;
  }
  public order_payments with_payment_installments(Integer payment_installments) {
    this.payment_installments = payment_installments;
    return this;
  }
  private java.math.BigDecimal payment_value;
  public java.math.BigDecimal get_payment_value() {
    return payment_value;
  }
  public void set_payment_value(java.math.BigDecimal payment_value) {
    this.payment_value = payment_value;
  }
  public order_payments with_payment_value(java.math.BigDecimal payment_value) {
    this.payment_value = payment_value;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_payments)) {
      return false;
    }
    order_payments that = (order_payments) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.payment_sequential == null ? that.payment_sequential == null : this.payment_sequential.equals(that.payment_sequential));
    equal = equal && (this.payment_type == null ? that.payment_type == null : this.payment_type.equals(that.payment_type));
    equal = equal && (this.payment_installments == null ? that.payment_installments == null : this.payment_installments.equals(that.payment_installments));
    equal = equal && (this.payment_value == null ? that.payment_value == null : this.payment_value.equals(that.payment_value));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_payments)) {
      return false;
    }
    order_payments that = (order_payments) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.payment_sequential == null ? that.payment_sequential == null : this.payment_sequential.equals(that.payment_sequential));
    equal = equal && (this.payment_type == null ? that.payment_type == null : this.payment_type.equals(that.payment_type));
    equal = equal && (this.payment_installments == null ? that.payment_installments == null : this.payment_installments.equals(that.payment_installments));
    equal = equal && (this.payment_value == null ? that.payment_value == null : this.payment_value.equals(that.payment_value));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.order_id = JdbcWritableBridge.readString(1, __dbResults);
    this.payment_sequential = JdbcWritableBridge.readInteger(2, __dbResults);
    this.payment_type = JdbcWritableBridge.readString(3, __dbResults);
    this.payment_installments = JdbcWritableBridge.readInteger(4, __dbResults);
    this.payment_value = JdbcWritableBridge.readBigDecimal(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.order_id = JdbcWritableBridge.readString(1, __dbResults);
    this.payment_sequential = JdbcWritableBridge.readInteger(2, __dbResults);
    this.payment_type = JdbcWritableBridge.readString(3, __dbResults);
    this.payment_installments = JdbcWritableBridge.readInteger(4, __dbResults);
    this.payment_value = JdbcWritableBridge.readBigDecimal(5, __dbResults);
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
    JdbcWritableBridge.writeString(order_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(payment_sequential, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(payment_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(payment_installments, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(payment_value, 5 + __off, 3, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(order_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(payment_sequential, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(payment_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(payment_installments, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(payment_value, 5 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.order_id = null;
    } else {
    this.order_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.payment_sequential = null;
    } else {
    this.payment_sequential = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.payment_type = null;
    } else {
    this.payment_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.payment_installments = null;
    } else {
    this.payment_installments = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.payment_value = null;
    } else {
    this.payment_value = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.payment_sequential) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.payment_sequential);
    }
    if (null == this.payment_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_type);
    }
    if (null == this.payment_installments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.payment_installments);
    }
    if (null == this.payment_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.payment_value, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.payment_sequential) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.payment_sequential);
    }
    if (null == this.payment_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, payment_type);
    }
    if (null == this.payment_installments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.payment_installments);
    }
    if (null == this.payment_value) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.payment_value, __dataOut);
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
    __sb.append(FieldFormatter.hiveStringDropDelims(order_id==null?"\\N":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_sequential==null?"\\N":"" + payment_sequential, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(payment_type==null?"\\N":payment_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_installments==null?"\\N":"" + payment_installments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_value==null?"\\N":payment_value.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(order_id==null?"\\N":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_sequential==null?"\\N":"" + payment_sequential, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(payment_type==null?"\\N":payment_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_installments==null?"\\N":"" + payment_installments, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_value==null?"\\N":payment_value.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.order_id = null; } else {
      this.order_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_sequential = null; } else {
      this.payment_sequential = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.payment_type = null; } else {
      this.payment_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_installments = null; } else {
      this.payment_installments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_value = null; } else {
      this.payment_value = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null")) { this.order_id = null; } else {
      this.order_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_sequential = null; } else {
      this.payment_sequential = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.payment_type = null; } else {
      this.payment_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_installments = null; } else {
      this.payment_installments = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.payment_value = null; } else {
      this.payment_value = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    order_payments o = (order_payments) super.clone();
    return o;
  }

  public void clone0(order_payments o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("payment_sequential", this.payment_sequential);
    __sqoop$field_map.put("payment_type", this.payment_type);
    __sqoop$field_map.put("payment_installments", this.payment_installments);
    __sqoop$field_map.put("payment_value", this.payment_value);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("payment_sequential", this.payment_sequential);
    __sqoop$field_map.put("payment_type", this.payment_type);
    __sqoop$field_map.put("payment_installments", this.payment_installments);
    __sqoop$field_map.put("payment_value", this.payment_value);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
