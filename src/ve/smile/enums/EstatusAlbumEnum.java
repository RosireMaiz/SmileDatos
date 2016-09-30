package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusAlbumEnum {
	PUBLICADO,OCULTO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusAlbumEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
