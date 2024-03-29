package com.smartrm.smartrmmonolith.trade.adapter.eventhandler;

import com.smartrm.smartrmmonolith.device.domain.cabinet.CabinetVendingMachineLockedEvent;
import com.smartrm.smartrmmonolith.infracore.event.DomainEventHandler;
import com.smartrm.smartrmmonolith.trade.application.AppTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: hu
 * @description:
 */
@Component
public class CabinetLockedEventHandler implements
    DomainEventHandler<CabinetVendingMachineLockedEvent> {

  @Autowired
  AppTradeService tradeService;

  @Override
  public void onApplicationEvent(CabinetVendingMachineLockedEvent event) {
    tradeService.onCabinetLocked(event);
  }
}
