package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoDonativoCuentaBancariaEnum {
	ORIGEN, DESTINATARIO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoDonativoCuentaBancariaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
