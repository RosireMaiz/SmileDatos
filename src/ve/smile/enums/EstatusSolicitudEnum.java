package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusSolicitudEnum {
	PENDIENTE, EN_PROCESO, APROBADA, RECHAZADA,PROCESADA;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusSolicitudEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
