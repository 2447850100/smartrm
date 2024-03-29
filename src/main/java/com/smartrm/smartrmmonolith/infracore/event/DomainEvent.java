package com.smartrm.smartrmmonolith.infracore.event;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.context.ApplicationEvent;

/**
 * @author: hu
 * @description: 领域事件
 */
public abstract class DomainEvent extends ApplicationEvent {

  private String eventId;
  private LocalDateTime occurTime;

  public String getEventName() {
    return (String) this.source;
  }

  public DomainEvent(Object source) {
    super(source);
    eventId = UUID.randomUUID().toString();
    occurTime = LocalDateTime.now();
  }

  public abstract String key();

  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public LocalDateTime getOccurTime() {
    return occurTime;
  }

  public void setOccurTime(LocalDateTime occurTime) {
    this.occurTime = occurTime;
  }
}
