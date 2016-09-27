package ve.smile.enums;

import java.util.ResourceBundle;

public enum SexoEnum {
	MASCULINO, FEMENINO;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.SexoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
