package ve.smile.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.dto.PlantillaTsPlanIndicador;
import lights.core.payload.response.IPayloadResponse;

public class PayloadPlantillaTsPlanIndicadorResponse implements IPayloadResponse<PlantillaTsPlanIndicador> {

	private HashMap<String, Object> informacion;

	private List<PlantillaTsPlanIndicador> objetos;

	public PayloadPlantillaTsPlanIndicadorResponse() {
		super();
		this.informacion = new HashMap<String, Object>();
	}

	@Override
	public Object getInformacion(String key) {
		return informacion.get(key);
	}

	@Override
	public void setInformacion(String key, Object informacion) {
		this.informacion.put(key, informacion);
	}

	@Override
	public List<PlantillaTsPlanIndicador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PlantillaTsPlanIndicador> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
