package com.ecourse.service;

import com.ecourse.entity.EcAnswer;

import java.util.List;
import java.util.Map;

/**
 * @author tomato
 * @create 2017-12-14 上午9:36
 */
public interface EcAnswerService {

    public void saveEcAnswer(EcAnswer ecAnswer);

    public EcAnswer findEcAnswerById(Integer id);

    public List<EcAnswer> findEcAnswer(Map<String, Object> map);

    public void updateEcAnswer(EcAnswer ecAnswer);

    public void deletEcAnswer(EcAnswer ecAnswer);
}