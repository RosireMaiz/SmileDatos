package ve.smile.enums;

import java.util.ResourceBundle;

public enum EventPlanTareaEnum {
	PENDIENTE, REALIZADA,PROCESO;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EventPlanTareaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
