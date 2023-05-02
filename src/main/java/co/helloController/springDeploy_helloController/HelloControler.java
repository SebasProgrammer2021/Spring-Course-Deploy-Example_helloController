package co.helloController.springDeploy_helloController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

//    para usar variables de entorno archivo
    @Value("${app.message}")
    String message;

    //    para usar variables de entorno del gitlab por ejmplo
//    @Value("${app.varexample}")
//    String envVarUsername;


    @GetMapping("/hello")
    public String holamundo()
    {
        System.out.println("message = " + message);
//        System.out.println("envVarUsername = " + envVarUsername);
        return "Hello World page new";
    }

    @GetMapping("/")
    public String getTemplate(){

        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
                  </head>
                  <body>
                    <h1>Hello!</h1>
                    <h1>This my example API deployed</h1>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
                  </body>
                </html>
                """;
    }
}
