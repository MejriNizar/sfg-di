package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    public GreetingService greetingService;
    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService( GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreting(){
        return greetingService.sayGreeting();
    }
}
