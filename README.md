# SpringBoot Mapstruct testing example

## Overview
Project can be used as an example of how to add Mapstruct to the project and how can be used.

Next, Project for demonstrating how can be added unit tests for Mapstruct Mappers with SpringBoot.
Also, it is used to show the problems in testing mappers with `SpringBootTest` [in post](https://javarush.ru/groups/posts/3698) 

In general, we can see, how Mapstruct can help us to map complicated POJOs, here we have next POJO:

```Java
public class StudentDTO {
    private Long id;
    private String name;
    private List<LectureDTO> lectures;
    private List<LecturerDTO> lecturers;
}

// with LectureDTO
public class LectureDTO {
    private Long id;
    private String name;
}
//and LecturerDTO
public class LecturerDTO {
    private Long id;
    private String name;
}
```

Mapstruct helps us to map it to models and back without creating a lot of code for it.
```java
public class StudentModel {
    private Long id;
    private String name;
    private List<LectureModel> lectures;
    private List<LecturerModel> lecturers;
}

//with LectureModel
public class LectureModel {
    private Long id;
    private String name;
}

//and LecturerModel
public class LecturerModel {
    private Long id;
    private String name;
}
```

## Building
mvn clean package

## Troubleshooting
...

## Release Notes
Please, follow [RELEASE_NOTES](RELEASE_NOTES.md).

## Authors
* Roman Beskrovnyi - [romankh3](https://github.com/romankh3)

## Acknowledgments
...

## Contributing
Please, follow [Contributing](CONTRIBUTING.md) page.

## Code of Conduct
Please, follow [Code of Conduct](CODE_OF_CONDUCT.md) page.

## License
This project is Apache License 2.0 - see the [LICENSE](LICENSE) file for details
