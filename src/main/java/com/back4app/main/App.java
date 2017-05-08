package com.back4app.main;

import com.back4app.mongo.MongoDAO;

public class App 
{
    public static void main( String[] args )
    {
    	Common common = new Common();
		try{
			common.createCampaign();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		MongoDAO.database = null;
		MongoDAO.collection = null;
		MongoDAO.client.close();
    }
}
