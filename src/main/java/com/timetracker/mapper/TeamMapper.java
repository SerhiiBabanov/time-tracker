package com.timetracker.mapper;

import com.timetracker.dao.Team;
import com.timetracker.dto.TeamDto;
import com.timetracker.service.UserService;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = {UserService.class})
public interface TeamMapper {
    @Mapping(source = "userId", target = "user")
    Team toEntity(TeamDto teamDto);

    @AfterMapping
    default void linkWorkers(@MappingTarget Team team) {
        team.getWorkers().forEach(worker -> worker.setTeam(team));
    }

    @Mapping(source = "team.user.id", target = "userId")
    TeamDto toDto(Team team);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Team partialUpdate(TeamDto teamDto, @MappingTarget Team team);
}
