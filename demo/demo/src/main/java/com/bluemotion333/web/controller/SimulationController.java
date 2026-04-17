package com.bluemotion333.web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


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
    public Map<String,List<Double>> simulate(@RequestBody Map<String,Double> input) {
        double waveHeight=input.get("waveHeight");
        double frequency=input.get("frequency");
        double springConstanat=input.get("springConstant");
        double omega=2*Math.PI*frequency;

        List<Double> time=new ArrayList<>();
        List<Double> displacement=new ArrayList<>();
        List<Double> force=new ArrayList<>();
        List<Double> power=new ArrayList<>();

        for (double i=0;i<10;i+=0.1){
            double x=waveHeight * Math.sin(omega*i);//waveheight is the measurement of amplitude but we can consider within x direction and y direction
       
            double f=springConstanat*waveHeight;
            double p=f*waveHeight*omega*Math.cos(omega*i);//make the velocity throw displacement and frequency by that particular dirctiom
            time.add(i);
            displacement.add(x);
            force.add(f);
            power.add(p);            
        }

        

        Map<String ,List<Double>> result =new HashMap<>();
        result.put("time", time);
        result.put("displacement", displacement);
        result.put("force", force);
        result.put("power", power);
        return result;
    }
}
