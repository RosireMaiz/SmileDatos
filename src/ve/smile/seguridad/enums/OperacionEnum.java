package ve.smile.seguridad.enums;

import java.util.ResourceBundle;

public enum OperacionEnum {
	CUSTOM5, INCLUIR, MODIFICAR, ELIMINAR, CONSULTAR, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, NONE;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.seguridad.enums.OperacionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
