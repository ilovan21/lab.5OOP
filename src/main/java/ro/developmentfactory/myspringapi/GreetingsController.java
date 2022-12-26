package ro.developmentfactory.myspringapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping(path="/api/v1/greetings")
public class GreetingsController {

    @GetMapping(path="hello")
    public String hello(){
        return"Hello I'm a SpringBoot Application";
    }

    @GetMapping(path="goodbye")
    public String goodbye(){
        return "Bye, bye, see you around soon";
    }

}
