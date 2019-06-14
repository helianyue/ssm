package com.juxcel.disc.service.impl;

import com.juxcel.disc.entity.Question;
import com.juxcel.disc.mapper.QuestionMapper;
import com.juxcel.disc.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionMapper questionMapper;

    @Override
    public List<Question> selectAll() {
        return questionMapper.selectAll();
    }
}
