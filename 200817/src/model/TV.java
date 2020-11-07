package model;

public class TV {
	String chType = "";
	int chId = 0;
	String ChName = "";
	String broName = "";
	int chNum = 0;
	String etc = "";
	public String getChType() {
		return chType;
	}
	public void setChType(String chType) {
		this.chType = chType;
	}
	public int getChId() {
		return chId;
	}
	public void setChId(int chId) {
		this.chId = chId;
	}
	public String getChName() {
		return ChName;
	}
	public void setChName(String chName) {
		ChName = chName;
	}
	public String getBroName() {
		return broName;
	}
	public void setBroName(String broName) {
		this.broName = broName;
	}
	public int getChNum() {
		return chNum;
	}
	public void setChNum(int chNum) {
		this.chNum = chNum;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}

	public TV (String chType, int chId, String chName, String broName, int chNum, String etc) {
		this.chType = chType;
		this.chId = chId;
		this.ChName = chName;
		this.broName = broName;
		this.chNum = chNum;
		this.etc = etc;
	}
	
	public String toString() {
		return "TV [channelType=" + chType + ", channelId=" + chId + ", channelName=" + ChName
				+ ", broName=" + broName + ", channelNumber=" + chNum + ", etc=" + etc + "]";
	}
	
}
