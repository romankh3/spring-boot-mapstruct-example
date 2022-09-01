package com.github.romankh3.templaterepository.springboot.mapper;

import com.github.romankh3.templaterepository.springboot.dto.LecturerDTO;
import com.github.romankh3.templaterepository.springboot.model.LecturerModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LecturerMapper {

    LecturerDTO toDTO(LecturerModel model);

    LecturerModel toModel(LecturerDTO dto);
}
