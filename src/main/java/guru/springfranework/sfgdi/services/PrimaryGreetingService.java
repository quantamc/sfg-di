package guru.springfranework.sfgdi.services;

public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
