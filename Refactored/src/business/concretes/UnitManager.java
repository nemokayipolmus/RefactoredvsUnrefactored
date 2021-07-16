package business.concretes;

import entity.concretes.Unit;

public class UnitManager {

	public double convertUnitToGram(Unit unit, Double amount) {
		double result = (unit.getGram() * amount);
		return result;
	}

}
