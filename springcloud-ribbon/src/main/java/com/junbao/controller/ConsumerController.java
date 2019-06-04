package com.junbao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/findAll")
    public String findPersons(){
        //provider 是虚拟主机名
        return restTemplate.getForObject("http://provider/allPersons", String.class);
    }


    @GetMapping("/logInstance")
    public void logInstance(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("provider");

        System.out.println(">>service Id :"+ serviceInstance.getPort());

    }




}
