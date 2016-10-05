package ve.smile.enums;

import java.util.ResourceBundle;

public enum ProcedenciaMensajeEnum {
	PORTAL, MOVIL;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle
				.getBundle("ve.smile.enums.ProcedenciaMensajeEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
