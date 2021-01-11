package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ProopertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello world --- Property";
    }

}
