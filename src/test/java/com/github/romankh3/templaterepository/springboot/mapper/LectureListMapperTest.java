package com.github.romankh3.templaterepository.springboot.mapper;

import com.github.romankh3.templaterepository.springboot.dto.LectureDTO;
import com.github.romankh3.templaterepository.springboot.model.LectureModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

/**
 * Unit-level testing for {@link LectureMapper}.
 */
class LectureListMapperTest {

    private final LectureListMapper lectureListMapper = new LectureListMapperImpl(new LectureMapperImpl());

    @Test
    void shouldProperlyMapListDtosToListModels() {
        //given
        LectureDTO dto = new LectureDTO();
        dto.setId(12L);
        dto.setName("I'm BATMAN!");

        List<LectureDTO> dtos = Collections.singletonList(dto);

        //when
        List<LectureModel> models = lectureListMapper.toModelList(dtos);

        //then
        Assertions.assertNotNull(models);
        Assertions.assertEquals(1, models.size());
        Assertions.assertEquals(dto.getId(), models.get(0).getId());
        Assertions.assertEquals(dto.getName(), models.get(0).getName());
    }
}
