package com.crodriguezt.webhookapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping(value = "/public")
public class PublicController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/webhook", method = RequestMethod.POST)
    public ResponseEntity webhook(HttpServletRequest httpServletRequest, @RequestBody Map<String, Object> data){
        log.info("Ini webhook");
        log.info("Data: " + data);

        return ResponseEntity.ok(null);
    }


    @RequestMapping(value = "/webhook", method = RequestMethod.GET)
    public ResponseEntity webhookTest(HttpServletRequest httpServletRequest){
        log.info("Ini webhook");


        return ResponseEntity.ok(null);
    }
}