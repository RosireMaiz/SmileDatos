package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoReferenciaNotificacionEnum {
	ACTIVIDAD, TAREA, EVENTO, TRABAJO_SOCIAL, DIFUSION, RECONOCIMIENTO, CAPACITACION;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoReferenciaNotificacionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
