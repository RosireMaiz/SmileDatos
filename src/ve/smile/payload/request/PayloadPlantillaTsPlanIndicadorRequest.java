package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PlantillaTsPlanIndicador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPlantillaTsPlanIndicadorRequest extends IPayloadRequest<PlantillaTsPlanIndicador> {

	private List<PlantillaTsPlanIndicador> objetos;

	private PlantillaTsPlanIndicador objeto;

	public PayloadPlantillaTsPlanIndicadorRequest() {
		super();
	}

	@Override
	public List<PlantillaTsPlanIndicador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PlantillaTsPlanIndicador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PlantillaTsPlanIndicador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PlantillaTsPlanIndicador objeto) {
		this.objeto = objeto;
	}

}
