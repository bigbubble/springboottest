package me.peabee.service.impl;

import me.peabee.dao.mapper.KbsSubjectMapper;
import me.peabee.dao.model.KbsSubject;
import me.peabee.service.KbsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pengbo on 18-4-24.
 */
@Service
public class KbsSubjectServiceImpl implements KbsSubjectService{
    @Autowired
    private KbsSubjectMapper kbsSubjectMapper;

    @Override
    public KbsSubject getById(Integer id) {
        return kbsSubjectMapper.selectByPrimaryKey(id);
    }
}
