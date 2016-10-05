package ve.smile.enums;

import java.util.ResourceBundle;

public enum RecepcionEnum {
	TRANSACCION_BANCARIA, OFICINA, EVENTO, OTRO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.RecepcionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
