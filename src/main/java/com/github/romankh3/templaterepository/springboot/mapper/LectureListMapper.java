package com.github.romankh3.templaterepository.springboot.mapper;

import com.github.romankh3.templaterepository.springboot.dto.LectureDTO;
import com.github.romankh3.templaterepository.springboot.model.LectureModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = LectureMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LectureListMapper {
    List<LectureModel> toModelList(List<LectureDTO> dtos);
    List<LectureDTO> toDTOList(List<LectureModel> models);
}
