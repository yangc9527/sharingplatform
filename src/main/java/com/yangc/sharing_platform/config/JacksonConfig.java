package com.yangc.sharing_platform.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.text.SimpleDateFormat;

@Configuration
public class JacksonConfig {

    @Bean
    @Primary
    public ObjectMapper jacksonMapper(Jackson2ObjectMapperBuilder builder) {

        ObjectMapper objectMapper = builder.createXmlMapper(false).build();

        //配置只有非空属性记性序列化（"" 和 NULL 都不进行序列化）
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        //无法识别属性不进行反序列化
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //配置时间格式
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);

        return objectMapper;
    }

}
