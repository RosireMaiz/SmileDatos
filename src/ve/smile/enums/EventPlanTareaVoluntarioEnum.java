package ve.smile.enums;

import java.util.ResourceBundle;

public enum EventPlanTareaVoluntarioEnum {
	ANUAL, EXTRAORDINARIA;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EventPlanTareaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
