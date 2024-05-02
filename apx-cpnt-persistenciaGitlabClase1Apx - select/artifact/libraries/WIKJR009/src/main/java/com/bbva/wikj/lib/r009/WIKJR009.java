package com.bbva.wikj.lib.r009;

import com.bbva.wikj.dto.pruebafinal.CustomerIn;
import com.bbva.wikj.dto.pruebafinal.CustomerOut;

/**
 * The  interface WIKJR009 class...
 */
public interface WIKJR009 {

	int executeInsert(CustomerIn customerIn);

	CustomerOut executeSelect(String nuip);

}
