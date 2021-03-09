package com.tobsi.myquiz.endpoint.mapper;

import com.tobsi.myquiz.endpoint.dto.QuizDto;
import com.tobsi.myquiz.entity.Quiz;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuizMapper {
    QuizDto entityToDto(Quiz entity);
    Quiz dtoToEntity(QuizDto dto);
    List<QuizDto> entityListToDto(List<Quiz> entity);
    List<Quiz> dtoListToEntity(List<QuizDto> dto);
}
