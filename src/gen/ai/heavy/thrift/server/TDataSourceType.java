/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;


public enum TDataSourceType implements org.apache.thrift.TEnum {
  TABLE(0);

  private final int value;

  private TDataSourceType(int value) {
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
  public static TDataSourceType findByValue(int value) { 
    switch (value) {
      case 0:
        return TABLE;
      default:
        return null;
    }
  }
}
