package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoNodoMenuEnum {
	RAIZ, CARPETA, TRANSACCION;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoNodoMenuEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
