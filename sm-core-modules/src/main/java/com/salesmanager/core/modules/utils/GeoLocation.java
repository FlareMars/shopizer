package com.salesmanager.core.modules.utils;

import com.salesmanager.core.business.common.model.Address;

/**
 * IP地址转地位位置工具接口
 */
public interface GeoLocation {
	
	Address getAddress(String ipAddress) throws Exception;

}
