// ORM class for table 'order_reviews'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 26 19:50:37 UTC 2026
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

public class order_reviews extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("review_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_reviews.this.review_id = (String)value;
      }
    });
    setters.put("order_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_reviews.this.order_id = (String)value;
      }
    });
    setters.put("review_score", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_reviews.this.review_score = (Integer)value;
      }
    });
    setters.put("review_comment_title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_reviews.this.review_comment_title = (String)value;
      }
    });
    setters.put("review_comment_message", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_reviews.this.review_comment_message = (String)value;
      }
    });
    setters.put("review_creation_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_reviews.this.review_creation_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("review_answer_timestamp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_reviews.this.review_answer_timestamp = (java.sql.Timestamp)value;
      }
    });
  }
  public order_reviews() {
    init0();
  }
  private String review_id;
  public String get_review_id() {
    return review_id;
  }
  public void set_review_id(String review_id) {
    this.review_id = review_id;
  }
  public order_reviews with_review_id(String review_id) {
    this.review_id = review_id;
    return this;
  }
  private String order_id;
  public String get_order_id() {
    return order_id;
  }
  public void set_order_id(String order_id) {
    this.order_id = order_id;
  }
  public order_reviews with_order_id(String order_id) {
    this.order_id = order_id;
    return this;
  }
  private Integer review_score;
  public Integer get_review_score() {
    return review_score;
  }
  public void set_review_score(Integer review_score) {
    this.review_score = review_score;
  }
  public order_reviews with_review_score(Integer review_score) {
    this.review_score = review_score;
    return this;
  }
  private String review_comment_title;
  public String get_review_comment_title() {
    return review_comment_title;
  }
  public void set_review_comment_title(String review_comment_title) {
    this.review_comment_title = review_comment_title;
  }
  public order_reviews with_review_comment_title(String review_comment_title) {
    this.review_comment_title = review_comment_title;
    return this;
  }
  private String review_comment_message;
  public String get_review_comment_message() {
    return review_comment_message;
  }
  public void set_review_comment_message(String review_comment_message) {
    this.review_comment_message = review_comment_message;
  }
  public order_reviews with_review_comment_message(String review_comment_message) {
    this.review_comment_message = review_comment_message;
    return this;
  }
  private java.sql.Timestamp review_creation_date;
  public java.sql.Timestamp get_review_creation_date() {
    return review_creation_date;
  }
  public void set_review_creation_date(java.sql.Timestamp review_creation_date) {
    this.review_creation_date = review_creation_date;
  }
  public order_reviews with_review_creation_date(java.sql.Timestamp review_creation_date) {
    this.review_creation_date = review_creation_date;
    return this;
  }
  private java.sql.Timestamp review_answer_timestamp;
  public java.sql.Timestamp get_review_answer_timestamp() {
    return review_answer_timestamp;
  }
  public void set_review_answer_timestamp(java.sql.Timestamp review_answer_timestamp) {
    this.review_answer_timestamp = review_answer_timestamp;
  }
  public order_reviews with_review_answer_timestamp(java.sql.Timestamp review_answer_timestamp) {
    this.review_answer_timestamp = review_answer_timestamp;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_reviews)) {
      return false;
    }
    order_reviews that = (order_reviews) o;
    boolean equal = true;
    equal = equal && (this.review_id == null ? that.review_id == null : this.review_id.equals(that.review_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.review_score == null ? that.review_score == null : this.review_score.equals(that.review_score));
    equal = equal && (this.review_comment_title == null ? that.review_comment_title == null : this.review_comment_title.equals(that.review_comment_title));
    equal = equal && (this.review_comment_message == null ? that.review_comment_message == null : this.review_comment_message.equals(that.review_comment_message));
    equal = equal && (this.review_creation_date == null ? that.review_creation_date == null : this.review_creation_date.equals(that.review_creation_date));
    equal = equal && (this.review_answer_timestamp == null ? that.review_answer_timestamp == null : this.review_answer_timestamp.equals(that.review_answer_timestamp));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_reviews)) {
      return false;
    }
    order_reviews that = (order_reviews) o;
    boolean equal = true;
    equal = equal && (this.review_id == null ? that.review_id == null : this.review_id.equals(that.review_id));
    equal = equal && (this.order_id == null ? that.order_id == null : this.order_id.equals(that.order_id));
    equal = equal && (this.review_score == null ? that.review_score == null : this.review_score.equals(that.review_score));
    equal = equal && (this.review_comment_title == null ? that.review_comment_title == null : this.review_comment_title.equals(that.review_comment_title));
    equal = equal && (this.review_comment_message == null ? that.review_comment_message == null : this.review_comment_message.equals(that.review_comment_message));
    equal = equal && (this.review_creation_date == null ? that.review_creation_date == null : this.review_creation_date.equals(that.review_creation_date));
    equal = equal && (this.review_answer_timestamp == null ? that.review_answer_timestamp == null : this.review_answer_timestamp.equals(that.review_answer_timestamp));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.review_id = JdbcWritableBridge.readString(1, __dbResults);
    this.order_id = JdbcWritableBridge.readString(2, __dbResults);
    this.review_score = JdbcWritableBridge.readInteger(3, __dbResults);
    this.review_comment_title = JdbcWritableBridge.readString(4, __dbResults);
    this.review_comment_message = JdbcWritableBridge.readString(5, __dbResults);
    this.review_creation_date = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.review_answer_timestamp = JdbcWritableBridge.readTimestamp(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.review_id = JdbcWritableBridge.readString(1, __dbResults);
    this.order_id = JdbcWritableBridge.readString(2, __dbResults);
    this.review_score = JdbcWritableBridge.readInteger(3, __dbResults);
    this.review_comment_title = JdbcWritableBridge.readString(4, __dbResults);
    this.review_comment_message = JdbcWritableBridge.readString(5, __dbResults);
    this.review_creation_date = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.review_answer_timestamp = JdbcWritableBridge.readTimestamp(7, __dbResults);
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
    JdbcWritableBridge.writeString(review_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(review_score, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(review_comment_title, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(review_comment_message, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(review_creation_date, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(review_answer_timestamp, 7 + __off, 93, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(review_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(order_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(review_score, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(review_comment_title, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(review_comment_message, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(review_creation_date, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(review_answer_timestamp, 7 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.review_id = null;
    } else {
    this.review_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.order_id = null;
    } else {
    this.order_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_score = null;
    } else {
    this.review_score = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.review_comment_title = null;
    } else {
    this.review_comment_title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_comment_message = null;
    } else {
    this.review_comment_message = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_creation_date = null;
    } else {
    this.review_creation_date = new Timestamp(__dataIn.readLong());
    this.review_creation_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.review_answer_timestamp = null;
    } else {
    this.review_answer_timestamp = new Timestamp(__dataIn.readLong());
    this.review_answer_timestamp.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.review_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.review_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.review_score);
    }
    if (null == this.review_comment_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_comment_title);
    }
    if (null == this.review_comment_message) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_comment_message);
    }
    if (null == this.review_creation_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.review_creation_date.getTime());
    __dataOut.writeInt(this.review_creation_date.getNanos());
    }
    if (null == this.review_answer_timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.review_answer_timestamp.getTime());
    __dataOut.writeInt(this.review_answer_timestamp.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.review_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_id);
    }
    if (null == this.order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, order_id);
    }
    if (null == this.review_score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.review_score);
    }
    if (null == this.review_comment_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_comment_title);
    }
    if (null == this.review_comment_message) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_comment_message);
    }
    if (null == this.review_creation_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.review_creation_date.getTime());
    __dataOut.writeInt(this.review_creation_date.getNanos());
    }
    if (null == this.review_answer_timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.review_answer_timestamp.getTime());
    __dataOut.writeInt(this.review_answer_timestamp.getNanos());
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
    __sb.append(FieldFormatter.hiveStringDropDelims(review_id==null?"\\N":review_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(order_id==null?"\\N":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_score==null?"\\N":"" + review_score, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(review_comment_title==null?"\\N":review_comment_title, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(review_comment_message==null?"\\N":review_comment_message, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_creation_date==null?"\\N":"" + review_creation_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_answer_timestamp==null?"\\N":"" + review_answer_timestamp, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(review_id==null?"\\N":review_id, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(order_id==null?"\\N":order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_score==null?"\\N":"" + review_score, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(review_comment_title==null?"\\N":review_comment_title, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, droppingdelimiters \n,\r,\01 from strings
    __sb.append(FieldFormatter.hiveStringDropDelims(review_comment_message==null?"\\N":review_comment_message, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_creation_date==null?"\\N":"" + review_creation_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_answer_timestamp==null?"\\N":"" + review_answer_timestamp, delimiters));
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
    if (__cur_str.equals("null")) { this.review_id = null; } else {
      this.review_id = __cur_str;
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_score = null; } else {
      this.review_score = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.review_comment_title = null; } else {
      this.review_comment_title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.review_comment_message = null; } else {
      this.review_comment_message = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_creation_date = null; } else {
      this.review_creation_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_answer_timestamp = null; } else {
      this.review_answer_timestamp = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.review_id = null; } else {
      this.review_id = __cur_str;
    }

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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_score = null; } else {
      this.review_score = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.review_comment_title = null; } else {
      this.review_comment_title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.review_comment_message = null; } else {
      this.review_comment_message = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_creation_date = null; } else {
      this.review_creation_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_answer_timestamp = null; } else {
      this.review_answer_timestamp = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    order_reviews o = (order_reviews) super.clone();
    o.review_creation_date = (o.review_creation_date != null) ? (java.sql.Timestamp) o.review_creation_date.clone() : null;
    o.review_answer_timestamp = (o.review_answer_timestamp != null) ? (java.sql.Timestamp) o.review_answer_timestamp.clone() : null;
    return o;
  }

  public void clone0(order_reviews o) throws CloneNotSupportedException {
    o.review_creation_date = (o.review_creation_date != null) ? (java.sql.Timestamp) o.review_creation_date.clone() : null;
    o.review_answer_timestamp = (o.review_answer_timestamp != null) ? (java.sql.Timestamp) o.review_answer_timestamp.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("review_id", this.review_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("review_score", this.review_score);
    __sqoop$field_map.put("review_comment_title", this.review_comment_title);
    __sqoop$field_map.put("review_comment_message", this.review_comment_message);
    __sqoop$field_map.put("review_creation_date", this.review_creation_date);
    __sqoop$field_map.put("review_answer_timestamp", this.review_answer_timestamp);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("review_id", this.review_id);
    __sqoop$field_map.put("order_id", this.order_id);
    __sqoop$field_map.put("review_score", this.review_score);
    __sqoop$field_map.put("review_comment_title", this.review_comment_title);
    __sqoop$field_map.put("review_comment_message", this.review_comment_message);
    __sqoop$field_map.put("review_creation_date", this.review_creation_date);
    __sqoop$field_map.put("review_answer_timestamp", this.review_answer_timestamp);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
