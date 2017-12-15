package com.java1234.dao;

import java.util.Map;

import com.java1234.entity.MemberShip;

/**
 * 用户角色关联Dao
 * @author user
 *
 */
public interface MemberShipDao {

	/**
	 * 用户登录
	 * @param map
	 * @return
	 */
	public MemberShip login(Map<String,Object> map);
	
	/**
	 * 删除指定用户所有角色
	 * @param userId
	 * @return
	 */
	public int deleteAllGroupsByUserId(String userId);
	
	/**
	 * 添加用户权限
	 * @param memberShip
	 * @return
	 */
	public int add(MemberShip memberShip);
}
