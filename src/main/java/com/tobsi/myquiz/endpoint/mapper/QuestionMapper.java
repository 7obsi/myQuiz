package com.tobsi.myquiz.endpoint.mapper;

import com.tobsi.myquiz.endpoint.dto.QuestionDto;
import com.tobsi.myquiz.entity.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {
    QuestionDto entityToDto(Question entity);
    Question dtoToEntity(QuestionDto dto);
    List<QuestionDto> entityListToDto(List<Question> entity);
    List<Question> dtoListToEntity(List<QuestionDto> dto);
}
