package ve.smile.enums;

import java.util.ResourceBundle;

public enum RolMovilEnum {
	VOLUNTARIO, COLABORADOR, TRABAJADOR, PADRINO;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.RolMovilEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
