package ve.smile.enums;

import java.util.ResourceBundle;

public enum PropietarioEnum {
	ORGANIZACION, DONATIVO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.PropietarioEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
