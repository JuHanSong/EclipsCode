package main;
import model.Radio;
import model.TV;
import model.TVRadio;
import DataManager.ChannelManager;

public class Main {

	public static void main(String[] args) {
		
		ChannelManager channelManager = new ChannelManager();
		
		//Radio 방송 목록 추가
		channelManager.RadioDB(new Radio("Radio", 3, "A", "KBS", 100));
		channelManager.RadioDB(new Radio("Radio", 2, "B", "SBS", 101));
	    channelManager.RadioDB(new Radio("Radio", 1, "C", "MBC", 102));
		channelManager.RadioDB(new Radio("Radio", 4, "D", "YTN", 103));
		//TV 방송 목록 추가 
		channelManager.TVDB(new TV("TV", 5, "E", "KBS", 7, "지상파"));
		channelManager.TVDB(new TV("TV", 8, "F", "SBS", 5, "지상파"));
		channelManager.TVDB(new TV("TV", 7, "G", "MBC", 11, "지상파"));
		channelManager.TVDB(new TV("TV", 6, "H", "JTBC", 15, "케이블"));
		//TV/Radio 방송 목록 추가
		channelManager.TVRadioDB(new TVRadio("TVRadio", 3, "I", "KBS"));
		channelManager.TVRadioDB(new TVRadio("TVRadio", 7, "J", "MBC"));
		
		channelManager.DataSort();
	
	}

}
