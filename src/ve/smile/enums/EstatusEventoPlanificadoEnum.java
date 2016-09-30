package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusEventoPlanificadoEnum {
	POSTULADO,
		PLANIFICADO,
			RECHAZADO,
		POR_PLANIFICAR;
	

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusEventoPlanificadoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
