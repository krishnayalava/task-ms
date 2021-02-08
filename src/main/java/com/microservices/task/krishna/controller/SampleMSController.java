package com.microservices.task.krishna.controller;

import com.microservices.task.krishna.service.SampleMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowedHeaders ="*")
@RestController
@RequestMapping(value="/sample")
public class SampleMSController {

   /* @Autowired
    private SampleMSService sampleMSService;*/

    @GetMapping(value="/getData")
    public String getBackenddata(){

        return "Hello Microservice";
    }

    @PostMapping(value = "/createData")
    public String postBackendData(){
        return "Return MicroServices";

    }

    @PutMapping(value = "/updateData")
    public String updateData(){
        return "Updated MicroServices";

    }

    @DeleteMapping(value = "/deleteData")
    public String deleteData(){
        return "Deleted MicroServices";

    }
}
