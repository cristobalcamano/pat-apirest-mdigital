package com.qrtest.qrtest.service;

import com.qrtest.qrtest.model.ComercioDto;
import com.qrtest.qrtest.model.patpass.PatPassRequest;
import com.qrtest.qrtest.model.patpass.PatRequestResponse;

public interface QrService {

	public ComercioDto consultarComercio(String id, String serviceId) throws Exception;
	
	public PatRequestResponse inscribirTarjeta(PatPassRequest request) throws Exception;
	
}
