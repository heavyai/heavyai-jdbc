/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.heavy.thrift.server;


public enum TImportHeaderRow implements org.apache.thrift.TEnum {
  AUTODETECT(0),
  NO_HEADER(1),
  HAS_HEADER(2);

  private final int value;

  private TImportHeaderRow(int value) {
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
  public static TImportHeaderRow findByValue(int value) { 
    switch (value) {
      case 0:
        return AUTODETECT;
      case 1:
        return NO_HEADER;
      case 2:
        return HAS_HEADER;
      default:
        return null;
    }
  }
}
