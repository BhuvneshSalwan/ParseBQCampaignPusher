package com.back4app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "parse_campaign_data")
public class Campaign {
	
	public String getString() {
		return "Campaign [id=" + id + ", objectId=" + objectId + ", gender=" + gender + ", products=" + products
				+ ", specific_targeting=" + specific_targeting + ", max_age=" + max_age + ", landing_page_url10="
				+ landing_page_url10 + ", is_updated_adset=" + is_updated_adset + ", is_updated=" + is_updated
				+ ", name1=" + name1 + ", product_id1=" + product_id1 + ", name2=" + name2 + ", product_id2="
				+ product_id2 + ", name3=" + name3 + ", product_id3=" + product_id3 + ", name4=" + name4
				+ ", product_id4=" + product_id4 + ", cities=" + cities + ", ad_text=" + ad_text
				+ ", landing_page_url1=" + landing_page_url1 + ", product_type=" + product_type + ", product_id10="
				+ product_id10 + ", name10=" + name10 + ", plan_duration=" + plan_duration + ", name5=" + name5
				+ ", product_id5=" + product_id5 + ", landing_page_url2=" + landing_page_url2 + ", name6=" + name6
				+ ", product_id6=" + product_id6 + ", landing_page_url3=" + landing_page_url3 + ", name7=" + name7
				+ ", product_id7=" + product_id7 + ", landing_page_url4=" + landing_page_url4 + ", name8=" + name8
				+ ", product_id8=" + product_id8 + ", landing_page_url5=" + landing_page_url5 + ", updatedAt="
				+ updatedAt + ", name9=" + name9 + ", product_id9=" + product_id9 + ", landing_page_url6="
				+ landing_page_url6 + ", client_id=" + client_id + ", landing_page_url7=" + landing_page_url7
				+ ", landing_page_url8=" + landing_page_url8 + ", plan_id=" + plan_id + ", preview_link=" + preview_link
				+ ", status_reason=" + status_reason + ", landing_page_url9=" + landing_page_url9 + ", min_age="
				+ min_age + ", status=" + status + ", description1=" + description1 + ", product_image_url1="
				+ product_image_url1 + ", description2=" + description2 + ", product_image_url2=" + product_image_url2
				+ ", description3=" + description3 + ", product_image_url3=" + product_image_url3 + ", description4="
				+ description4 + ", product_image_url4=" + product_image_url4 + ", description5=" + description5
				+ ", ext_id=" + ext_id + ", campaign_name=" + campaign_name + ", product_image_url10="
				+ product_image_url10 + ", product_image_url5=" + product_image_url5 + ", type=" + type
				+ ", description6=" + description6 + ", createdAt=" + createdAt + ", product_image_url6="
				+ product_image_url6 + ", description10=" + description10 + ", description7=" + description7
				+ ", is_updated_ad=" + is_updated_ad + ", product_image_url7=" + product_image_url7 + ", rule=" + rule
				+ ", description8=" + description8 + ", product_image_url8=" + product_image_url8 + ", description9="
				+ description9 + ", product_image_url9=" + product_image_url9 + ", referrer=" + referrer + "]";
	}
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "objectId")
	private String objectId;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "products")
	private String products;
	
	@Column(name = "specific_targeting")
	private int specific_targeting;
	
	@Column(name = "max_age")
	private int max_age;
	
	@Column(name = "landing_page_url10")
	private String landing_page_url10;
	
	@Column(name = "is_updated_adset")
	private int is_updated_adset;
	
	@Column(name = "is_updated")
	private int is_updated;
	
	@Column(name = "name1")
	private String name1;
	
	@Column(name = "product_id1")
	private String product_id1;
	
	@Column(name = "name2")
	private String name2;
	
	@Column(name = "product_id2")
	private String product_id2;
	
	@Column(name = "name3")
	private String name3;
	
	@Column(name = "product_id3")
	private String product_id3;
	
	@Column(name = "name4")
	private String name4;
	
	@Column(name = "product_id4")
	private String product_id4;
	
	@Column(name = "cities")
	private String cities;
	
	@Column(name = "ad_text")
	private String ad_text;
	
	@Column(name = "landing_page_url1")
	private String landing_page_url1;
	
	@Column(name = "product_type")
	private String product_type;
	
	@Column(name = "product_id10")
	private String product_id10;
	
	@Column(name = "name10")
	private String name10;
	
	@Column(name = "plan_duration")
	private int plan_duration;
	
	@Column(name = "name5")
	private String name5;
	
	@Column(name = "product_id5")
	private String product_id5;
	
	@Column(name = "landing_page_url2")
	private String landing_page_url2;
	
	@Column(name = "name6")
	private String name6;
	
	@Column(name = "product_id6")
	private String product_id6;
	
	@Column(name = "landing_page_url3")
	private String landing_page_url3;
	
	@Column(name = "name7")
	private String name7;
	
	@Column(name = "product_id7")
	private String product_id7;
	
	@Column(name = "landing_page_url4")
	private String landing_page_url4;
	
	@Column(name = "name8")
	private String name8;
	
	@Column(name = "product_id8")
	private String product_id8;
	
	@Column(name = "landing_page_url5")
	private String landing_page_url5;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedAt")
	private Date updatedAt;
	
	@Column(name = "name9")
	private String name9;
	
	@Column(name = "product_id9")
	private String product_id9;
	
	@Column(name = "landing_page_url6")
	private String landing_page_url6;
	
	@Column(name = "client_id")
	private String client_id;
	
	@Column(name = "landing_page_url7")
	private String landing_page_url7;
	
	@Column(name = "landing_page_url8")
	private String landing_page_url8;
	
	@Column(name = "plan_id")
	private int plan_id;
	
	@Column(name = "preview_link")
	private String preview_link;
	
	@Column(name = "status_reason")
	private String status_reason;
	
	@Column(name = "landing_page_url")
	private String landing_page_url9;
	
	@Column(name = "min_age")
	private int min_age;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "description1")
	private String description1;
	
	@Column(name = "product_image_url1")
	private String product_image_url1;
	
	@Column(name = "description2")
	private String description2;
	
	@Column(name = "product_image_url2")
	private String product_image_url2;
	
	@Column(name = "description3")
	private String description3;
	
	@Column(name = "product_image_url3")
	private String product_image_url3;
	
	@Column(name = "description4")
	private String description4;
	
	@Column(name = "product_image_url4")
	private String product_image_url4;
	
	@Column(name = "description5")
	private String description5;
	
	@Column(name = "ext_id")
	private String ext_id;
	
	@Column(name = "campaign_name")
	private String campaign_name;
	
	@Column(name = "product_image_url10")
	private String product_image_url10;
	
	@Column(name = "product_image_url5")
	private String product_image_url5;
	
	@Column(name = "type")
	private int type;
	
	@Column(name = "description6")
	private String description6;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdAt")
	private Date createdAt;
	
	@Column(name = "product_image_url6")
	private String product_image_url6;
	
	@Column(name = "description10")
	private String description10;
	
	@Column(name = "description7")
	private String description7;
	
	@Column(name = "is_updated_ad")
	private int is_updated_ad;
	
	@Column(name = "product_image_url7")
	private String product_image_url7;
	
	@Column(name = "rule")
	private String rule;
	
	@Column(name = "description8")
	private String description8;
	
	@Column(name = "product_image_url8")
	private String product_image_url8;
	
	@Column(name = "description9")
	private String description9;
	
	@Column(name = "product_image_url9")
	private String product_image_url9;
	
	@Column(name = "referrer")
	private String referrer;
	
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public int getSpecific_targeting() {
		return specific_targeting;
	}
	public void setSpecific_targeting(int specific_targeting) {
		this.specific_targeting = specific_targeting;
	}
	public int getMax_age() {
		return max_age;
	}
	public void setMax_age(int max_age) {
		this.max_age = max_age;
	}
	public String getLanding_page_url10() {
		return landing_page_url10;
	}
	public void setLanding_page_url10(String landing_page_url10) {
		this.landing_page_url10 = landing_page_url10;
	}
	public int getIs_updated_adset() {
		return is_updated_adset;
	}
	public void setIs_updated_adset(int is_updated_adset) {
		this.is_updated_adset = is_updated_adset;
	}
	public int getIs_updated() {
		return is_updated;
	}
	public void setIs_updated(int is_updated) {
		this.is_updated = is_updated;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getProduct_id1() {
		return product_id1;
	}
	public void setProduct_id1(String product_id1) {
		this.product_id1 = product_id1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getProduct_id2() {
		return product_id2;
	}
	public void setProduct_id2(String product_id2) {
		this.product_id2 = product_id2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public String getProduct_id3() {
		return product_id3;
	}
	public void setProduct_id3(String product_id3) {
		this.product_id3 = product_id3;
	}
	public String getName4() {
		return name4;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public String getProduct_id4() {
		return product_id4;
	}
	public void setProduct_id4(String product_id4) {
		this.product_id4 = product_id4;
	}
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public String getAd_text() {
		return ad_text;
	}
	public void setAd_text(String ad_text) {
		this.ad_text = ad_text;
	}
	public String getLanding_page_url1() {
		return landing_page_url1;
	}
	public void setLanding_page_url1(String landing_page_url1) {
		this.landing_page_url1 = landing_page_url1;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getProduct_id10() {
		return product_id10;
	}
	public void setProduct_id10(String product_id10) {
		this.product_id10 = product_id10;
	}
	public String getName10() {
		return name10;
	}
	public void setName10(String name10) {
		this.name10 = name10;
	}
	public int getPlan_duration() {
		return plan_duration;
	}
	public void setPlan_duration(int plan_duration) {
		this.plan_duration = plan_duration;
	}
	public String getName5() {
		return name5;
	}
	public void setName5(String name5) {
		this.name5 = name5;
	}
	public String getProduct_id5() {
		return product_id5;
	}
	public void setProduct_id5(String product_id5) {
		this.product_id5 = product_id5;
	}
	public String getLanding_page_url2() {
		return landing_page_url2;
	}
	public void setLanding_page_url2(String landing_page_url2) {
		this.landing_page_url2 = landing_page_url2;
	}
	public String getName6() {
		return name6;
	}
	public void setName6(String name6) {
		this.name6 = name6;
	}
	public String getProduct_id6() {
		return product_id6;
	}
	public void setProduct_id6(String product_id6) {
		this.product_id6 = product_id6;
	}
	public String getLanding_page_url3() {
		return landing_page_url3;
	}
	public void setLanding_page_url3(String landing_page_url3) {
		this.landing_page_url3 = landing_page_url3;
	}
	public String getName7() {
		return name7;
	}
	public void setName7(String name7) {
		this.name7 = name7;
	}
	public String getProduct_id7() {
		return product_id7;
	}
	public void setProduct_id7(String product_id7) {
		this.product_id7 = product_id7;
	}
	public String getLanding_page_url4() {
		return landing_page_url4;
	}
	public void setLanding_page_url4(String landing_page_url4) {
		this.landing_page_url4 = landing_page_url4;
	}
	public String getName8() {
		return name8;
	}
	public void setName8(String name8) {
		this.name8 = name8;
	}
	public String getProduct_id8() {
		return product_id8;
	}
	public void setProduct_id8(String product_id8) {
		this.product_id8 = product_id8;
	}
	public String getLanding_page_url5() {
		return landing_page_url5;
	}
	public void setLanding_page_url5(String landing_page_url5) {
		this.landing_page_url5 = landing_page_url5;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getName9() {
		return name9;
	}
	public void setName9(String name9) {
		this.name9 = name9;
	}
	public String getProduct_id9() {
		return product_id9;
	}
	public void setProduct_id9(String product_id9) {
		this.product_id9 = product_id9;
	}
	public String getLanding_page_url6() {
		return landing_page_url6;
	}
	public void setLanding_page_url6(String landing_page_url6) {
		this.landing_page_url6 = landing_page_url6;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getLanding_page_url7() {
		return landing_page_url7;
	}
	public void setLanding_page_url7(String landing_page_url7) {
		this.landing_page_url7 = landing_page_url7;
	}
	public String getLanding_page_url8() {
		return landing_page_url8;
	}
	public void setLanding_page_url8(String landing_page_url8) {
		this.landing_page_url8 = landing_page_url8;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public String getPreview_link() {
		return preview_link;
	}
	public void setPreview_link(String preview_link) {
		this.preview_link = preview_link;
	}
	public String getStatus_reason() {
		return status_reason;
	}
	public void setStatus_reason(String status_reason) {
		this.status_reason = status_reason;
	}
	public String getLanding_page_url9() {
		return landing_page_url9;
	}
	public void setLanding_page_url9(String landing_page_url9) {
		this.landing_page_url9 = landing_page_url9;
	}
	public int getMin_age() {
		return min_age;
	}
	public void setMin_age(int min_age) {
		this.min_age = min_age;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription1() {
		return description1;
	}
	public void setDescription1(String description1) {
		this.description1 = description1;
	}
	public String getProduct_image_url1() {
		return product_image_url1;
	}
	public void setProduct_image_url1(String product_image_url1) {
		this.product_image_url1 = product_image_url1;
	}
	public String getDescription2() {
		return description2;
	}
	public void setDescription2(String description2) {
		this.description2 = description2;
	}
	public String getProduct_image_url2() {
		return product_image_url2;
	}
	public void setProduct_image_url2(String product_image_url2) {
		this.product_image_url2 = product_image_url2;
	}
	public String getDescription3() {
		return description3;
	}
	public void setDescription3(String description3) {
		this.description3 = description3;
	}
	public String getProduct_image_url3() {
		return product_image_url3;
	}
	public void setProduct_image_url3(String product_image_url3) {
		this.product_image_url3 = product_image_url3;
	}
	public String getDescription4() {
		return description4;
	}
	public void setDescription4(String description4) {
		this.description4 = description4;
	}
	public String getProduct_image_url4() {
		return product_image_url4;
	}
	public void setProduct_image_url4(String product_image_url4) {
		this.product_image_url4 = product_image_url4;
	}
	public String getDescription5() {
		return description5;
	}
	public void setDescription5(String description5) {
		this.description5 = description5;
	}
	public String getExt_id() {
		return ext_id;
	}
	public void setExt_id(String ext_id) {
		this.ext_id = ext_id;
	}
	public String getCampaign_name() {
		return campaign_name;
	}
	public void setCampaign_name(String campaign_name) {
		this.campaign_name = campaign_name;
	}
	public String getProduct_image_url10() {
		return product_image_url10;
	}
	public void setProduct_image_url10(String product_image_url10) {
		this.product_image_url10 = product_image_url10;
	}
	public String getProduct_image_url5() {
		return product_image_url5;
	}
	public void setProduct_image_url5(String product_image_url5) {
		this.product_image_url5 = product_image_url5;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDescription6() {
		return description6;
	}
	public void setDescription6(String description6) {
		this.description6 = description6;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getProduct_image_url6() {
		return product_image_url6;
	}
	public void setProduct_image_url6(String product_image_url6) {
		this.product_image_url6 = product_image_url6;
	}
	public String getDescription10() {
		return description10;
	}
	public void setDescription10(String description10) {
		this.description10 = description10;
	}
	public String getDescription7() {
		return description7;
	}
	public void setDescription7(String description7) {
		this.description7 = description7;
	}
	public int getIs_updated_ad() {
		return is_updated_ad;
	}
	public void setIs_updated_ad(int is_updated_ad) {
		this.is_updated_ad = is_updated_ad;
	}
	public String getProduct_image_url7() {
		return product_image_url7;
	}
	public void setProduct_image_url7(String product_image_url7) {
		this.product_image_url7 = product_image_url7;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public String getDescription8() {
		return description8;
	}
	public void setDescription8(String description8) {
		this.description8 = description8;
	}
	public String getProduct_image_url8() {
		return product_image_url8;
	}
	public void setProduct_image_url8(String product_image_url8) {
		this.product_image_url8 = product_image_url8;
	}
	public String getDescription9() {
		return description9;
	}
	public void setDescription9(String description9) {
		this.description9 = description9;
	}
	public String getProduct_image_url9() {
		return product_image_url9;
	}
	public void setProduct_image_url9(String product_image_url9) {
		this.product_image_url9 = product_image_url9;
	}
	public String getReferrer() {
		return referrer;
	}
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

}
