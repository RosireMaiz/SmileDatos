package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusEventoPlanificadoEnum {
		PLANIFICADO,
		EJECUTADO,
		POSTULADO,
		RECHAZADO,
		CANCELADO;
		
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusEventoPlanificadoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
