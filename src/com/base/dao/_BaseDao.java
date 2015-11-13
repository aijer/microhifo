package com.base.dao;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.base.bean.*;


/** 基本的增改删查（分页查询  范例查询  HQl删除  按范例删除）
 *  #使用了泛型--有待完善(log 错误cathch)
 * @author Administrator
 *
 * @param <T>
 */
public class _BaseDao<T> extends HibernateDaoSupport{
	
	//更新 保存之前的历史记录
	public boolean save(T domain){
		try{
		getHibernateTemplate().save(domain);
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	
	//增加或更新
	public boolean merge(T domain){
		try{
		getHibernateTemplate().clear();
		getHibernateTemplate().merge(domain); 
		getHibernateTemplate().flush();
		
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
/**
 * 分页查询
 * @param hql
 * @param offset
 * @param pageSize
 * @return 分页查询
 */
	public List<T> findByPage(final String hql, final int offset,	final int pageSize) {
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(org.hibernate.Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				query.setFirstResult(offset);
				query.setMaxResults(pageSize);
				List list = query.list();
				
				if(session!=null){		//一定要手动关闭sesion
					session.close();
					session=null;
		           }
				return list;
			}
		});
		return list;

	}
	
	//Hql查询
	public List<T> findByHql(String hql){
		List<T> list=getHibernateTemplate().find(hql);
		return list;
	}

	//按条件查询
	public  List<T> findByExample(T domain){
		return getHibernateTemplate().findByExample(domain);
		
	}
	

	
	//按范例条件删除
	public void deleteByExample(T domain){
		List<T> list=this.findByExample(domain);
		for(T t:list){
			getHibernateTemplate().delete(t);
		}

	}
	
	//按HQL条件删除  如：delete from TableName
	public void deleteByHql(String hql){
		Query q=this.getSession().createQuery(hql);
		q.executeUpdate();
	}

	
	
	
}
