package com.ecourse.service.impl;

import com.ecourse.dao.EcAnswerDao;
import com.ecourse.entity.EcAnswer;
import com.ecourse.service.EcAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author tomato
 * @create 2017-12-14 上午9:39
 */
@Service("EcAnswer")
public class EcAnswerServiceImpl implements EcAnswerService {

    @Autowired
    private EcAnswerDao ecAnswerDao;

    public void saveEcAnswer(EcAnswer ecAnswer) {
        ecAnswerDao.saveEcAnswer(ecAnswer);
    }

    public EcAnswer findEcAnswerById(Integer id) {
        return ecAnswerDao.findEcAnswerById(id);
    }

    public List<EcAnswer> findEcAnswer(Map<String, Object> map) {
        StringBuilder hql = new StringBuilder("from EcAnswer where 1=1 ");
        List<Object> params = new LinkedList<Object>();

        if (map.get("userId") != null) {
            hql.append(" and userId=? ");
            params.add(map.get("userId"));
        }
        if (map.get("testId") != null) {
            hql.append(" and testId=? ");
            params.add(map.get("testId"));
        }
        if (map.get("queId") != null) {
            hql.append(" and queId=? ");
            params.add(map.get("queId"));
        }
        if (map.get("ansAnswer") != null) {
            hql.append(" and ansAnswer=? ");
            params.add(map.get("ansAnswer"));
        }
        //System.out.println(hql.toString());
        return ecAnswerDao.findEcAnswer(params, hql.toString());
    }

    public void updateEcAnswer(EcAnswer ecAnswer) {
        ecAnswerDao.updateEcAnswer(ecAnswer);
    }

    public void deletEcAnswer(EcAnswer ecAnswer) {
        ecAnswerDao.deletEcAnswer(ecAnswer);
    }
}
