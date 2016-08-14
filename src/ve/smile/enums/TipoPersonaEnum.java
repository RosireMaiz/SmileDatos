package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoPersonaEnum {
	JURIDICA, NATURAL;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoPersonaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
