package com.qrtest.qrtest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.qrtest.qrtest.model.patpass.PatPassRequest;
import com.qrtest.qrtest.service.QrService;


@CrossOrigin(origins = "*")
@RequestMapping("${app.context-api}/service")
@RestController
public class qrtest {

	@Autowired
	QrService qrService;
	
	@GetMapping("consulta/{id}/{serviceId}")
	public ResponseEntity<?> getById(@PathVariable("id") String id,@PathVariable("serviceId") String serviceId){
        try {
String sd = new Gson().toJson(qrService.consultarComercio(id, serviceId));
        	return new ResponseEntity<>(sd 
                , HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("patpass")
	public ResponseEntity<?> inscripcionTarjeta(@RequestBody PatPassRequest request){
        try {
        	return new ResponseEntity<>( new Gson().toJson(qrService.inscribirTarjeta(request))
                , HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
}
