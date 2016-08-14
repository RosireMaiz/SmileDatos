package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoCuentaEnum {
	ORGANIZACION, DONATIVO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoCuentaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
