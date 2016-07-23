package ve.smile.seguridad.enums;

import java.util.ResourceBundle;

public enum TipoNodoMenuEnum {
	RAIZ, CARPETA, TRANSACCION;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.seguridad.enums.TipoNodoMenuEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
