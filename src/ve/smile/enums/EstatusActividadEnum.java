package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusActividadEnum {
	PENDIENTE, REALIZADA, EN_PROCESO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusActividadEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
