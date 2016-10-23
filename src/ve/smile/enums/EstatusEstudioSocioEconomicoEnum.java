package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusEstudioSocioEconomicoEnum {
	NO_REALIZADO, REALIZADO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusEstudioSocioEconomicoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
