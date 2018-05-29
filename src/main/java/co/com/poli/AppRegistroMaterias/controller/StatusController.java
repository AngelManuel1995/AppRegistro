package co.com.poli.AppRegistroMaterias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author angel
 */
@RestController
@RequestMapping(value = "/")
public class StatusController {
    @GetMapping("/status")
    public String status(){
        return "server running";
    }
}
