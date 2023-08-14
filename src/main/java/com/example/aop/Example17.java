package com.example.aop;

import com.example.aop.config.ProjectConfig;
import com.example.aop.model.Song;
import com.example.aop.services.VehicleServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Example17 {

    public static void main(String[] args) {
//        SpringApplication.run(Example17.class, args);
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted,song);
        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
    }
}
