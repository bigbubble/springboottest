package me.peabee.service;

import me.peabee.dao.model.Country;

import java.util.List;

/**
 * <p>
 *
 * </p >
 *
 * @author pengb
 * @since 2018-11-12 11:05
 */
public interface CountryService {
    /**
     * 测试Mybatis
     * @return
     */
    List<Country> getAllCountry();

    /**
     * 测试对象类型redisTemplate
     * @param code
     * @return
     */
    Country getCountry(String code);

    /**
     * 测试StringRedisTemplate
     * @param contryName
     * @return
     */
    String getCountryCode(String contryName);
}
