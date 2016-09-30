package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusCapacitacionPlanificadaEnum {
	PLANIFICADA,EJECUTADA,CANCELADA;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusCapacitacionPlanificadaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
