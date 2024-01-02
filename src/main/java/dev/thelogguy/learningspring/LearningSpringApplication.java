package dev.thelogguy.learningspring;

import dev.thelogguy.learningspring.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(LearningSpringApplication.class, args);
//        GamingConsole mario = new Mario();
//        GameRunner runner = new GameRunner(mario);
        GameRunner runner = applicationContext.getBean(GameRunner.class);
        runner.run();
    }

}
