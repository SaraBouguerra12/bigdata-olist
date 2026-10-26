// ORM class for table 'orders'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 26 19:50:41 UTC 2026
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

public class orders extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("order_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.order_id = (String)value;
      }
    });
    setters.put("customer_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.customer_id = (String)value;
      }
    });
    setters.put("order_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.order_status = (String)value;
      }
    });
    setters.put("order_purchase_timestamp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.order_purchase_timestamp = (java.sql.Timestamp)value;
      }
    });
    setters.put("order_approved_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.order_approved_at = (java.sql.Timestamp)value;
      }
    });
    setters.put("order_delivered_carrier_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.order_delivered_carrier_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("order_delivered_customer_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.order_delivered_customer_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("order_estimated_delivery_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orders.this.order_estimated_delivery_date = (java.sql.Timestamp)value;
      }
    });
  }
  public orders() {
    init0();
  }
  private String order_id;
  public String get_order_id() {
    return order_id;
  }
  public void set_order_id(String order_id) {
    this.order_id = order_id;
  }
  public orders with_order_id(String order_id) {
    this.order_id = order_id;
    return this;
  }
  private String customer_id;
  public String get_customer_id() {
    return customer_id;
  }
  public void set_customer_id(String customer_id) {
    this.customer_id = customer_id;
  }
  public orders with_customer_id(String customer_id) {
    this.customer_id = customer_id;
    return this;
  }
  private String order_status;
  public String get_order_status() {
    return order_status;
  }
  public void set_order_status(String order_status) {
    this.order_status = order_status;
  }
  public orders with_order_status(String order_status) {
    this.order_status = order_status;
    return this;
  }
  private java.sql.Timestamp order_purchase_timestamp;
  public java.sql.Timestamp get_order_purchase_timestamp() {
    return order_purchase_timestamp;
  }
  public void set_order_purchase_timestamp(java.sql.Timestamp order_purchase_timestamp) {
    this.order_purchase_timestamp = order_purchase_timestamp;
  }
  public orders with_order_purchase_timestamp(java.sql.Timestamp order_purchase_timestamp) {
    this.order_purchase_timestamp = order_purchase_timestamp;
    return this;
  }
  private java.sql.Timestamp order_approved_at;
  public java.sql.Timestamp get_order_approved_at() {
    return order_approved_at;
  }
  public void set_order_approved_at(java.sql.Timestamp order_approved_at) {
    this.order_approved_at = order_approved_at;
  }
  public orders with_order_approved_at(java.sql.Timestamp order_approved_at) {
    this.order_approved_at = order_approved_at;
    return this;
  }
  private java.sql.Timestamp order_delivered_carrier_date;
  public java.sql.Timestamp get_order_delivered_carrier_date() {
    return order_delivered_carrier_date;
  }
  public void set_order_delivered_carrier_date(java.sql.Timestamp order_delivered_carrier_date) {
    this.order_delivered_carrier_date = order_delivered_carrier_date;
  }
  public orders with_order_delivered_carrier_date(java.sql.Timestamp order_delivered_carrier_date) {
    this.order_delivered_carrier_date = order_delivered_carrier_date;
    return this;
  }
  private java.sql.Timestamp order_delivered_customer_date;
  public java.sql.Timestamp get_order_delivered_customer_date() {
    return order_delivered_customer_date;
  }
  public void set_order_delivered_customer_date(java.sql.Timestamp order_delivered_customer_date) {
    this.order_delivered_customer_date = order_delivered_customer_date;
  }
  public orders with_order_delivered_customer_date(java.sql.Timestamp order_delivered_customer_date) {
    this.order_delivered_customer_date = order_delivered_customer_date;
    return this;
  }
  private java.sql.Timestamp order_estimated_delivery_date;
  public java.sql.Timestamp get_order_estimated_delivery_date() {
    return order_estimated_delivery_date;
  }
  public void set_order_estimated_delivery_date(java.sql.Timestamp order_estimated_delivery_date) {
    this.order_estimated_delivery_date = order_estimated_delivery_date;
  }
  public orders with_order_estimated_delivery_date(java.sql.Timestamp order_estimated_delivery_date) {
    this.order_estimated_delivery_date = order_estimated_delivery_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orders)) {
      return false;
    }
    orders that = (orders) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.order_status == null ? that.order_status == null : this.order_status.equals(that.order_status));
    equal = equal && (this.order_purchase_timestamp == null ? that.order_purchase_timestamp == null : this.order_purchase_timestamp.equals(that.order_purchase_timestamp));
    equal = equal && (this.order_approved_at == null ? that.order_approved_at == null : this.order_approved_at.equals(that.order_approved_at));
    equal = equal && (this.order_delivered_carrier_date == null ? that.order_delivered_carrier_date == null : this.order_delivered_carrier_date.equals(that.order_delivered_carrier_date));
    equal = equal && (this.order_delivered_customer_date == null ? that.order_delivered_customer_date == null : this.order_delivered_customer_date.equals(that.order_delivered_customer_date));
    equal = equal && (this.order_estimated_delivery_date == null ? that.order_estimated_delivery_date == null : this.order_estimated_delivery_date.equals(that.order_estimated_delivery_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof orders)) {
      return false;
    }
    orders that = (orders) o;
    boolean equal = true;
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.order_status == null ? that.order_status == null : this.order_status.equals(that.order_status));
    equal = equal && (this.order_purchase_timestamp == null ? that.order_purchase_timestamp == null : this.order_purchase_timestamp.equals(that.order_purchase_timestamp));
    equal = equal && (this.order_approved_at == null ? that.order_approved_at == null : this.order_approved_at.equals(that.order_approved_at));
    equal = equal && (this.order_delivered_carrier_date == null ? that.order_delivered_carrier_date == null : this.order_delivered_carrier_date.equals(that.order_delivered_carrier_date));
    equal = equal && (this.order_delivered_customer_date == null ? that.order_delivered_customer_date == null : this.order_delivered_customer_date.equals(that.order_delivered_customer_date));
    equal = equal && (this.order_estimated_delivery_date == null ? that.order_estimated_delivery_date == null : this.order_estimated_delivery_date.equals(that.order_estimated_delivery_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.order_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_id = JdbcWritableBridge.readString(2, __dbResults);
    this.order_status = JdbcWritableBridge.readString(3, __dbResults);
    this.order_purchase_timestamp = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.order_approved_at = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.order_delivered_carrier_date = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.order_delivered_customer_date = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.order_estimated_delivery_date = JdbcWritableBridge.readTimestamp(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.order_id = JdbcWritableBridge.readString(1, __dbResults);
    this.customer_id = JdbcWritableBridge.readString(2, __dbResults);
    this.order_status = JdbcWritableBridge.readString(3, __dbResults);
    this.order_purchase_timestamp = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.order_approved_at = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.order_delivered_carrier_date = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.order_delivered_customer_date = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.order_estimated_delivery_date = JdbcWritableBridge.readTimestamp(8, __dbResults);
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
    JdbcWritableBridge.writeString(customer_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_status, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_purchase_timestamp, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_approved_at, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_delivered_carrier_date, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_delivered_customer_date, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_estimated_delivery_date, 8 + __off, 93, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(order_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_status, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_purchase_timestamp, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_approved_at, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_delivered_carrier_date, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_delivered_customer_date, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(order_estimated_delivery_date, 8 + __off, 93, __dbStmt);
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
        this.customer_id = null;
    } else {
    this.customer_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_status = null;
    } else {
    this.order_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_purchase_timestamp = null;
    } else {
    this.order_purchase_timestamp = new Timestamp(__dataIn.readLong());
    this.order_purchase_timestamp.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_approved_at = null;
    } else {
    this.order_approved_at = new Timestamp(__dataIn.readLong());
    this.order_approved_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_delivered_carrier_date = null;
    } else {
    this.order_delivered_carrier_date = new Timestamp(__dataIn.readLong());
    this.order_delivered_carrier_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_delivered_customer_date = null;
    } else {
    this.order_delivered_customer_date = new Timestamp(__dataIn.readLong());
    this.order_delivered_customer_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_estimated_delivery_date = null;
    } else {
    this.order_estimated_delivery_date = new Timestamp(__dataIn.readLong());
    this.order_estimated_delivery_date.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.order_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_status);
    }
    if (null == this.order_purchase_timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_purchase_timestamp.getTime());
    __dataOut.writeInt(this.order_purchase_timestamp.getNanos());
    }
    if (null == this.order_approved_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_approved_at.getTime());
    __dataOut.writeInt(this.order_approved_at.getNanos());
    }
    if (null == this.order_delivered_carrier_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_delivered_carrier_date.getTime());
    __dataOut.writeInt(this.order_delivered_carrier_date.getNanos());
    }
    if (null == this.order_delivered_customer_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_delivered_customer_date.getTime());
    __dataOut.writeInt(this.order_delivered_customer_date.getNanos());
    }
    if (null == this.order_estimated_delivery_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_estimated_delivery_date.getTime());
    __dataOut.writeInt(this.order_estimated_delivery_date.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_id);
    }
    if (null == this.order_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_status);
    }
    if (null == this.order_purchase_timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_purchase_timestamp.getTime());
    __dataOut.writeInt(this.order_purchase_timestamp.getNanos());
    }
    if (null == this.order_approved_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_approved_at.getTime());
    __dataOut.writeInt(this.order_approved_at.getNanos());
    }
    if (null == this.order_delivered_carrier_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_delivered_carrier_date.getTime());
    __dataOut.writeInt(this.order_delivered_carrier_date.getNanos());
    }
    if (null == this.order_delivered_customer_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_delivered_customer_date.getTime());
    __dataOut.writeInt(this.order_delivered_customer_date.getNanos());
    }
    if (null == this.order_estimated_delivery_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_estimated_delivery_date.getTime());
    __dataOut.writeInt(this.order_estimated_delivery_date.getNanos());
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
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_id==null?"\\N":customer_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(order_status==null?"\\N":order_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_purchase_timestamp==null?"\\N":"" + order_purchase_timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_approved_at==null?"\\N":"" + order_approved_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_delivered_carrier_date==null?"\\N":"" + order_delivered_carrier_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_delivered_customer_date==null?"\\N":"" + order_delivered_customer_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_estimated_delivery_date==null?"\\N":"" + order_estimated_delivery_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(order_id==null?"\\N":order_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(customer_id==null?"\\N":customer_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(order_status==null?"\\N":order_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_purchase_timestamp==null?"\\N":"" + order_purchase_timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_approved_at==null?"\\N":"" + order_approved_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_delivered_carrier_date==null?"\\N":"" + order_delivered_carrier_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_delivered_customer_date==null?"\\N":"" + order_delivered_customer_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_estimated_delivery_date==null?"\\N":"" + order_estimated_delivery_date, delimiters));
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
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.order_status = null; } else {
      this.order_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_purchase_timestamp = null; } else {
      this.order_purchase_timestamp = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_approved_at = null; } else {
      this.order_approved_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_delivered_carrier_date = null; } else {
      this.order_delivered_carrier_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_delivered_customer_date = null; } else {
      this.order_delivered_customer_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_estimated_delivery_date = null; } else {
      this.order_estimated_delivery_date = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.customer_id = null; } else {
      this.customer_id = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.order_status = null; } else {
      this.order_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_purchase_timestamp = null; } else {
      this.order_purchase_timestamp = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_approved_at = null; } else {
      this.order_approved_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_delivered_carrier_date = null; } else {
      this.order_delivered_carrier_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_delivered_customer_date = null; } else {
      this.order_delivered_customer_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_estimated_delivery_date = null; } else {
      this.order_estimated_delivery_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    orders o = (orders) super.clone();
    o.order_purchase_timestamp = (o.order_purchase_timestamp != null) ? (java.sql.Timestamp) o.order_purchase_timestamp.clone() : null;
    o.order_approved_at = (o.order_approved_at != null) ? (java.sql.Timestamp) o.order_approved_at.clone() : null;
    o.order_delivered_carrier_date = (o.order_delivered_carrier_date != null) ? (java.sql.Timestamp) o.order_delivered_carrier_date.clone() : null;
    o.order_delivered_customer_date = (o.order_delivered_customer_date != null) ? (java.sql.Timestamp) o.order_delivered_customer_date.clone() : null;
    o.order_estimated_delivery_date = (o.order_estimated_delivery_date != null) ? (java.sql.Timestamp) o.order_estimated_delivery_date.clone() : null;
    return o;
  }

  public void clone0(orders o) throws CloneNotSupportedException {
    o.order_purchase_timestamp = (o.order_purchase_timestamp != null) ? (java.sql.Timestamp) o.order_purchase_timestamp.clone() : null;
    o.order_approved_at = (o.order_approved_at != null) ? (java.sql.Timestamp) o.order_approved_at.clone() : null;
    o.order_delivered_carrier_date = (o.order_delivered_carrier_date != null) ? (java.sql.Timestamp) o.order_delivered_carrier_date.clone() : null;
    o.order_delivered_customer_date = (o.order_delivered_customer_date != null) ? (java.sql.Timestamp) o.order_delivered_customer_date.clone() : null;
    o.order_estimated_delivery_date = (o.order_estimated_delivery_date != null) ? (java.sql.Timestamp) o.order_estimated_delivery_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("order_status", this.order_status);
    __sqoop$field_map.put("order_purchase_timestamp", this.order_purchase_timestamp);
    __sqoop$field_map.put("order_approved_at", this.order_approved_at);
    __sqoop$field_map.put("order_delivered_carrier_date", this.order_delivered_carrier_date);
    __sqoop$field_map.put("order_delivered_customer_date", this.order_delivered_customer_date);
    __sqoop$field_map.put("order_estimated_delivery_date", this.order_estimated_delivery_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("order_status", this.order_status);
    __sqoop$field_map.put("order_purchase_timestamp", this.order_purchase_timestamp);
    __sqoop$field_map.put("order_approved_at", this.order_approved_at);
    __sqoop$field_map.put("order_delivered_carrier_date", this.order_delivered_carrier_date);
    __sqoop$field_map.put("order_delivered_customer_date", this.order_delivered_customer_date);
    __sqoop$field_map.put("order_estimated_delivery_date", this.order_estimated_delivery_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
