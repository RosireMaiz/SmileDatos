package ve.smile.enums;

import java.util.ResourceBundle;

public enum PropiedadEnum {
	ORGANIZACION, DONATIVO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.PropiedadEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
