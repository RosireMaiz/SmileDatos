package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusTrabajoSocialPlanificadoEnum {
	PLANIFICADO, EJECUTADO, CANCELADO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle
				.getBundle("ve.smile.enums.EstatusTrabajoSocialPlanificadoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
