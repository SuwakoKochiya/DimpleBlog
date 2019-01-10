package com.dimple.service;

import com.dimple.bean.UserOnline;

import java.util.List;

/**
 * @author : Dimple
 * @version : 1.0
 * @class : SessionService
 * @description :
 * @date : 01/09/19 20:53
 */
public interface SessionService {
    List<UserOnline> getList();

    boolean forceLogout(String sessionId);
}
