package examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test-config.xml"})
public class EngineServiceTest {

    @Autowired
    private EngineService engineService;

    @Test
    public void testPrintHelloWord(){
        Assert.assertNotNull(engineService.printHelloWord());
    }
}
