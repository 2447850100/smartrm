package com.smartrm.smartrmmonolith.device.domain.cabinet;

/**
 * @author: hu
 * @description:
 */
public enum CabinetDoorState {
  Locked(0),
  Open(1);

  private final int code;

  private CabinetDoorState(int code) {
    this.code = code;
  }

  public int code() {
    return code;
  }

  public static CabinetDoorState of(int code) {
    for (CabinetDoorState state : values()) {
      if (state.code == code) {
        return state;
      }
    }
    return null;
  }
}
