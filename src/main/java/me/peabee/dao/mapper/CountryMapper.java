package me.peabee.dao.mapper;

import java.util.List;

import me.peabee.dao.model.Country;
import me.peabee.dao.model.CountryExample;
import org.apache.ibatis.annotations.Param;

public interface CountryMapper {
    int countByExample(CountryExample example);

    int deleteByExample(CountryExample example);

    int deleteByPrimaryKey(String code);

    int insert(Country record);

    int insertSelective(Country record);

    List<Country> selectByExample(CountryExample example);

    Country selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    String selectCodeByName(@Param("name") String contryName);
}