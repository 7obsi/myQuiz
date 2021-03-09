package com.tobsi.myquiz.endpoint.mapper;

import com.tobsi.myquiz.endpoint.dto.AnswerDto;
import com.tobsi.myquiz.entity.Answer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnswerMapper {
    AnswerDto entityToDto(Answer entity);
    Answer dtoToEntity(AnswerDto dto);
    List<AnswerDto> entityListToDto(List<Answer> entity);
    List<Answer> dtoListToEntity(List<AnswerDto> dto);
}
