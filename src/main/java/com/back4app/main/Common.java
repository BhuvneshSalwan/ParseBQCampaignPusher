package com.back4app.main;

import java.util.ArrayList;

import org.bson.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.back4app.entities.Campaign;
import com.back4app.mongo.MongoDAO;
import com.back4app.mongoOperation.MongoOp;
import com.hibernate.factory.BuildFactory;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class Common {

	public void createCampaign() throws JSONException{
		
		ArrayList<Document> getCampaigns = MongoOp.getCampaignData(1);
		
		System.out.println(getCampaigns.size());
		
		if(getCampaigns.size() > 0){
		
			SessionFactory factory = BuildFactory.getFactory();	
			
			Session sessionTruncate = BuildFactory.getFactory().openSession();
			sessionTruncate.beginTransaction();
			sessionTruncate.createSQLQuery("TRUNCATE TABLE api_data.parse_campaign_data;").executeUpdate();
			sessionTruncate.getTransaction().commit();
			sessionTruncate.close();
			
			System.out.println(factory);
			
			for(Document campaign : getCampaigns){
				
				Campaign sqlCampaign = new Campaign();
				
				System.out.println("The client object id outside is : "+campaign.getString("_id"));
				
				if(campaign.containsKey("ad_text")){
					sqlCampaign.setAd_text(campaign.getString("ad_text"));
				}else{
					sqlCampaign.setAd_text(null);
				}
				
				if(campaign.containsKey("campaign_name")){
					sqlCampaign.setCampaign_name(campaign.getString("campaign_name"));
				}else{
					sqlCampaign.setCampaign_name(null);
				}
				
				if(campaign.containsKey("client_id")){
					sqlCampaign.setClient_id(campaign.getString("client_id"));
				}else{
					sqlCampaign.setClient_id(null);
				}
				
				if(campaign.containsKey("_created_at")){
					sqlCampaign.setCreatedAt(campaign.getDate("_created_at"));
				}else{
					sqlCampaign.setCreatedAt(null);
				}
				
				if(campaign.containsKey("description1")){
					sqlCampaign.setDescription1(campaign.getString("description1"));
				}else{
					sqlCampaign.setDescription1(null);
				}
				
				if(campaign.containsKey("description2")){
					sqlCampaign.setDescription2(campaign.getString("description2"));
				}else{
					sqlCampaign.setDescription2(null);
				}
				
				if(campaign.containsKey("description3")){
					sqlCampaign.setDescription3(campaign.getString("description3"));
				}else{
					sqlCampaign.setDescription3(null);
				}
				
				if(campaign.containsKey("description4")){
					sqlCampaign.setDescription4(campaign.getString("description4"));
				}else{
					sqlCampaign.setDescription4(null);
				}
				
				if(campaign.containsKey("description5")){
					sqlCampaign.setDescription5(campaign.getString("description5"));
				}else{
					sqlCampaign.setDescription5(null);
				}
				
				if(campaign.containsKey("description6")){
					sqlCampaign.setDescription6(campaign.getString("description6"));
				}else{
					sqlCampaign.setDescription6(null);
				}
				
				if(campaign.containsKey("description7")){
					sqlCampaign.setDescription7(campaign.getString("description7"));
				}else{
					sqlCampaign.setDescription7(null);
				}
				
				if(campaign.containsKey("description8")){
					sqlCampaign.setDescription8(campaign.getString("description8"));
				}else{
					sqlCampaign.setDescription8(null);
				}
				
				if(campaign.containsKey("description9")){
					sqlCampaign.setDescription9(campaign.getString("description9"));
				}else{
					sqlCampaign.setDescription9(null);
				}
				
				if(campaign.containsKey("description10")){
					sqlCampaign.setDescription10(campaign.getString("description10"));
				}else{
					sqlCampaign.setDescription10(null);
				}
				
				if(campaign.containsKey("ext_id")){
					sqlCampaign.setExt_id(campaign.getString("ext_id"));
				}else{
					sqlCampaign.setExt_id(null);
				}
				
				if(campaign.containsKey("gender")){
					sqlCampaign.setGender(campaign.getString("gender"));
				}else{
					sqlCampaign.setGender(null);
				}
				
				if(campaign.containsKey("landing_page_url1")){
					sqlCampaign.setLanding_page_url1(campaign.getString("landing_page_url1"));
				}else{
					sqlCampaign.setLanding_page_url1(null);
				}
				
				if(campaign.containsKey("landing_page_url2")){
					sqlCampaign.setLanding_page_url2(campaign.getString("landing_page_url2"));
				}else{
					sqlCampaign.setLanding_page_url2(null);
				}
				
				if(campaign.containsKey("landing_page_url3")){
					sqlCampaign.setLanding_page_url3(campaign.getString("landing_page_url3"));
				}else{
					sqlCampaign.setLanding_page_url3(null);
				}
				
				if(campaign.containsKey("landing_page_url4")){
					sqlCampaign.setLanding_page_url4(campaign.getString("landing_page_url4"));
				}else{
					sqlCampaign.setLanding_page_url4(null);
				}
				
				if(campaign.containsKey("landing_page_url5")){
					sqlCampaign.setLanding_page_url5(campaign.getString("landing_page_url5"));
				}else{
					sqlCampaign.setLanding_page_url5(null);
				}
				
				if(campaign.containsKey("landing_page_url6")){
					sqlCampaign.setLanding_page_url6(campaign.getString("landing_page_url6"));
				}else{
					sqlCampaign.setLanding_page_url6(null);
				}
				
				if(campaign.containsKey("landing_page_url7")){
					sqlCampaign.setLanding_page_url7(campaign.getString("landing_page_url7"));
				}else{
					sqlCampaign.setLanding_page_url7(null);
				}
				
				if(campaign.containsKey("landing_page_url8")){
					sqlCampaign.setLanding_page_url8(campaign.getString("landing_page_url8"));
				}else{
					sqlCampaign.setLanding_page_url8(null);
				}
				
				if(campaign.containsKey("landing_page_url9")){
					sqlCampaign.setLanding_page_url9(campaign.getString("landing_page_url9"));
				}else{
					sqlCampaign.setLanding_page_url9(null);
				}
				
				if(campaign.containsKey("landing_page_url10")){
					sqlCampaign.setLanding_page_url10(campaign.getString("landing_page_url10"));
				}else{
					sqlCampaign.setLanding_page_url10(null);
				}
				
				if(campaign.containsKey("min_age")){
					
					try{
						sqlCampaign.setMin_age(campaign.getInteger("min_age"));
					}catch(Exception e){
						sqlCampaign.setMin_age(campaign.getLong("min_age").intValue());
					}
					
				}else{
					sqlCampaign.setMin_age(0);
				}
				
				if(campaign.containsKey("max_age")){
					
					try{
						sqlCampaign.setMax_age(campaign.getInteger("max_age"));
					}catch(Exception e){
						sqlCampaign.setMax_age(campaign.getLong("max_age").intValue());
					}
					
				}else{
					sqlCampaign.setMax_age(0);
				}
				
				if(campaign.containsKey("name1")){
					sqlCampaign.setName1(campaign.getString("name1"));
				}else{
					sqlCampaign.setName1(null);
				}
				
				if(campaign.containsKey("name2")){
					sqlCampaign.setName2(campaign.getString("name2"));
				}else{
					sqlCampaign.setName2(null);
				}
				
				if(campaign.containsKey("name3")){
					sqlCampaign.setName3(campaign.getString("name3"));
				}else{
					sqlCampaign.setName3(null);
				}
				
				if(campaign.containsKey("name4")){
					sqlCampaign.setName4(campaign.getString("name4"));
				}else{
					sqlCampaign.setName4(null);
				}
				
				if(campaign.containsKey("name5")){
					sqlCampaign.setName5(campaign.getString("name5"));
				}else{
					sqlCampaign.setName5(null);
				}
				
				if(campaign.containsKey("name6")){
					sqlCampaign.setName6(campaign.getString("name6"));
				}else{
					sqlCampaign.setName6(null);
				}
				
				if(campaign.containsKey("name7")){
					sqlCampaign.setName7(campaign.getString("name7"));
				}else{
					sqlCampaign.setName7(null);
				}
				
				if(campaign.containsKey("name8")){
					sqlCampaign.setName8(campaign.getString("name8"));
				}else{
					sqlCampaign.setName8(null);
				}
				
				if(campaign.containsKey("name9")){
					sqlCampaign.setName9(campaign.getString("name9"));
				}else{
					sqlCampaign.setName9(null);
				}
				
				if(campaign.containsKey("name10")){
					sqlCampaign.setName10(campaign.getString("name10"));
				}else{
					sqlCampaign.setName10(null);
				}
				
				if(campaign.containsKey("_id")){
					sqlCampaign.setObjectId(campaign.getString("_id"));
				}else{
					sqlCampaign.setObjectId(null);
				}
				
				if(campaign.containsKey("plan_duration")){
					
					try{
						sqlCampaign.setPlan_duration(campaign.getInteger("plan_duration"));
					}catch(Exception e){
						sqlCampaign.setPlan_duration(campaign.getLong("plan_duration").intValue());
					}
				
				}else{
					sqlCampaign.setPlan_duration(0);
				}
				
				if(campaign.containsKey("plan_id")){
					
					try{
						sqlCampaign.setPlan_id(campaign.getInteger("plan_id"));
					}catch(Exception e){
						sqlCampaign.setPlan_id(campaign.getLong("plan_id").intValue());
					}
					
				}else{
					sqlCampaign.setPlan_id(0);
				}
				
				if(campaign.containsKey("preview_link")){
					sqlCampaign.setPreview_link(campaign.getString("preview_link"));
				}else{
					sqlCampaign.setPreview_link(null);
				}
				
				if(campaign.containsKey("product_id1")){
					sqlCampaign.setProduct_id1(campaign.getString("product_id1"));
				}else{
					sqlCampaign.setProduct_id1(null);
				}
				
				if(campaign.containsKey("product_id2")){
					sqlCampaign.setProduct_id2(campaign.getString("product_id2"));
				}else{
					sqlCampaign.setProduct_id2(null);
				}
				
				if(campaign.containsKey("product_id3")){
					sqlCampaign.setProduct_id3(campaign.getString("product_id3"));
				}else{
					sqlCampaign.setProduct_id3(null);
				}
				
				if(campaign.containsKey("product_id4")){
					sqlCampaign.setProduct_id4(campaign.getString("product_id4"));
				}else{
					sqlCampaign.setProduct_id4(null);
				}
				
				if(campaign.containsKey("product_id5")){
					sqlCampaign.setProduct_id5(campaign.getString("product_id5"));
				}else{
					sqlCampaign.setProduct_id5(null);
				}
				
				if(campaign.containsKey("product_id6")){
					sqlCampaign.setProduct_id6(campaign.getString("product_id6"));
				}else{
					sqlCampaign.setProduct_id6(null);
				}
				
				if(campaign.containsKey("product_id7")){
					sqlCampaign.setProduct_id7(campaign.getString("product_id7"));
				}else{
					sqlCampaign.setProduct_id7(null);
				}
				
				if(campaign.containsKey("product_id8")){
					sqlCampaign.setProduct_id8(campaign.getString("product_id8"));
				}else{
					sqlCampaign.setProduct_id8(null);
				}
				
				if(campaign.containsKey("product_id9")){
					sqlCampaign.setProduct_id9(campaign.getString("product_id9"));
				}else{
					sqlCampaign.setProduct_id9(null);
				}
				
				if(campaign.containsKey("product_id10")){
					sqlCampaign.setProduct_id10(campaign.getString("product_id10"));
				}else{
					sqlCampaign.setProduct_id10(null);
				}
				
				if(campaign.containsKey("product_image_url1")){
					sqlCampaign.setProduct_image_url1(campaign.getString("product_image_url1"));
				}else{
					sqlCampaign.setProduct_image_url1(null);
				}
				
				if(campaign.containsKey("product_image_url2")){
					sqlCampaign.setProduct_image_url2(campaign.getString("product_image_url2"));
				}else{
					sqlCampaign.setProduct_image_url2(null);
				}
				
				if(campaign.containsKey("product_image_url3")){
					sqlCampaign.setProduct_image_url3(campaign.getString("product_image_url3"));
				}else{
					sqlCampaign.setProduct_image_url3(null);
				}
				
				if(campaign.containsKey("product_image_url4")){
					sqlCampaign.setProduct_image_url4(campaign.getString("product_image_url4"));
				}else{
					sqlCampaign.setProduct_image_url4(null);
				}
				
				if(campaign.containsKey("product_image_url5")){
					sqlCampaign.setProduct_image_url5(campaign.getString("product_image_url5"));
				}else{
					sqlCampaign.setProduct_image_url5(null);
				}
				
				if(campaign.containsKey("product_image_url6")){
					sqlCampaign.setProduct_image_url6(campaign.getString("product_image_url6"));
				}else{
					sqlCampaign.setProduct_image_url6(null);
				}
				
				if(campaign.containsKey("product_image_url7")){
					sqlCampaign.setProduct_image_url7(campaign.getString("product_image_url7"));
				}else{
					sqlCampaign.setProduct_image_url7(null);
				}
				
				if(campaign.containsKey("product_image_url8")){
					sqlCampaign.setProduct_image_url8(campaign.getString("product_image_url8"));
				}else{
					sqlCampaign.setProduct_image_url8(null);
				}
				
				if(campaign.containsKey("product_image_url9")){
					sqlCampaign.setProduct_image_url9(campaign.getString("product_image_url9"));
				}else{
					sqlCampaign.setProduct_image_url9(null);
				}
				
				if(campaign.containsKey("product_image_url10")){
					sqlCampaign.setProduct_image_url10(campaign.getString("product_image_url10"));
				}else{
					sqlCampaign.setProduct_image_url10(null);
				}
				
				if(campaign.containsKey("product_type")){
					sqlCampaign.setProduct_type(campaign.getString("product_type"));
				}else{
					sqlCampaign.setProduct_type(null);
				}
				
				if(campaign.containsKey("products")){
					
					System.out.println(campaign.get("products"));
					
					ArrayList<Document> products = (ArrayList<Document>) campaign.get("products");
					
					JSONArray productArr = new JSONArray();
					
					for(Document product : products){
					
						productArr.put(new JSONObject(product.toJson()));
						
					}
						
					sqlCampaign.setProducts(productArr.toString());
				
				}else{
					sqlCampaign.setProducts(null);
				}
				
				if(campaign.containsKey("referrer")){
					sqlCampaign.setReferrer(campaign.getString("referrer"));
				}else{
					sqlCampaign.setReferrer(null);
				}
				
				if(campaign.containsKey("rule")){
					sqlCampaign.setRule(campaign.getString("rule"));
				}else{
					sqlCampaign.setRule(null);
				}
				
				if(campaign.containsKey("specific_targeting")){
	
					try{
						sqlCampaign.setSpecific_targeting(campaign.getInteger("specific_targeting"));
					}catch(Exception e){
						sqlCampaign.setSpecific_targeting(campaign.getLong("specific_targeting").intValue());
					}
					
				}else{
					sqlCampaign.setSpecific_targeting(0);
				}
				
				if(campaign.containsKey("status")){
					try{
							sqlCampaign.setStatus(campaign.getInteger("status"));
					}catch(Exception e){
							sqlCampaign.setStatus(campaign.getLong("status").intValue());
					}
				}else{
					sqlCampaign.setStatus(0);
				}
				
				if(campaign.containsKey("status_reason")){
					sqlCampaign.setStatus_reason(campaign.getString("status_reason"));
				}else{
					sqlCampaign.setStatus_reason(null);
				}
				
				if(campaign.containsKey("type")){
					
					try{
						sqlCampaign.setType(campaign.getInteger("type"));
					}catch(Exception e){
						sqlCampaign.setType(campaign.getLong("type").intValue());
					}
				}else{
					sqlCampaign.setType(0);
				}
				
				if(campaign.containsKey("_updated_at")){
					sqlCampaign.setUpdatedAt(campaign.getDate("_updated_at"));
				}else{
					sqlCampaign.setUpdatedAt(null);
				}
						
				Session session = BuildFactory.getFactory().openSession();
				session.beginTransaction();
					
				int CampaignIDMySQL = (Integer) session.save(sqlCampaign);
					
				System.out.println("Campaign Created with Campaign ID : "+CampaignIDMySQL);
			
				session.getTransaction().commit();
				
				session.close();
				
			}
			
		}else{
			System.out.println("No Creation is requested in Parse.");
		}
		
	}
}