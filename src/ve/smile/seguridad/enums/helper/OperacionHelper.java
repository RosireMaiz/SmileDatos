package ve.smile.seguridad.enums.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import ve.smile.seguridad.dto.IconSclass;
import ve.smile.seguridad.dto.Operacion;
import ve.smile.seguridad.dto.Sclass;
import ve.smile.seguridad.enums.OperacionEnum;

public class OperacionHelper {

	private static ResourceBundle operacionBundle = ResourceBundle.getBundle("ve.smile.seguridad.enums.helper.Operacion");

	public static List<Operacion> getAll() {
		List<Operacion> all = new ArrayList<Operacion>();
		
		for(OperacionEnum operacionGridEnum: OperacionEnum.values()) {
			all.add(getPorType(operacionGridEnum));
		}
		
		return all;
	}

	public static Operacion getPorType(OperacionEnum operacionEnum) {
		String nombre = operacionBundle.getString(operacionEnum.name() + ".nombre");
		String iconSclass = operacionBundle.getString(operacionEnum.name() + ".iconSclass");
		String sclass = operacionBundle.getString(operacionEnum.name() + ".sclass");
		String tooltiptext = operacionBundle.getString(operacionEnum.name() + ".tooltiptext");
		
		return new Operacion(operacionEnum.ordinal(), nombre, 
				new IconSclass(iconSclass), 
				new Sclass(sclass), 
				tooltiptext);
	}
	
	public static Operacion getPorId(Integer id) {
		return getPorType(OperacionEnum.values()[id]);
	}
}