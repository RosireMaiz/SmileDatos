package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoDifusionEnum {
	SMS, CORREO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoDifusionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
