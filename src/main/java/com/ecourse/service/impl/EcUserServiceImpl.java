package com.ecourse.service.impl;

import com.ecourse.dao.EcUserDao;
import com.ecourse.entity.EcUser;
import com.ecourse.service.EcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author tomato
 * @create 2017-12-14 下午11:18
 */
@Service("EcUser")
public class EcUserServiceImpl implements EcUserService {

    @Autowired
    private EcUserDao ecUserDao;

    public void saveEcUser(EcUser ecUser) {
        ecUserDao.saveEcUser(ecUser);
    }

    public EcUser findEcUserById(Integer id) {
        return ecUserDao.findEcUserById(id);
    }

    public EcUser findEcUserByLogin(Integer id, String password) {
        return ecUserDao.findEcUserByLogin(id, password);
    }

    public List<EcUser> findEcUser(Map<String, Object> map) {
        StringBuilder hql = new StringBuilder("from EcUser where 1=1 ");
        List<Object> params = new LinkedList<Object>();

        if (map.get("userSchool") != null) {
            hql.append(" and userSchool=? ");
            params.add(map.get("userSchool"));
        }
        if (map.get("userSex") != null) {
            hql.append(" and userSex=? ");
            params.add(map.get("userSex"));
        }
        if (map.get("userNum") != null) {
            hql.append(" and userNum=? ");
            params.add(map.get("userNum"));
        }
        if (map.get("userName") != null) {
            hql.append(" and userName=? ");
            params.add(map.get("userName"));
        }

        //System.out.println(hql.toString());
        return ecUserDao.findEcUser(params, hql.toString());
    }

    public void updateEcUser(EcUser ecUser) {
        ecUserDao.updateEcUser(ecUser);
    }

    public void deletEcUser(EcUser ecUser) {
        ecUserDao.deletEcUser(ecUser);
    }
}
