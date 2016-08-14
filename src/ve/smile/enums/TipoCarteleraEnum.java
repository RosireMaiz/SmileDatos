package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoCarteleraEnum {
	NOTICIAS, PUBLICIDAD, NECESIDAD;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoCarteleraEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
