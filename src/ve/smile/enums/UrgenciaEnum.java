package ve.smile.enums;

import java.util.ResourceBundle;

public enum UrgenciaEnum {
	ALTA, MEDIA, BAJA;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.seguridad.enums.UrgenciaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
