package com.smartrm.smartrmmonolith.event;

import com.smartrm.smartrmmonolith.infracore.event.DomainEvent;

/**
 * @author: hu
 * @description:
 */
public class TestEvent extends DomainEvent {


  public TestEvent() {
    super("test.event");
  }

  @Override
  public String key() {
    return null;
  }
}
