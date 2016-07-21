package ve.smile.enums;

import java.util.ResourceBundle;

public enum OperacionEnum {
	CUSTOM5, INCLUIR, MODIFICAR, ELIMINAR, CONSULTAR, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.OperacionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
