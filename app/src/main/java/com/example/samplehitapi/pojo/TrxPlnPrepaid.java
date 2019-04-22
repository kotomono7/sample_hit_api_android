package com.example.samplehitapi.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrxPlnPrepaid {
	@SerializedName("merchant_code")
	@Expose
	private String merchantCode;
	@SerializedName("power_purchase_unsold")
	@Expose
	private String powerPurchaseUnsold;
	@SerializedName("power_purchase_unsold2")
	@Expose
	private String powerPurchaseUnsold2;
	@SerializedName("bit48")
	@Expose
	private String bit48;
	@SerializedName("max_kwh_unit")
	@Expose
	private String maxKwhUnit;
	@SerializedName("datetime")
	@Expose
	private String datetime;
	@SerializedName("subscriber_id")
	@Expose
	private String subscriberId;
	@SerializedName("subscriber_name")
	@Expose
	private String subscriberName;
	@SerializedName("power")
	@Expose
	private int power;
	@SerializedName("switcher_refno")
	@Expose
	private String switcherRefno;
	@SerializedName("terminal_id")
	@Expose
	private String terminalId;
	@SerializedName("bit62")
	@Expose
	private String bit62;
	@SerializedName("admin_charge")
	@Expose
	private int adminCharge;
	@SerializedName("bank_code")
	@Expose
	private String bankCode;
	@SerializedName("service_unit_phone")
	@Expose
	private String serviceUnitPhone;
	@SerializedName("pln_refno")
	@Expose
	private String plnRefno;
	@SerializedName("distribution_code")
	@Expose
	private String distributionCode;
	@SerializedName("saldo")
	@Expose
	private String saldo;
	@SerializedName("subscriber_segmentation")
	@Expose
	private String subscriberSegmentation;
	@SerializedName("total_repeat")
	@Expose
	private String totalRepeat;
	@SerializedName("trx_id")
	@Expose
	private String trxId;
	@SerializedName("rc")
	@Expose
	private String rc;
	@SerializedName("material_number")
	@Expose
	private String materialNumber;
	@SerializedName("stan")
	@Expose
	private String stan;
	@SerializedName("service_unit")
	@Expose
	private String serviceUnit;
	@SerializedName("bit12")
	@Expose
	private String bit12;
	@SerializedName("bit11")
	@Expose
	private String bit11;

	public void setMerchantCode(String merchantCode){
		this.merchantCode = merchantCode;
	}

	public String getMerchantCode(){
		return merchantCode;
	}

	public void setPowerPurchaseUnsold(String powerPurchaseUnsold){
		this.powerPurchaseUnsold = powerPurchaseUnsold;
	}

	public String getPowerPurchaseUnsold(){
		return powerPurchaseUnsold;
	}

	public void setPowerPurchaseUnsold2(String powerPurchaseUnsold2){
		this.powerPurchaseUnsold2 = powerPurchaseUnsold2;
	}

	public String getPowerPurchaseUnsold2(){
		return powerPurchaseUnsold2;
	}

	public void setBit48(String bit48){
		this.bit48 = bit48;
	}

	public String getBit48(){
		return bit48;
	}

	public void setMaxKwhUnit(String maxKwhUnit){
		this.maxKwhUnit = maxKwhUnit;
	}

	public String getMaxKwhUnit(){
		return maxKwhUnit;
	}

	public void setDatetime(String datetime){
		this.datetime = datetime;
	}

	public String getDatetime(){
		return datetime;
	}

	public void setSubscriberId(String subscriberId){
		this.subscriberId = subscriberId;
	}

	public String getSubscriberId(){
		return subscriberId;
	}

	public void setSubscriberName(String subscriberName){
		this.subscriberName = subscriberName;
	}

	public String getSubscriberName(){
		return subscriberName;
	}

	public void setPower(int power){
		this.power = power;
	}

	public int getPower(){
		return power;
	}

	public void setSwitcherRefno(String switcherRefno){
		this.switcherRefno = switcherRefno;
	}

	public String getSwitcherRefno(){
		return switcherRefno;
	}

	public void setTerminalId(String terminalId){
		this.terminalId = terminalId;
	}

	public String getTerminalId(){
		return terminalId;
	}

	public void setBit62(String bit62){
		this.bit62 = bit62;
	}

	public String getBit62(){
		return bit62;
	}

	public void setAdminCharge(int adminCharge){
		this.adminCharge = adminCharge;
	}

	public int getAdminCharge(){
		return adminCharge;
	}

	public void setBankCode(String bankCode){
		this.bankCode = bankCode;
	}

	public String getBankCode(){
		return bankCode;
	}

	public void setServiceUnitPhone(String serviceUnitPhone){
		this.serviceUnitPhone = serviceUnitPhone;
	}

	public String getServiceUnitPhone(){
		return serviceUnitPhone;
	}

	public void setPlnRefno(String plnRefno){
		this.plnRefno = plnRefno;
	}

	public String getPlnRefno(){
		return plnRefno;
	}

	public void setDistributionCode(String distributionCode){
		this.distributionCode = distributionCode;
	}

	public String getDistributionCode(){
		return distributionCode;
	}

	public void setSaldo(String saldo){
		this.saldo = saldo;
	}

	public String getSaldo(){
		return saldo;
	}

	public void setSubscriberSegmentation(String subscriberSegmentation){
		this.subscriberSegmentation = subscriberSegmentation;
	}

	public String getSubscriberSegmentation(){
		return subscriberSegmentation;
	}

	public void setTotalRepeat(String totalRepeat){
		this.totalRepeat = totalRepeat;
	}

	public String getTotalRepeat(){
		return totalRepeat;
	}

	public void setTrxId(String trxId){
		this.trxId = trxId;
	}

	public String getTrxId(){
		return trxId;
	}

	public void setRc(String rc){
		this.rc = rc;
	}

	public String getRc(){
		return rc;
	}

	public void setMaterialNumber(String materialNumber){
		this.materialNumber = materialNumber;
	}

	public String getMaterialNumber(){
		return materialNumber;
	}

	public void setStan(String stan){
		this.stan = stan;
	}

	public String getStan(){
		return stan;
	}

	public void setServiceUnit(String serviceUnit){
		this.serviceUnit = serviceUnit;
	}

	public String getServiceUnit(){
		return serviceUnit;
	}

	public void setBit12(String bit12){
		this.bit12 = bit12;
	}

	public String getBit12(){
		return bit12;
	}

	public void setBit11(String bit11){
		this.bit11 = bit11;
	}

	public String getBit11(){
		return bit11;
	}

	@Override
 	public String toString(){
		return 
			"TrxPlnPrepaid{" +
			"merchant_code = '" + merchantCode + '\'' + 
			",power_purchase_unsold = '" + powerPurchaseUnsold + '\'' + 
			",power_purchase_unsold2 = '" + powerPurchaseUnsold2 + '\'' + 
			",bit48 = '" + bit48 + '\'' + 
			",max_kwh_unit = '" + maxKwhUnit + '\'' + 
			",datetime = '" + datetime + '\'' + 
			",subscriber_id = '" + subscriberId + '\'' + 
			",subscriber_name = '" + subscriberName + '\'' + 
			",power = '" + power + '\'' + 
			",switcher_refno = '" + switcherRefno + '\'' + 
			",terminal_id = '" + terminalId + '\'' + 
			",bit62 = '" + bit62 + '\'' + 
			",admin_charge = '" + adminCharge + '\'' + 
			",bank_code = '" + bankCode + '\'' + 
			",service_unit_phone = '" + serviceUnitPhone + '\'' + 
			",pln_refno = '" + plnRefno + '\'' + 
			",distribution_code = '" + distributionCode + '\'' + 
			",saldo = '" + saldo + '\'' + 
			",subscriber_segmentation = '" + subscriberSegmentation + '\'' + 
			",total_repeat = '" + totalRepeat + '\'' + 
			",trx_id = '" + trxId + '\'' + 
			",rc = '" + rc + '\'' + 
			",material_number = '" + materialNumber + '\'' + 
			",stan = '" + stan + '\'' + 
			",service_unit = '" + serviceUnit + '\'' + 
			",bit12 = '" + bit12 + '\'' + 
			",bit11 = '" + bit11 + '\'' + 
			"}";
		}
}
