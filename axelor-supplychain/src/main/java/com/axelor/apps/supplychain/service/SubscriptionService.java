package com.axelor.apps.supplychain.service;

import com.axelor.apps.sale.db.SaleOrder;
import com.axelor.apps.sale.db.SaleOrderLine;
import com.axelor.exception.AxelorException;
import com.google.inject.persist.Transactional;

public interface SubscriptionService {
	@Transactional
	public SaleOrderLine generateSubscriptions(SaleOrderLine saleOrderLine) throws AxelorException;

	@Transactional
	public SaleOrderLine generateSubscriptions(SaleOrderLine saleOrderLineIt,SaleOrder saleOrder) throws AxelorException;
	
	@Transactional
	public void generateAllSubscriptions(SaleOrder saleOrder) throws AxelorException;

}