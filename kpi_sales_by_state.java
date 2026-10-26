// ORM class for table 'kpi_sales_by_state'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 26 20:42:05 UTC 2026
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

public class kpi_sales_by_state extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("customer_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        kpi_sales_by_state.this.customer_state = (String)value;
      }
    });
    setters.put("nb_orders", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        kpi_sales_by_state.this.nb_orders = (Long)value;
      }
    });
    setters.put("revenue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        kpi_sales_by_state.this.revenue = (Double)value;
      }
    });
    setters.put("avg_ticket", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        kpi_sales_by_state.this.avg_ticket = (Double)value;
      }
    });
  }
  public kpi_sales_by_state() {
    init0();
  }
  private String customer_state;
  public String get_customer_state() {
    return customer_state;
  }
  public void set_customer_state(String customer_state) {
    this.customer_state = customer_state;
  }
  public kpi_sales_by_state with_customer_state(String customer_state) {
    this.customer_state = customer_state;
    return this;
  }
  private Long nb_orders;
  public Long get_nb_orders() {
    return nb_orders;
  }
  public void set_nb_orders(Long nb_orders) {
    this.nb_orders = nb_orders;
  }
  public kpi_sales_by_state with_nb_orders(Long nb_orders) {
    this.nb_orders = nb_orders;
    return this;
  }
  private Double revenue;
  public Double get_revenue() {
    return revenue;
  }
  public void set_revenue(Double revenue) {
    this.revenue = revenue;
  }
  public kpi_sales_by_state with_revenue(Double revenue) {
    this.revenue = revenue;
    return this;
  }
  private Double avg_ticket;
  public Double get_avg_ticket() {
    return avg_ticket;
  }
  public void set_avg_ticket(Double avg_ticket) {
    this.avg_ticket = avg_ticket;
  }
  public kpi_sales_by_state with_avg_ticket(Double avg_ticket) {
    this.avg_ticket = avg_ticket;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof kpi_sales_by_state)) {
      return false;
    }
    kpi_sales_by_state that = (kpi_sales_by_state) o;
    boolean equal = true;
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    equal = equal && (this.nb_orders == null ? that.nb_orders == null : this.nb_orders.equals(that.nb_orders));
    equal = equal && (this.revenue == null ? that.revenue == null : this.revenue.equals(that.revenue));
    equal = equal && (this.avg_ticket == null ? that.avg_ticket == null : this.avg_ticket.equals(that.avg_ticket));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof kpi_sales_by_state)) {
      return false;
    }
    kpi_sales_by_state that = (kpi_sales_by_state) o;
    boolean equal = true;
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    equal = equal && (this.nb_orders == null ? that.nb_orders == null : this.nb_orders.equals(that.nb_orders));
    equal = equal && (this.revenue == null ? that.revenue == null : this.revenue.equals(that.revenue));
    equal = equal && (this.avg_ticket == null ? that.avg_ticket == null : this.avg_ticket.equals(that.avg_ticket));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.customer_state = JdbcWritableBridge.readString(1, __dbResults);
    this.nb_orders = JdbcWritableBridge.readLong(2, __dbResults);
    this.revenue = JdbcWritableBridge.readDouble(3, __dbResults);
    this.avg_ticket = JdbcWritableBridge.readDouble(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.customer_state = JdbcWritableBridge.readString(1, __dbResults);
    this.nb_orders = JdbcWritableBridge.readLong(2, __dbResults);
    this.revenue = JdbcWritableBridge.readDouble(3, __dbResults);
    this.avg_ticket = JdbcWritableBridge.readDouble(4, __dbResults);
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
    JdbcWritableBridge.writeString(customer_state, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeLong(nb_orders, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(revenue, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(avg_ticket, 4 + __off, 8, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(customer_state, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeLong(nb_orders, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(revenue, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(avg_ticket, 4 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.customer_state = null;
    } else {
    this.customer_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.nb_orders = null;
    } else {
    this.nb_orders = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.revenue = null;
    } else {
    this.revenue = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.avg_ticket = null;
    } else {
    this.avg_ticket = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
    if (null == this.nb_orders) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.nb_orders);
    }
    if (null == this.revenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.revenue);
    }
    if (null == this.avg_ticket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.avg_ticket);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
    if (null == this.nb_orders) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.nb_orders);
    }
    if (null == this.revenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.revenue);
    }
    if (null == this.avg_ticket) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.avg_ticket);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(customer_state==null?"null":customer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nb_orders==null?"null":"" + nb_orders, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(revenue==null?"null":"" + revenue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_ticket==null?"null":"" + avg_ticket, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(customer_state==null?"null":customer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nb_orders==null?"null":"" + nb_orders, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(revenue==null?"null":"" + revenue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_ticket==null?"null":"" + avg_ticket, delimiters));
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
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.nb_orders = null; } else {
      this.nb_orders = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.revenue = null; } else {
      this.revenue = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_ticket = null; } else {
      this.avg_ticket = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.nb_orders = null; } else {
      this.nb_orders = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.revenue = null; } else {
      this.revenue = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "\\N";
    }
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.avg_ticket = null; } else {
      this.avg_ticket = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    kpi_sales_by_state o = (kpi_sales_by_state) super.clone();
    return o;
  }

  public void clone0(kpi_sales_by_state o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("customer_state", this.customer_state);
    __sqoop$field_map.put("nb_orders", this.nb_orders);
    __sqoop$field_map.put("revenue", this.revenue);
    __sqoop$field_map.put("avg_ticket", this.avg_ticket);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("customer_state", this.customer_state);
    __sqoop$field_map.put("nb_orders", this.nb_orders);
    __sqoop$field_map.put("revenue", this.revenue);
    __sqoop$field_map.put("avg_ticket", this.avg_ticket);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
