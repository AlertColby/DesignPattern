package com.chen.demoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityMgr {
	
	private static SecurityMgr securityMgr = new SecurityMgr();
	
	private SecurityMgr() {
		
	}
	
	public static SecurityMgr getInstance() {
		return securityMgr;
	}
	
	/**
	 * 在运行期间用来存放登录人员的权限信息
	 * 在web应用中，这些数据通常会存到session中
	 */
	private Map<String , Collection<AuthorizationModel>> map = new HashMap<>();
	
	/**
	 * 模拟登录的功能
	 */
	public void login(String user) {
		//登录时把用户的信息从数据库取出来，存到缓存中去
		Collection<AuthorizationModel> col = queryByUser(user);
		map.put(user, col);
	}
	
	/**
	 * 判断某个用户对某个安全实体是否具有某个权限
	 * @param user
	 * @param securityEntity
	 * @param permit
	 * @return
	 */
	public boolean hasPermit(String user , String securityEntity , String permit) {
		Collection<AuthorizationModel> col = map.get(user);
		if( col == null || col.size() == 0) {
			System.out.println(user + "用户没有登录或没有任何权限");
			return false;
		}
		for( AuthorizationModel authorizationModel : col) {
			System.out.println("authorizationModel==" + authorizationModel);
			if( authorizationModel.getSecurityEntity().equals( securityEntity ) && authorizationModel.getPermit().equals( permit )) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 从数据库中获取某人所拥有的权限
	 * @param user
	 * @return
	 */
	private Collection<AuthorizationModel> queryByUser(String user){
		Collection<AuthorizationModel> col = new ArrayList<>();
		for( String s : TestDB.colDb ) {
			String ss[] = s.split(",");
			if(ss[0].equals(user)) {
				AuthorizationModel authorizationModel = new AuthorizationModel();
				authorizationModel.setUser(ss[0]);
				authorizationModel.setSecurityEntity(ss[1]);
				authorizationModel.setPermit(ss[2]);
				col.add(authorizationModel);
			}
		}
		return col;
	}
	

}
