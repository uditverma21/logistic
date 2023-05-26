package com.logistic.logistic.entities;

public class Load {
	
	private long loadid;
	private String loadingpoint;
	private String unloadingpoint;
	private String producttype;
	private String trucktype;
	private long weight;
	private long nooftrucks;
	private String shipperid;
	private String date;
	
	public Load(long loadid, String loadingpoint, String unloadingpoint, String producttype, String trucktype,
			long weight, long nooftrucks, String shipperid, String date) {
		super();
		this.loadid = loadid;
		this.loadingpoint = loadingpoint;
		this.unloadingpoint = unloadingpoint;
		this.producttype = producttype;
		this.trucktype = trucktype;
		this.weight = weight;
		this.nooftrucks = nooftrucks;
		this.shipperid = shipperid;
		this.date = date;
	}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getLoadid() {
		return loadid;
	}

	public void setLoadid(long loadid) {
		this.loadid = loadid;
	}

	public String getLoadingpoint() {
		return loadingpoint;
	}

	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}

	public String getUnloadingpoint() {
		return unloadingpoint;
	}

	public void setUnloadingpoint(String unloadingpoint) {
		this.unloadingpoint = unloadingpoint;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public String getTrucktype() {
		return trucktype;
	}

	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getNooftrucks() {
		return nooftrucks;
	}

	public void setNooftrucks(long nooftrucks) {
		this.nooftrucks = nooftrucks;
	}

	public String getShipperid() {
		return shipperid;
	}

	public void setShipperid(String shipperid) {
		this.shipperid = shipperid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Load [loadid=" + loadid + ", loadingpoint=" + loadingpoint + ", unloadingpoint=" + unloadingpoint
				+ ", producttype=" + producttype + ", trucktype=" + trucktype + ", weight=" + weight + ", nooftrucks="
				+ nooftrucks + ", shipperid=" + shipperid + ", date=" + date + ", getLoadid()=" + getLoadid()
				+ ", getLoadingpoint()=" + getLoadingpoint() + ", getUnloadingpoint()=" + getUnloadingpoint()
				+ ", getProducttype()=" + getProducttype() + ", getTrucktype()=" + getTrucktype() + ", getWeight()="
				+ getWeight() + ", getNooftrucks()=" + getNooftrucks() + ", getShipperid()=" + getShipperid()
				+ ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
