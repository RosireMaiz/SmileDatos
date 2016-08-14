package ve.smile.enums;

import java.util.ResourceBundle;

public enum TipoReconocimientoEnum {
	PADRINO, VOLUNTARIO, COLABORADOR, PATROCINADOR, TRABAJADOR;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.TipoReconocimientoEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
