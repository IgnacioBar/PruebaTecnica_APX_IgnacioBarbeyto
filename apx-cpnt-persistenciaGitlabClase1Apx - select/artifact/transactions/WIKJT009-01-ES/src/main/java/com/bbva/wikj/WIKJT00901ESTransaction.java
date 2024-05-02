package com.bbva.wikj;

import com.bbva.wikj.dto.pruebafinal.CustomerIn;
import com.bbva.wikj.dto.pruebafinal.CustomerOut;
import com.bbva.wikj.lib.r009.WIKJR009;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * prueba final APX
 *
 */
public class WIKJT00901ESTransaction extends AbstractWIKJT00901ESTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT00901ESTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		WIKJR009 wikjR009 = this.getServiceLibrary(WIKJR009.class);

		CustomerIn customer = this.getCustomerin();
		int result = wikjR009.executeInsert(customer);

		if(result == 0) {
			setCustomerout(null);
		} else {
			CustomerOut customerOut = wikjR009.executeSelect(customer.getNuip());
			setCustomerout(customerOut);
		}

	}

}
