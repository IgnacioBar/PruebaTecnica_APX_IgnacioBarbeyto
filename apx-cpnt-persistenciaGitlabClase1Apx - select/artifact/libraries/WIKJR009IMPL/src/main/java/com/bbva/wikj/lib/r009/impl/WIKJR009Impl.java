package com.bbva.wikj.lib.r009.impl;

import com.bbva.wikj.dto.pruebafinal.CustomerIn;
import com.bbva.wikj.dto.pruebafinal.CustomerOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * The WIKJR009Impl class...
 */
public class WIKJR009Impl extends WIKJR009Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR009Impl.class);

	@Override
	public int executeInsert(CustomerIn customerIn) {
		Map<String , Object> args = new HashMap<>();
		args.put("id", customerIn.getId());
		args.put("nuip", customerIn.getNuip());
		args.put("full_name", customerIn.getFull_name());
		args.put("phone", customerIn.getPhone());
		args.put("address", customerIn.getAddress());
		return this.jdbcUtils.update("query.insert", args);
	}

	@Override
	public CustomerOut executeSelect(String nuip) {
		Map<String, Object> result = new HashMap<>();
		result = this.jdbcUtils.queryForMap("query.select", nuip);
		CustomerOut customerOut = new CustomerOut();
		customerOut.setId(String.valueOf(result.get("id")));
		customerOut.setNuip(String.valueOf(result.get("nuip")));
		customerOut.setFull_name(String.valueOf(result.get("full_name")));
		customerOut.setPhone(String.valueOf(result.get("phone")));
		customerOut.setAddress(String.valueOf(result.get("address")));
		return customerOut;
	}

}
