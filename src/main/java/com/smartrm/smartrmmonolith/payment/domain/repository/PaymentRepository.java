package com.smartrm.smartrmmonolith.payment.domain.repository;

import com.smartrm.smartrmmonolith.payment.domain.Payment;

/**
 * @author: hu
 * @description:
 */
public interface PaymentRepository {

  Payment getByOrderId(Long orderId);

  void add(Payment payment);

  void update(Payment payment);

}
