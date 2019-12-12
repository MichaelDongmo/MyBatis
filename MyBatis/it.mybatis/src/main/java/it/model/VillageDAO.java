package it.model;

import org.apache.ibatis.session.SqlSession;

public class VillageDAO {
	// Insert new village in table
	public void saveVillage(Village village) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("it.model.VillageMapper.insertVillage", village);
		System.out.println("Insert success...");
		session.commit();
		session.close();
	}

	// Update village

	public void update(Village village) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("it.model.VillageMapper.updateVillage", village);
		System.out.println("Update success...");
		session.commit();
		session.close();
	}

	// Delete village

	public void delete(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.delete("it.model.VillageMapper.deleteVillage", id);
		System.out.println("Delete success...");
		session.commit();
		session.close();
	}

	// get all Village
	public Village getVillage(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Village village = session.selectOne("it.model.VillageMapper.selectVillage", id);
		session.close();
		return village;
	}
}
