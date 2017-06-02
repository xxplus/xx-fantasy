package com.fantasy.xxblog.service;

import com.fantasy.xxbase.dao.BaseDao;
import com.fantasy.xxbase.service.BaseServiceImpl;
import com.fantasy.xxblog.entity.BlogAccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 17/02/17.
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<BlogAccountEntity, String> implements AccountService {


    @Autowired
    public void setBaseDao(BaseDao<BlogAccountEntity, String> baseDao) {
        super.setBaseDao(baseDao);
    }

}
