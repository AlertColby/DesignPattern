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
	 * �������ڼ�������ŵ�¼��Ա��Ȩ����Ϣ
	 * ��webӦ���У���Щ����ͨ����浽session��
	 */
	private Map<String , Collection<AuthorizationModel>> map = new HashMap<>();
	
	/**
	 * ģ���¼�Ĺ���
	 */
	public void login(String user) {
		//��¼ʱ���û�����Ϣ�����ݿ�ȡ�������浽������ȥ
		Collection<AuthorizationModel> col = queryByUser(user);
		map.put(user, col);
	}
	
	/**
	 * �ж�ĳ���û���ĳ����ȫʵ���Ƿ����ĳ��Ȩ��
	 * @param user
	 * @param securityEntity
	 * @param permit
	 * @return
	 */
	public boolean hasPermit(String user , String securityEntity , String permit) {
		Collection<AuthorizationModel> col = map.get(user);
		if( col == null || col.size() == 0) {
			System.out.println(user + "�û�û�е�¼��û���κ�Ȩ��");
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
	 * �����ݿ��л�ȡĳ����ӵ�е�Ȩ��
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
