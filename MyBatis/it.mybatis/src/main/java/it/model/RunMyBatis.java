package it.model;

public class RunMyBatis {
	public static void main(String[] Args) {
		VillageDAO villageDAO = new VillageDAO();
		
		// Insert
		Village village = new Village();
		Village villageDTO = new Village();
		village.setId(1);
		village.setName("Comacchio");
		village.setDistrict("Ferrara");
		
		villageDTO.setId(10);
		villageDTO.setName("Rovigo");
		villageDTO.setDistrict("Padova");
		
		//villageDAO.saveVillage(village);
		//villageDAO.saveVillage(villageDTO);
		
		//Update data
		Village village2 =  new Village();
		village2.setId(1);
		village2.setName("Sta Maria Madelena");
		village2.setDistrict("Padova");
		
		//villageDAO.update(village2);
		
		//get village
		
		Village villageD = new Village();
		
		//villageD = villageDAO.getVillage(5);
		//System.out.println("ID: " + villageD.getId() + " " + "Nome : " + villageD.getName() + " District : " + villageD.getDistrict() );
		
		//Delete user 
		
		villageDAO.delete(5);
	}
}
