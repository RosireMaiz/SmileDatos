package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoContactoPortalEnum {
	PREGUNTA, CONTACTO, SUGERENCIA;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoContactoPortalEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
