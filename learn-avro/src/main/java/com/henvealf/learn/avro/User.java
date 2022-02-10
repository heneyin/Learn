/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.henvealf.learn.avro;  
@SuppressWarnings("all")
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"example.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"favorite_number\",\"type\":[\"int\",\"null\"]},{\"name\":\"favorite_color\",\"type\":[\"string\",\"null\"]}]}");
  @Deprecated public CharSequence name;
  @Deprecated public Integer favorite_number;
  @Deprecated public CharSequence favorite_color;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return favorite_number;
    case 2: return favorite_color;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: name = (CharSequence)value$; break;
    case 1: favorite_number = (Integer)value$; break;
    case 2: favorite_color = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'favorite_number' field.
   */
  public Integer getFavoriteNumber() {
    return favorite_number;
  }

  /**
   * Sets the value of the 'favorite_number' field.
   * @param value the value to set.
   */
  public void setFavoriteNumber(Integer value) {
    this.favorite_number = value;
  }

  /**
   * Gets the value of the 'favorite_color' field.
   */
  public CharSequence getFavoriteColor() {
    return favorite_color;
  }

  /**
   * Sets the value of the 'favorite_color' field.
   * @param value the value to set.
   */
  public void setFavoriteColor(CharSequence value) {
    this.favorite_color = value;
  }

  /** Creates a new User RecordBuilder */
  public static User.Builder newBuilder() {
    return new User.Builder();
  }
  
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static User.Builder newBuilder(User.Builder other) {
    return new User.Builder(other);
  }
  
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static User.Builder newBuilder(User other) {
    return new User.Builder(other);
  }
  
  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private CharSequence name;
    private Integer favorite_number;
    private CharSequence favorite_color;

    /** Creates a new Builder */
    private Builder() {
      super(User.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(User.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing User instance */
    private Builder(User other) {
            super(User.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = (CharSequence) data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.favorite_number)) {
        this.favorite_number = (Integer) data().deepCopy(fields()[1].schema(), other.favorite_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.favorite_color)) {
        this.favorite_color = (CharSequence) data().deepCopy(fields()[2].schema(), other.favorite_color);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public User.Builder setName(CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public User.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'favorite_number' field */
    public Integer getFavoriteNumber() {
      return favorite_number;
    }
    
    /** Sets the value of the 'favorite_number' field */
    public User.Builder setFavoriteNumber(Integer value) {
      validate(fields()[1], value);
      this.favorite_number = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'favorite_number' field has been set */
    public boolean hasFavoriteNumber() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'favorite_number' field */
    public User.Builder clearFavoriteNumber() {
      favorite_number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'favorite_color' field */
    public CharSequence getFavoriteColor() {
      return favorite_color;
    }
    
    /** Sets the value of the 'favorite_color' field */
    public User.Builder setFavoriteColor(CharSequence value) {
      validate(fields()[2], value);
      this.favorite_color = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'favorite_color' field has been set */
    public boolean hasFavoriteColor() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'favorite_color' field */
    public User.Builder clearFavoriteColor() {
      favorite_color = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.name = fieldSetFlags()[0] ? this.name : (CharSequence) defaultValue(fields()[0]);
        record.favorite_number = fieldSetFlags()[1] ? this.favorite_number : (Integer) defaultValue(fields()[1]);
        record.favorite_color = fieldSetFlags()[2] ? this.favorite_color : (CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}