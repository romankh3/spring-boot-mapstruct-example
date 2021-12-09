package com.github.romankh3.templaterepository.springboot.mapper;

import com.github.romankh3.templaterepository.springboot.dto.LectureDTO;
import com.github.romankh3.templaterepository.springboot.model.LectureModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LectureMapper {
    LectureDTO toDTO(LectureModel model);

    LectureModel toModel(LectureDTO dto);
}
