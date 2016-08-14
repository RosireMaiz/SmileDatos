package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PlantillaEventoIndicador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPlantillaEventoIndicadorRequest extends IPayloadRequest<PlantillaEventoIndicador> {

	private List<PlantillaEventoIndicador> objetos;

	private PlantillaEventoIndicador objeto;

	public PayloadPlantillaEventoIndicadorRequest() {
		super();
	}

	@Override
	public List<PlantillaEventoIndicador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PlantillaEventoIndicador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PlantillaEventoIndicador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PlantillaEventoIndicador objeto) {
		this.objeto = objeto;
	}

}
