package com.spring.entities.util;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.spring.entities.model.Address;
import com.spring.entities.model.EntityAddr;


@Component
public class RestConnector {
	//@Autowired
	//private DiscoveryClient discoveryclient;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
    public EntityAddr getEntityAddress(int id) {
        //String baseUrl = "http://localhost:8084";
    	//List<ServiceInstance> serviceinstance = discoveryclient.getInstances("results-service");
    	//String baseUrl = serviceinstance.get(0).getUri().toString();
    	
    	ServiceInstance instance = loadBalancerClient.choose("results-service");
    	//ServiceInstance instance = loadBalancerClient.choose("zuul-service");
    	String baseUrl = instance.getUri().toString();
    	System.out.println(" base url of results-service : "+ baseUrl);
    	String resultsUrl = baseUrl + "/results/" + id;
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> address = (Map) restTemplate.getForObject(resultsUrl, Object.class);
        return new EntityAddr(address.get("addrLine1"),address.get("addrType1"),address.get("dateTimeLastModified1"),address.get("defaultRecord1"),address.get("osUserLastModified"),address.get("postCd"),address.get("requestingEntity"),address.get("sessUserLastModified"),address.get("street1") ,address.get("suburb1"),address.get("tenantId"),address.get("townOrCity1"));
    }
}
