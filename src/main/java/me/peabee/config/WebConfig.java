package me.peabee.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * Created by pengbo on 18-4-24.
 */
@Configuration
public class WebConfig {
//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//
//        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
//
//        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
//
//        return new HttpMessageConverters(converter);
//
//    }
}
