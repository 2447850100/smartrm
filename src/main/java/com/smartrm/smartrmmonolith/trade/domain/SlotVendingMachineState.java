package com.smartrm.smartrmmonolith.trade.domain;

/**
 * @author: hu
 * @description:
 */
public enum SlotVendingMachineState {
  Ready(0),
  Trading(1),
  Popping(2);

  private final int code;

  private SlotVendingMachineState(int code) {
    this.code = code;
  }

  public int code() {
    return code;
  }

  public static SlotVendingMachineState of(int code) {
    for (SlotVendingMachineState state : values()) {
      if (state.code == code) {
        return state;
      }
    }
    return null;
  }

}
