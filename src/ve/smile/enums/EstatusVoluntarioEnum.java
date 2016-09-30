package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusVoluntarioEnum {
	POSTULADO, POR_COMPLETAR, ACTIVO, INACTIVO,RECHAZADO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusPostuladoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
