package com.timetracker.mapper;

import com.timetracker.dao.Worker;
import com.timetracker.dto.WorkerDto;
import com.timetracker.service.TeamService;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {TeamService.class})
public interface WorkerMapper {
    @Mapping(source = "teamId", target = "team")
    Worker toEntity(WorkerDto workerDto);

    @Mapping(source = "worker.team.id", target = "teamId")
    WorkerDto toDto(Worker worker);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Worker partialUpdate(WorkerDto workerDto, @MappingTarget Worker worker);
}
