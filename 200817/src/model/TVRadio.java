package model;

public class TVRadio {
	String chType = "";
	int chId = 0;
	String chName = "";
	String broName = "";
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
		return chName;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	public String getBroName() {
		return broName;
	}
	public void setBroName(String broName) {
		this.broName = broName;
	}
	
	public TVRadio(String chType, int chId, String chName, String broName) {
		this.chType = chType;
		this.chId = chId;
		this.chName = chName;
		this.broName = broName;
	}
	
	public String toString() {
		return "TVRadio [channelType=" + chType + ", channelId=" + chId + ", channelName=" + chName
				+ ", broName=" + broName + "]";
	}

}
