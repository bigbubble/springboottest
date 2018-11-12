package me.peabee.service.impl;

import me.peabee.dao.mapper.CountryMapper;
import me.peabee.dao.model.Country;
import me.peabee.dao.model.CountryExample;
import me.peabee.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *
 * </p >
 *
 * @author pengb
 * @since 2018-11-12 11:08
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public List<Country> getAllCountry() {
        return countryMapper.selectByExample(new CountryExample());
    }

    @Override
    public Country getCountry(String code) {
        Country country =  (Country) redisTemplate.opsForValue().get(code);
        if(country == null) {
            country = countryMapper.selectByPrimaryKey(code);
            if(country != null) {
                redisTemplate.opsForValue().set(code, country);
            }
        }
        return country;
    }

    @Override
    public String getCountryCode(String contryName) {
        String code = stringRedisTemplate.opsForValue().get(contryName);
        if(code == null) {
            code = countryMapper.selectCodeByName(contryName);
            if(code != null) {
                stringRedisTemplate.opsForValue().set(contryName, code);
            }
        }
        return code;
    }
}
