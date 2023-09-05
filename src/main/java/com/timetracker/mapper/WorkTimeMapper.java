package com.timetracker.mapper;

import com.timetracker.dao.WorkTime;
import com.timetracker.dto.WorkTimeDto;
import com.timetracker.service.WorkerService;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {WorkerService.class})
public interface WorkTimeMapper {

    @Mapping(source = "workerDto.id", target = "worker")
    WorkTime toEntity(WorkTimeDto workTimeDto);

    @Mapping(source = "worker", target = "workerDto")
    WorkTimeDto toDto(WorkTime workTime);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    WorkTime partialUpdate(WorkTimeDto workTimeDto, @MappingTarget WorkTime workTime);
}
