package com.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface S2TMapper {
    @Mapping(target = "targetField", source = "sourceField")
    Target map(Source source);
}
