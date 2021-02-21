package edu.eci.arsw.app.fitbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FitbookApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(FitbookApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
