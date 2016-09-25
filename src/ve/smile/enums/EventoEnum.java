package ve.smile.enums;

import java.util.ResourceBundle;

public enum EventoEnum {
	ANUAL, EXTRAORDINARIA;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EventoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
