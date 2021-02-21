package edu.eci.arsw.app.fitbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class FitbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitbookApplication.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }

}
