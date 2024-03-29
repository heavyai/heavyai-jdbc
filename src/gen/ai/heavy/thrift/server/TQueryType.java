/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;


public enum TQueryType implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  READ(1),
  WRITE(2),
  SCHEMA_READ(3),
  SCHEMA_WRITE(4);

  private final int value;

  private TQueryType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TQueryType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return READ;
      case 2:
        return WRITE;
      case 3:
        return SCHEMA_READ;
      case 4:
        return SCHEMA_WRITE;
      default:
        return null;
    }
  }
}
