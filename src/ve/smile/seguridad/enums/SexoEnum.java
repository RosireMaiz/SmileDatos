package ve.smile.seguridad.enums;

import java.util.ResourceBundle;

public enum SexoEnum {
	MASCULINO, FEMENINO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.seguridad.enums.SexoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
