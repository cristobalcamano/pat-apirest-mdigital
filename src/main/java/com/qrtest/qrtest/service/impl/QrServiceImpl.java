package com.qrtest.qrtest.service.impl;

import java.util.Collections;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.qrtest.qrtest.model.ComercioDto;
import com.qrtest.qrtest.model.Data;
import com.qrtest.qrtest.model.patpass.PatPassRequest;
import com.qrtest.qrtest.model.patpass.PatRequestResponse;
import com.qrtest.qrtest.service.QrService;

@Service
public class QrServiceImpl implements QrService {

	private final RestTemplate rt;
	
	@Autowired
	public QrServiceImpl(RestTemplate rt) {
		this.rt = rt;
	}
	
	/*
	 * Se inyectan los repositorios con Autowired cuando se haya definido la base de
	 * datos a la que conectarse o el api en su defecto.
	 */

	@Override
	public ComercioDto consultarComercio(String id, String serviceId) throws Exception {
		ComercioDto comercio = null;
		try {
			//Data d = rt.getForObject(url, Data.class);
			
			/*
			String url = "http://localhost:8080/patpass/v1/api/datapower/CommerId/ServiceId";
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

			headers.set("X-Request-Source", "Desktop");
			HttpEntity request = new HttpEntity(headers);
			
			ResponseEntity<Data> d = rt.exchange(
			        url,
			        HttpMethod.GET,
			        request,
			        Data.class,
			        1
			);
*/			
			switch (id) {
			case "001":
				String[] presupuestoPesos = {"1000","2500","5000"};
				String[] presupuestoUF = {"1","2","3"};

				String montoMaximoPeso = "100000";
				String montoMaximoUF = "3";
				comercio = new ComercioDto(1,"../../../assets/img/company/company-demo.PNG","Comercio 1","2345678"
				,presupuestoPesos, presupuestoUF,"1","0",montoMaximoPeso,montoMaximoUF);
				break;
			case "002":
				String[] presupuestoPesos2 = {"1000","2500","5000"};
				String[] presupuestoUF2 = {"1","2","3"};

				String montoMaximoPeso2 = "100000";
				String montoMaximoUF2 = "3";
				comercio = new ComercioDto(1,"../../../assets/img/company/company-demo.PNG","Comercio 1","2345678"
				,presupuestoPesos2, presupuestoUF2,"1","0",montoMaximoPeso2,montoMaximoUF2);
				break;
			case "003":
				String[] presupuestoPesos3 = {"1000","2500","5000"};
				String[] presupuestoUF3 = {"1","2","3"};

				String montoMaximoPeso3 = "100000";
				String montoMaximoUF3 = "3";
				comercio = new ComercioDto(1,"../../../assets/img/company/company-demo.PNG","Comercio 1","2345678"
				,presupuestoPesos3, presupuestoUF3,"1","0",montoMaximoPeso3,montoMaximoUF3);
				break;
			default:
				throw new InstanceNotFoundException();
			}
			//comercio = d.getBody().data;
		} catch (InstanceNotFoundException e) {
			throw new Exception("No existe.");
		} catch (Exception e) {
		    System.out.print(e.getMessage());
			throw new Exception("Ops, Intenta mas tarde o contacta con un administrador.");
		}
		return comercio;
	}

	@Override
	public PatRequestResponse inscribirTarjeta(PatPassRequest request) throws Exception {
		
		PatRequestResponse response = new PatRequestResponse();
		
		if(request.getData().getCommerceId()==3) {
			throw new Exception("Comercio invalido para la inscripcion de tarjetas!");
		}
		
		response.setMessage("Tarjeta inscrita con exito!");
		
		return response;
	}

}
