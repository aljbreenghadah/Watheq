package com.example.TestDB.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.TestDB.dto.CourseDTO;
import com.example.TestDB.mapper.CourseMapper;
import com.example.TestDB.model.Course;


public class CourseMapperImp implements CourseMapper{



	ModelMapper modelMapper;

	public CourseMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Course dtoToDomain(CourseDTO course) {
		return modelMapper.map(course,Course.class );

	}


	@Override
	public  CourseDTO domainToDto(Course course) {
		return modelMapper.map(course,CourseDTO.class );

 

}}
