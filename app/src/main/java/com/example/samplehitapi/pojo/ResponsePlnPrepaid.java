package com.example.samplehitapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponsePlnPrepaid{
	@SerializedName("data")
	@Expose
	private DataPlnPrepaid data;

	public void setData(DataPlnPrepaid data){
		this.data = data;
	}

	public DataPlnPrepaid getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePlnPrepaid{" + 
			"data = '" + data + '\'' + 
			"}";
		}
}
