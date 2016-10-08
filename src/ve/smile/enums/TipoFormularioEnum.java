package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoFormularioEnum {
	PADRINO, VOLUNTARIO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoFormularioEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
