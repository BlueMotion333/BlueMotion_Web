package com.bluemotion333.web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")


public class SimulationController {
    @PostMapping("/simulate")
    public Map<String,Double> simulate(@RequestBody Map<String,Double> input) {
        double waveHeight=input.get("waveHeight");
        double frequency=input.get("frequency");
        double k=input.get("springConstant");
        double omega=2*Math.PI*frequency;

        List<Double> time=new ArrayList();
        List<Double> displacement=new ArrayList();
        List<Double> force=new ArrayList();
        List<Double> power=new ArrayList();

        double displacement=waveHeight;
        double force=k*displacement;
        double velocity=frequency*displacement;
        double power=force*velocity;

        Map<String ,Double> result =new HashMap<>();
        result.put("force",force);
        result.put("power",power);
        return result;
    }
}
