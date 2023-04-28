package co.helloController.springDeploy_helloController;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class SpringDeployHelloControllerApplicationTests {

    @Test
    void contextLoads() {
        System.getenv().forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
    }

}
