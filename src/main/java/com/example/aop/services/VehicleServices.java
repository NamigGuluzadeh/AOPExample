package com.example.aop.services;

import com.example.aop.config.ProjectConfig;
import com.example.aop.interfaces.LogAspect;
import com.example.aop.interfaces.Speakers;
import com.example.aop.interfaces.Tyres;
import com.example.aop.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song){
        /*Instant start = Instant.now();
        logger.info("method execution start");*/
        /*String music = null;
        if(vehicleStarted){
            music = speakers.makeSound(song);
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the" +
                    " operation");
        }*/
        /*logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);*/
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted){
        /*Instant start = Instant.now();
        logger.info("method execution start");*/
       /* String status = null;
        if(vehicleStarted){
            status = tyres.rotate();
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the" +
                    " operation");
        }*/
        /*logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);*/
        return tyres.rotate();
    }

    public String applyBrake(boolean vehicleStarted){
        /*Instant start = Instant.now();
        logger.info("method execution start");*/
        /*String status = null;
        if(vehicleStarted){
            status = tyres.stop();
        }else{
            logger.log(Level.SEVERE,"Vehicle not started to perform the" +
                    " operation");
        }*/
        /*logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);*/
        return tyres.stop();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }


}
