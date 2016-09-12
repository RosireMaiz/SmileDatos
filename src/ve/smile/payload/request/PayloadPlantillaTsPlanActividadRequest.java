package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PlantillaTsPlanActividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPlantillaTsPlanActividadRequest extends IPayloadRequest<PlantillaTsPlanActividad> {

	private List<PlantillaTsPlanActividad> objetos;

	private PlantillaTsPlanActividad objeto;

	public PayloadPlantillaTsPlanActividadRequest() {
		super();
	}

	@Override
	public List<PlantillaTsPlanActividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PlantillaTsPlanActividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PlantillaTsPlanActividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PlantillaTsPlanActividad objeto) {
		this.objeto = objeto;
	}

}
