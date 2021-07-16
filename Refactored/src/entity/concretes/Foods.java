package entity.concretes;

import java.util.HashMap;
import java.util.Map;

public class Foods {

	private HashMap<String, Double> map;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Foods(HashMap<String, Double> map) {
		super();
		this.map = map;
	}

	public Foods() {
	}

	public HashMap<String, Double> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Double> map) {
		this.map = map;
	}

}
