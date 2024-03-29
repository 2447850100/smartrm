package com.smartrm.smartrmmonolith.trade.domain;

/**
 * @author: hu
 * @description: 订单状态
 */
public enum OrderState {
  Start(0),
  Success(1),
  Canceled(2);

  private final int code;

  private OrderState(int code) {
    this.code = code;
  }

  public int code() {
    return code;
  }

  public static OrderState of(int code) {
    for (OrderState state : values()) {
      if (state.code == code) {
        return state;
      }
    }
    return null;
  }
}
