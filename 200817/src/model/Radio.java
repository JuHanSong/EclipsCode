package model;

public class Radio {
	String chType ="";
	int chId = 0;
	String chName;
	String chBroName;
	int chFreq;
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
	public String getChBroName() {
		return chBroName;
	}
	public void setChBroName(String chBroName) {
		this.chBroName = chBroName;
	}
	public int getChFreq() {
		return chFreq;
	}
	public void setChFreq(int chFreq) {
		this.chFreq = chFreq;
	}
	
	public Radio (String chType, int chId, String chName, String chBroName, int chFreq) {
		this.chType = chType;
		this.chId = chId;
		this.chName = chName;
		this.chBroName = chBroName;
		this.chFreq = chFreq;
	}
	
	public String toString() {
		return "Radio [channelType=" + chType + ", channelId=" + chId + ", channelName=" + chName
				+ ", broName=" + chBroName + ", frequency=" + chFreq + "]";
	}
	
	
}
