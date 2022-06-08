package com.qrtest.qrtest.rest;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RequestMapping("${app.context-api}/datapower")
@RestController
public class MockDataPower {
	
	@GetMapping("CommerId/ServiceId")
	public ResponseEntity<?> quetedices(HttpServletRequest sr){
		
		JSONObject jsonObject = new JSONObject("{\"data\":{\r\n"
				+ "\"commerceId\":1,\r\n"
				+ "\"imagen\":\"../../../assets/img/company/company-demo.PNG\",\r\n"
				+ "\"nombre\":\"Comercio 1\",\r\n"
				+ "\"rut\":\"2345678\",\r\n"
				+ "\"presupuesto\":['120.0','122.0','125.0'],\r\n"
				+ "\"presupuestoUF\":['120.0','122.0','125.0'],\r\n"
				+ "\"tipoDeMonedaPeso\":\"true\",\r\n"
				+ "\"tipoDeMonedaUF\":\"true\"\r\n"
				+ "}}");
		return new ResponseEntity<>(jsonObject.toString(),HttpStatus.OK);
	}

}
