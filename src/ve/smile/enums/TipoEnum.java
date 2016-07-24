package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoEnum {
	ICONO, GIT, IMAGEN;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.seguridad.enums.TipoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
