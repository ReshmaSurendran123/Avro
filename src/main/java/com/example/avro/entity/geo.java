/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro.entity;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class geo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6410305182324710871L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"geo\",\"namespace\":\"com.example.avro.entity\",\"fields\":[{\"name\":\"lat\",\"type\":\"string\"},{\"name\":\"lng\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<geo> ENCODER =
      new BinaryMessageEncoder<geo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<geo> DECODER =
      new BinaryMessageDecoder<geo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<geo> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<geo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<geo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<geo>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this geo to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a geo from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a geo instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static geo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence lat;
   private java.lang.CharSequence lng;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public geo() {}

  /**
   * All-args constructor.
   * @param lat The new value for lat
   * @param lng The new value for lng
   */
  public geo(java.lang.CharSequence lat, java.lang.CharSequence lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return lat;
    case 1: return lng;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: lat = (java.lang.CharSequence)value$; break;
    case 1: lng = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'lat' field.
   * @return The value of the 'lat' field.
   */
  public java.lang.CharSequence getLat() {
    return lat;
  }


  /**
   * Sets the value of the 'lat' field.
   * @param value the value to set.
   */
  public void setLat(java.lang.CharSequence value) {
    this.lat = value;
  }

  /**
   * Gets the value of the 'lng' field.
   * @return The value of the 'lng' field.
   */
  public java.lang.CharSequence getLng() {
    return lng;
  }


  /**
   * Sets the value of the 'lng' field.
   * @param value the value to set.
   */
  public void setLng(java.lang.CharSequence value) {
    this.lng = value;
  }

  /**
   * Creates a new geo RecordBuilder.
   * @return A new geo RecordBuilder
   */
  public static com.example.avro.entity.geo.Builder newBuilder() {
    return new com.example.avro.entity.geo.Builder();
  }

  /**
   * Creates a new geo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new geo RecordBuilder
   */
  public static com.example.avro.entity.geo.Builder newBuilder(com.example.avro.entity.geo.Builder other) {
    if (other == null) {
      return new com.example.avro.entity.geo.Builder();
    } else {
      return new com.example.avro.entity.geo.Builder(other);
    }
  }

  /**
   * Creates a new geo RecordBuilder by copying an existing geo instance.
   * @param other The existing instance to copy.
   * @return A new geo RecordBuilder
   */
  public static com.example.avro.entity.geo.Builder newBuilder(com.example.avro.entity.geo other) {
    if (other == null) {
      return new com.example.avro.entity.geo.Builder();
    } else {
      return new com.example.avro.entity.geo.Builder(other);
    }
  }

  /**
   * RecordBuilder for geo instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<geo>
    implements org.apache.avro.data.RecordBuilder<geo> {

    private java.lang.CharSequence lat;
    private java.lang.CharSequence lng;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.avro.entity.geo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.lat)) {
        this.lat = data().deepCopy(fields()[0].schema(), other.lat);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.lng)) {
        this.lng = data().deepCopy(fields()[1].schema(), other.lng);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing geo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.avro.entity.geo other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.lat)) {
        this.lat = data().deepCopy(fields()[0].schema(), other.lat);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lng)) {
        this.lng = data().deepCopy(fields()[1].schema(), other.lng);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'lat' field.
      * @return The value.
      */
    public java.lang.CharSequence getLat() {
      return lat;
    }


    /**
      * Sets the value of the 'lat' field.
      * @param value The value of 'lat'.
      * @return This builder.
      */
    public com.example.avro.entity.geo.Builder setLat(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.lat = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'lat' field has been set.
      * @return True if the 'lat' field has been set, false otherwise.
      */
    public boolean hasLat() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'lat' field.
      * @return This builder.
      */
    public com.example.avro.entity.geo.Builder clearLat() {
      lat = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lng' field.
      * @return The value.
      */
    public java.lang.CharSequence getLng() {
      return lng;
    }


    /**
      * Sets the value of the 'lng' field.
      * @param value The value of 'lng'.
      * @return This builder.
      */
    public com.example.avro.entity.geo.Builder setLng(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lng = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lng' field has been set.
      * @return True if the 'lng' field has been set, false otherwise.
      */
    public boolean hasLng() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lng' field.
      * @return This builder.
      */
    public com.example.avro.entity.geo.Builder clearLng() {
      lng = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public geo build() {
      try {
        geo record = new geo();
        record.lat = fieldSetFlags()[0] ? this.lat : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lng = fieldSetFlags()[1] ? this.lng : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<geo>
    WRITER$ = (org.apache.avro.io.DatumWriter<geo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<geo>
    READER$ = (org.apache.avro.io.DatumReader<geo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.lat);

    out.writeString(this.lng);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.lat = in.readString(this.lat instanceof Utf8 ? (Utf8)this.lat : null);

      this.lng = in.readString(this.lng instanceof Utf8 ? (Utf8)this.lng : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.lat = in.readString(this.lat instanceof Utf8 ? (Utf8)this.lat : null);
          break;

        case 1:
          this.lng = in.readString(this.lng instanceof Utf8 ? (Utf8)this.lng : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









