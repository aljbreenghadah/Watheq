package com.example.TestDB.mapper;

import com.example.TestDB.dto.CourseDTO;
import com.example.TestDB.model.Course;


public interface CourseMapper {

	Course dtoToDomain(final CourseDTO course );

	CourseDTO domainToDto(final Course course  );
}
