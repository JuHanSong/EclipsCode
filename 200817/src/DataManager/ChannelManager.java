package DataManager;

import java.util.ArrayList;

import model.Radio;
import model.TV;
import model.TVRadio;

public class ChannelManager {
	ArrayList<Object> totalDB;

	
	public ChannelManager() {
		this.totalDB =  new ArrayList<>();
	
	}
	
	public void RadioDB(Radio radio) {
		totalDB.add(radio);
	
	}
	public void TVDB(TV tv) {
		totalDB.add(tv);
	}
	public void TVRadioDB(TVRadio tvradio) {
		totalDB.add(tvradio);
	}
	
	public void DataSort() {
		Object empty = 0;
		
		for (int i = 0; i < totalDB.size(); i ++) {
			for(int j = i+1; j < totalDB.size(); j ++) {
				if (idScan(i, totalDB.get(i)) == idScan(j, totalDB.get(j))) {
					if (chTypeScan(i, totalDB.get(i)).equals("Radio")){
						totalDB.remove(i);
					}
					else if (chTypeScan(j, totalDB.get(j)).equals("Radio")) {
						totalDB.remove(j);
					}
				
					if (chTypeScan(i, totalDB.get(i)).equals("TV")) {
						totalDB.remove(i);
					}
					else if (chTypeScan(j, totalDB.get(j)).equals("TV")) {
						totalDB.remove(j);
					}
				}	
			}
		}
		
		for (int i = 0; i < totalDB.size(); i ++) {
			for (int j = i+1; j < totalDB.size(); j ++) {
				if(idScan(i, totalDB.get(i)) == idScan(j, totalDB.get(j))){
					if(chTypeScan(i, totalDB.get(i)) == "TVRadio" || chTypeScan(j, totalDB.get(j)) == "TVRaidio") {
						
					}
				}
			}
		}
		
		for (int i = 0; i < totalDB.size(); i ++) {		
			for (int j = i +1; j < totalDB.size(); j ++) {
				if (idScan(i, totalDB.get(i)) > idScan(j, totalDB.get(j))) {
					empty = totalDB.get(i);			
					totalDB.add(i,totalDB.get(j));
					totalDB.add(j, empty);
					totalDB.remove(i+1);
					totalDB.remove(j+1);
				}
			}
			System.out.println(totalDB.get(i).toString());
		}
	}
	
	public int idScan(int index, Object obj) {
		if(totalDB.get(index).getClass().getName() == TV.class.getName()) {
			TV tv_i = (TV)totalDB.get(index);
			return tv_i.getChId();
		}else if(totalDB.get(index).getClass().getName() == Radio.class.getName()) {
			Radio radio_i = (Radio)totalDB.get(index);
			return radio_i.getChId();
		}else {
			TVRadio tvRadio_i = (TVRadio)totalDB.get(index);
			return tvRadio_i.getChId();
		}
	}
	
	public String chTypeScan(int index, Object obj) {
		if(totalDB.get(index).getClass().getName() == TV.class.getName()) {
			TV tv = (TV)totalDB.get(index);
			return tv.getChType();
		}else if(totalDB.get(index).getClass().getName() == Radio.class.getName()) {
			Radio radio = (Radio)totalDB.get(index);
			return radio.getChType();
		}else {
			TVRadio tvRadio = (TVRadio)totalDB.get(index);
			return tvRadio.getChType();
		}
	}
	
	
}
