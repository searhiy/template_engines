package examples;

import org.springframework.stereotype.Service;

@Service
public class EngineService {

    public String printHelloWord() {
        String greating = "Hello World";
        System.out.println( "Hello World!" );
        return greating;
    }

}
