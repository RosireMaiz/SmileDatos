package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusPostuladoEnum {
	POSTULADO, POR_COMPLETAR, ACTIVO, INACTIVO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusPostuladoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
