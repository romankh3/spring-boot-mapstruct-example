package com.github.romankh3.templaterepository.springboot.mapper;

import com.github.romankh3.templaterepository.springboot.dto.StudentDTO;
import com.github.romankh3.templaterepository.springboot.model.LectureModel;
import com.github.romankh3.templaterepository.springboot.model.LecturerModel;
import com.github.romankh3.templaterepository.springboot.model.StudentModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Integration-level testing for {@link StudentMapper}.
 */
@SpringBootTest
class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void shouldProperlyMapStudentToDto() {
        //given
        StudentModel studentModel = new StudentModel();
        studentModel.setId(1L);
        studentModel.setName("Ivan");

        LectureModel lectureModel = new LectureModel();
        lectureModel.setId(2L);
        lectureModel.setName("Matan");

        studentModel.setLectures(singletonList(lectureModel));

        LecturerModel lecturerModel = new LecturerModel();

        lecturerModel.setId(3L);
        lecturerModel.setName("Vladimir Kirillovich");

        studentModel.setLecturers(singletonList(lecturerModel));

        //when
        StudentDTO studentDTO = studentMapper.toDTO(studentModel);

        //then
        assertNotNull(studentDTO);
        assertEquals(1L, studentDTO.getId());
        assertEquals("Ivan", studentDTO.getName());

        assertEquals(1, studentDTO.getLecturers().size());
        assertEquals(2L, studentDTO.getLectures().get(0).getId());
        assertEquals("Matan", studentDTO.getLectures().get(0).getName());

        assertEquals(1, studentDTO.getLectures().size());
        assertEquals(3L, studentDTO.getLecturers().get(0).getId());
        assertEquals("Vladimir Kirillovich", studentDTO.getLecturers().get(0).getName());
    }
}
