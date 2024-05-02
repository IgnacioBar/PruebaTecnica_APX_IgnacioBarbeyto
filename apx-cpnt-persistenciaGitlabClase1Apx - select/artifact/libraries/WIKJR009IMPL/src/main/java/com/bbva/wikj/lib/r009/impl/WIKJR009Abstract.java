package com.bbva.wikj.lib.r009.impl;

import com.bbva.cpan.lib.r004.CPANR004;
import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.elara.utility.jdbc.JdbcUtils;
import com.bbva.wikj.lib.r009.WIKJR009;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class WIKJR009Abstract extends AbstractLibrary implements WIKJR009 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected JdbcUtils jdbcUtils;

	protected CPANR004 cpanR004;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param jdbcUtils the this.jdbcUtils to set
	*/
	public void setJdbcUtils(JdbcUtils jdbcUtils) {
		this.jdbcUtils = jdbcUtils;
	}

	/**
	* @param cpanR004 the this.cpanR004 to set
	*/
	public void setCpanR004(CPANR004 cpanR004) {
		this.cpanR004 = cpanR004;
	}

}