package me.peabee.dao.mapper;

import java.util.List;
import me.peabee.dao.model.KbsSubject;
import me.peabee.dao.model.KbsSubjectExample;
import org.apache.ibatis.annotations.Param;

public interface KbsSubjectMapper {
    int countByExample(KbsSubjectExample example);

    int deleteByExample(KbsSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KbsSubject record);

    int insertSelective(KbsSubject record);

    List<KbsSubject> selectByExample(KbsSubjectExample example);

    KbsSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KbsSubject record, @Param("example") KbsSubjectExample example);

    int updateByExample(@Param("record") KbsSubject record, @Param("example") KbsSubjectExample example);

    int updateByPrimaryKeySelective(KbsSubject record);

    int updateByPrimaryKey(KbsSubject record);
}