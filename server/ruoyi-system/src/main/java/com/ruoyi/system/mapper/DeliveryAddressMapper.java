package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DeliveryAddress;

/**
 * 用户地址管理Mapper接口
 * 
 * @author lslwypjjz
 * @date 2021-05-06
 */
public interface DeliveryAddressMapper 
{
    /**
     * 查询用户地址管理
     * 
     * @param addressId 用户地址管理ID
     * @return 用户地址管理
     */
    public DeliveryAddress selectDeliveryAddressById(Long addressId);

    /**
     * 查询用户地址管理列表
     * 
     * @param deliveryAddress 用户地址管理
     * @return 用户地址管理集合
     */
    public List<DeliveryAddress> selectDeliveryAddressList(DeliveryAddress deliveryAddress);

    /**
     * 新增用户地址管理
     * 
     * @param deliveryAddress 用户地址管理
     * @return 结果
     */
    public int insertDeliveryAddress(DeliveryAddress deliveryAddress);

    /**
     * 修改用户地址管理
     * 
     * @param deliveryAddress 用户地址管理
     * @return 结果
     */
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress);

    /**
     * 删除用户地址管理
     * 
     * @param addressId 用户地址管理ID
     * @return 结果
     */
    public int deleteDeliveryAddressById(Long addressId);

    /**
     * 批量删除用户地址管理
     * 
     * @param addressIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeliveryAddressByIds(Long[] addressIds);
}
