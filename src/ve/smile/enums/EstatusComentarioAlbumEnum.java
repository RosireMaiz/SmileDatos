package ve.smile.enums;

import java.util.ResourceBundle;

public enum EstatusComentarioAlbumEnum {
	PENDIENTE,PUBLICADO,OCULTO;
	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.EstatusComentarioAlbumEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}
}
