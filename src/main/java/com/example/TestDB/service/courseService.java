package com.example.TestDB.service;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class courseService {
    // @Autowired
    // private CourseRepository courseRepository;
    // private static final CourseMapperImp courseMapperImp = new CourseMapperImp();

    // public CourseDTO createcourseDTO(CourseDTO courseDTO) {

    //     Course course = Course.builder().courseID(courseDTO.getCourseID()).NationalID(courseDTO.getNationalID())
    //             .Eduid(courseDTO.getEduid()).cr(courseDTO.getCr()).nameCourse(courseDTO.getNameCourse())
    //             .addedBy(courseDTO.getAddedBy()).nameInstittion(courseDTO.getNameInstittion())
    //             .courseAttch(courseDTO.getCourseAttch()).EndDate(courseDTO.getEndDate())

    //             .build();
    //     Course saveCourse = courseRepository.save(course);
    //     return courseMapperImp.domainToDto(saveCourse);
    // }

}
