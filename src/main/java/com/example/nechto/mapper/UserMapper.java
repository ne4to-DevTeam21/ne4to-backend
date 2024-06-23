package com.example.nechto.mapper;

import com.example.nechto.dto.User;
import com.example.nechto.model.UserEntity;
import org.mapstruct.*;

@Mapper(
        uses = { JsonNullableMapper.class, ReferenceMapper.class },
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class UserMapper {
    @Mapping(target = "id", source = "userId")
    public abstract UserEntity map(User dto);

    @Mapping(source = "id", target = "userId")
    public abstract User map(UserEntity model);

}
