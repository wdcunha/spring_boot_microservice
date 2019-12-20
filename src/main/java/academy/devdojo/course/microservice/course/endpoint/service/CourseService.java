package academy.devdojo.course.microservice.course.endpoint.service;

import academy.devdojo.course.microservice.core.model.Course;
import academy.devdojo.course.microservice.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable) {
        log.info("Listing all microservices- courses");
        return courseRepository.findAll(pageable);
    }
}
