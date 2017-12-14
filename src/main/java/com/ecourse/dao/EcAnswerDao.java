package com.ecourse.dao;

import com.ecourse.entity.EcAnswer;

import java.util.List;

/**
 * @author tomato
 * @create 2017-12-14 上午9:10
 */
public interface EcAnswerDao {

    /**
     * 保存
     * @param ecAnswer  保存数据
     */
    public void saveEcAnswer(EcAnswer ecAnswer);

    /**
     * 更具ID查找
     * @param id key
     * @return 返回ID对应的对象，没有查找到为null
     */
    public EcAnswer findEcAnswerById(Integer id);

    /**
     * 其他查找
     * @param params 查找的属性
     * @param hql 查找的hql语句
     * @return 一堆EcAnswer对象
     */
    public List<EcAnswer> findEcAnswer(List<Object> params, String hql);

    /**
     * 更新EcAnswer
     * @param ecAnswer 需要更新的EcAnswer持久化对象
     */
    public void updateEcAnswer(EcAnswer ecAnswer);

    /**
     * 删除EcAnswer
     * @param ecAnswer 需要删除的EcAnswer
     */
    public void deletEcAnswer(EcAnswer ecAnswer);
}
