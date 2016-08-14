package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusContactoEnum {
	PROCESADA, PENDIENTE, DECLINADA;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusContactoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
