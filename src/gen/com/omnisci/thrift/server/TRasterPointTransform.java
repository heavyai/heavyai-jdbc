/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.omnisci.thrift.server;


public enum TRasterPointTransform implements org.apache.thrift.TEnum {
  NONE(0),
  AUTO(1),
  FILE(2),
  WORLD(3);

  private final int value;

  private TRasterPointTransform(int value) {
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
  public static TRasterPointTransform findByValue(int value) { 
    switch (value) {
      case 0:
        return NONE;
      case 1:
        return AUTO;
      case 2:
        return FILE;
      case 3:
        return WORLD;
      default:
        return null;
    }
  }
}
