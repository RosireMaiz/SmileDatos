package ve.smile.enums;

import java.util.ResourceBundle;

public enum ProcedenciaEnum {
	EVENTO, PADRINO, TRABAJO_SOCIAL, COLABORADOR, PATROCINADOR;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle
				.getBundle("ve.smile.enums.ProcedenciaEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
