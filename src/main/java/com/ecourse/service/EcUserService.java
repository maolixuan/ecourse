package com.ecourse.service;

import com.ecourse.entity.EcUser;

import java.util.List;
import java.util.Map;

/**
 * @author tomato
 * @create 2017-12-14 下午11:17
 */
public interface EcUserService {

    public void saveEcUser(EcUser ecUser);

    public EcUser findEcUserById(Integer id);

    public EcUser findEcUserByLogin(Integer id, String password);

    public List<EcUser> findEcUser(Map<String, Object> map);

    public void updateEcUser(EcUser ecUser);

    public void deletEcUser(EcUser ecUser);
}
