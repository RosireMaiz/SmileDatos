package ve.smile.enums;

import java.util.ResourceBundle;

public enum UnidadFrecuenciaAporteEnum {
	DIA, MES, ANNO;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.UnidadFrecuenciaAporteEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
