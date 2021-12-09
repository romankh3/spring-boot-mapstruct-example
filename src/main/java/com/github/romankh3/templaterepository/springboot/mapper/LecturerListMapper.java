package com.github.romankh3.templaterepository.springboot.mapper;

import com.github.romankh3.templaterepository.springboot.dto.LecturerDTO;
import com.github.romankh3.templaterepository.springboot.model.LecturerModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = LecturerMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LecturerListMapper {
    List<LecturerModel> toModelList(List<LecturerDTO> dloList);
    List<LecturerDTO> toDTOList(List<LecturerModel> modelList);
}
