package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusColaboradorEnum {
	ACTIVO, INACTIVO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle
				.getBundle("ve.smile.enums.EstatusTrabajadorEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
