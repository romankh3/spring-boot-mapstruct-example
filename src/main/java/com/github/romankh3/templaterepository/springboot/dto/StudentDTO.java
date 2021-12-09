package com.github.romankh3.templaterepository.springboot.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {

    private Long id;

    private String name;

    private List<LectureDTO> lectures;

    private List<LecturerDTO> lecturers;
}
