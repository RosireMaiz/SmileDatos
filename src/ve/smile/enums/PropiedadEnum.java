package ve.smile.enums;

import java.util.ResourceBundle;

public enum PropiedadEnum {
	ORGANIZACION, DONATIVO, INFO_MOVIL, APK;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.PropiedadEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
