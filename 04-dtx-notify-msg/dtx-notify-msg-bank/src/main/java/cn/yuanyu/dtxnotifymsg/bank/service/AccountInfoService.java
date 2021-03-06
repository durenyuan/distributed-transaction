package cn.yuanyu.dtxnotifymsg.bank.service;


import cn.yuanyu.dtxnotifymsg.bank.entity.AccountInfo;
import cn.yuanyu.dtxnotifymsg.bank.model.AccountChangeEvent;
import cn.yuanyu.dtxnotifymsg.pay.entity.AccountPay;

import java.util.List;

public interface AccountInfoService {


    /**
     * 更新账户金额
     *
     * @param accountChange
     */
    void updateAccountBalance(AccountChangeEvent accountChange);


    /**
     * 查询充值结果（远程调用）
     *
     * @param txNo 事务号
     */
    AccountPay queryPayResult(String txNo);


    /**
     * 查询所有用户
     */
    List<AccountInfo> getAllUserInfo();

    /**
     * 根据用户名查询用户
     *
     * @param accountName 用户名（唯一）
     */
    AccountInfo getUserInfoByName(String accountName);
}
