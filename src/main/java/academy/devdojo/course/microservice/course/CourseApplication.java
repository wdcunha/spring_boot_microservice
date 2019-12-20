package academy.devdojo.course.microservice.course;

import academy.devdojo.course.microservice.core.property.JwtConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"academy.devdojo.course.microservice.core.model"})
@EnableJpaRepositories({"academy.devdojo.course.microservice.core.repository"})
@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("academy.devdojo.course")
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

}
