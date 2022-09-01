package com.github.romankh3.templaterepository.springboot.mapper;

import com.github.romankh3.templaterepository.springboot.dto.StudentDTO;
import com.github.romankh3.templaterepository.springboot.model.StudentModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = {LectureListMapper.class, LecturerListMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface StudentMapper {

    StudentDTO toDTO(StudentModel model);

    StudentModel toModel(StudentDTO dto);
}
