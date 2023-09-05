package com.timetracker.mapper;

import com.timetracker.dao.User;
import com.timetracker.dto.UserDto;
import com.timetracker.service.TeamService;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
uses = TeamService.class)
public interface UserMapper {
    @Mapping(source = "id", target = "teams")
    User toEntity(UserDto userDto);

    UserDto toDto(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(UserDto userDto, @MappingTarget User user);
}
