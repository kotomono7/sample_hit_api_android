package com.example.samplehitapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataPlnPrepaid {
	@SerializedName("trx")
	@Expose
	private TrxPlnPrepaid trx;

	public void setTrx(TrxPlnPrepaid trx){
		this.trx = trx;
	}

	public TrxPlnPrepaid getTrx(){
		return trx;
	}

	@Override
 	public String toString(){
		return 
			"DataPlnPrepaid{" +
			"trx = '" + trx + '\'' + 
			"}";
		}
}
