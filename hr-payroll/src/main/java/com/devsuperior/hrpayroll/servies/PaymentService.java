package com.devsuperior.hrpayroll.servies;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;

	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(Long workerId, int days) {

		// Dicionario de paramentos pares chaves e valor
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", "" + workerId);

		RestTemplate rest = new RestTemplate();

		// Worker work1 = rest.getForObject("http://localhost:8001/workers/1",
		// Worker.class);
		Worker work2 = rest.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);

		return new Payment(work2.getName(), work2.getDailyIncome(), days);

	}

}
