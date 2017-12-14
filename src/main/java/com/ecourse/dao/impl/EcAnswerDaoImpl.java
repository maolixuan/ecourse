package com.ecourse.dao.impl;

import com.ecourse.dao.EcAnswerDao;
import com.ecourse.entity.EcAnswer;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tomato
 * @create 2017-12-14 上午9:29
 */

@Repository
public class EcAnswerDaoImpl extends BaseDaoImpl implements EcAnswerDao {

    /**
     * 保存
     * @param ecAnswer  保存数据
     */
    public void saveEcAnswer(EcAnswer ecAnswer) {
        getSession().save(ecAnswer);
    }

    /**
     * 更具ID查找
     * @param id key
     * @return 返回ID对应的对象，没有查找到为null
     */
    public EcAnswer findEcAnswerById(Integer id) {
        String hql = "from EcAnswer where ansId=?";
        Query query = getSession().createQuery(hql);
        query.setParameter(0, id);
        return (EcAnswer) query.uniqueResult();
    }

    /**
     * 其他查找
     * @param params 查找的属性
     * @param hql 查找的hql语句
     * @return 一堆EcAnswer对象
     */
    @SuppressWarnings("unchecked")
    public List<EcAnswer> findEcAnswer(List<Object> params, String hql) {
        Query query = getSession().createQuery(hql);
        if (params != null && params.size() > 0) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i, params.get(i));
            }
        }
        return query.list();
    }

    /**
     * 更新EcAnswer
     * @param ecAnswer 需要更新的EcAnswer持久化对象
     */
    public void updateEcAnswer(EcAnswer ecAnswer) {
        getSession().update(ecAnswer);
    }

    /**
     * 删除EcAnswer
     * @param ecAnswer 需要删除的EcAnswer
     */
    public void deletEcAnswer(EcAnswer ecAnswer) {
        getSession().delete(ecAnswer);
    }
}
