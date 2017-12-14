package com.ecourse.dao.impl;

import com.ecourse.dao.EcUserDao;
import com.ecourse.entity.EcUser;
import com.ecourse.entity.EcUser;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tomato
 * @create 2017-12-14 下午11:10
 */
@Repository
public class EcUserDaoImpl extends BaseDaoImpl implements EcUserDao {
    
    public void saveEcUser(EcUser ecUser) {
        getSession().save(ecUser);
    }

    public EcUser findEcUserById(Integer id) {
        String hql = "from EcUser where userId=?";
        Query query = getSession().createQuery(hql);
        query.setParameter(0, id);
        return (EcUser) query.uniqueResult();
    }

    public EcUser findEcUserByLogin(Integer id, String password) {
        String hql = "from EcUser where userId=? and userPassword=?";
        Query query = getSession().createQuery(hql);
        query.setParameter(0, id);
        query.setParameter(1, password);
        return (EcUser) query.uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<EcUser> findEcUser(List<Object> params, String hql) {
        Query query = getSession().createQuery(hql);
        if (params != null && params.size() > 0) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i, params.get(i));
            }
        }
        return query.list();
    }

    public void updateEcUser(EcUser ecUser) {
        getSession().update(ecUser);
    }

    public void deletEcUser(EcUser ecUser) {
        getSession().delete(ecUser);
    }
}
