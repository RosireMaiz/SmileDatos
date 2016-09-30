package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoEventoEnum {
	ANUAL, EXTRAORDINARIA;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoEventoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
