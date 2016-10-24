package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoMultimediaEnum {
	ICONO, GIT, IMAGEN,RESPALDO, GALERIA, ALBUM, BANNER;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoMultimediaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
