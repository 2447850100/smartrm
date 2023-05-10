package com.smartrm.smartrmmonolith.operation.domain.remote.erp;

import com.smartrm.smartrmmonolith.operation.domain.VendingMachineInstallOrder;

/**
 * @author: hu
 * @description:
 */
public interface DevicePurchaseService {

  void placeInstallOrder(VendingMachineInstallOrder order);

}
