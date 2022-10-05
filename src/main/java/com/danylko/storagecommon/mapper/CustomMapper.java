package com.danylko.storagecommon.mapper;

import org.springframework.stereotype.Component;

@Component
public interface CustomMapper {

    String writeValueAsString(Object obj);
    <T> T readeValueFromString(String str, Class<T> obj);
}
