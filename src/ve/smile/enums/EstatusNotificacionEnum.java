package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusNotificacionEnum {
	LEIDA,PENDIENTE;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusNotificacionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
