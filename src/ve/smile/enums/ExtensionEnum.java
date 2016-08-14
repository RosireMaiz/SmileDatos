package ve.smile.enums;

import java.util.ResourceBundle;

public enum ExtensionEnum {
	JPG, PNG, JPEG, PDF, DOC, DOCX, XLSX, XLS, ZIP, RAR;

	@Override
	public String toString() {
		ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.enums.ExtensionEnum");

		return operacionBundle.getString(this.ordinal() + ".descripcion");
	}

}
