package ve.smile.enums;

import java.util.ResourceBundle;

public enum PropiedadEnum {
	ORGANIZACION, DONATIVO, INFO_MOVIL, APK, EMAIL_COMENTARIO_ALBUM,
	EMAIL_CONTACTANOS, EMAIL_FAQ, EMAIL_BUZON, EMAIL_POSTULACION_VOLUNTARIO,
	EMAIL_POSTULACION_PADRINO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.PropiedadEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
