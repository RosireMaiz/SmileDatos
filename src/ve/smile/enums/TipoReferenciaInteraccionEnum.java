package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoReferenciaInteraccionEnum {
	POSTULADO, NOTICIA, EVENTO, TRABAJO_SOCIAL, ALBUM;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoReferenciaInteraccionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
