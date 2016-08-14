package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoInteraccionEnum {
	COMPARTIR_FACEBOOK, COMPARTIR_TWITTER;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoInteraccionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
